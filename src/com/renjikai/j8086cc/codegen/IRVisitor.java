package com.renjikai.j8086cc.codegen;

import java.util.HashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

import com.renjikai.j8086cc.intermediate.Symbol;
import com.renjikai.j8086cc.intermediate.Counter;

public class IRVisitor extends j8086cInterBaseVisitor<String> {
	public String dataSegStr="";
	public String codeSegStr="";
	public HashMap<String,Integer> funcBPCnter=new HashMap<String,Integer>();
	public HashMap<String,String> funcEndLabel=new HashMap<String,String>();
	public HashMap<String,Integer> varBPShift=new HashMap<String,Integer>();
	public HashMap<String,Integer> paramCnter=new HashMap<String,Integer>();
	public Counter lblCnter=new Counter();
	public String curGlobalFunc="";
	
	public static String getFullText(ParserRuleContext ctx) {
		int s = ctx.start.getStartIndex();
		int e = ctx.stop.getStopIndex();
		Interval interval = new Interval(s, e);
		return ctx.start.getInputStream().getText(interval);
	}
	public String getNewLabel() {
		return "LI"+lblCnter.getNewStringID();
	}
	public Integer getVarBPShiftPostion(String funcName,String varName,j8086cInterParser.VarNameContext ctx) {
		if(varBPShift.containsKey(varName))return varBPShift.get(varName);
		Integer tmpBPShift=funcBPCnter.get(funcName);
		tmpBPShift-=Integer.valueOf(ctx.INT().getText());
		varBPShift.put(varName, tmpBPShift);
		funcBPCnter.put(funcName, tmpBPShift);
		return tmpBPShift;
	}
	public String getFuncName(ParserRuleContext ctx) {
		while(ctx!=null) {
			if(ctx instanceof j8086cInterParser.FunctionContext) {
				j8086cInterParser.FunctionContext ctxF=
						(j8086cInterParser.FunctionContext)ctx;
				return ctxF.IDENTIFIER().getText();
			}
			ctx=ctx.getParent();
		}
		return null;
	}
	public String formatVarBPShift(j8086cInterParser.VarNameContext varName) {
		if(varName.scope.getType()==j8086cInterParser.GLOB_SCOPE)
			return varName.IDENTIFIER().getText();
		Integer shift=getVarBPShiftPostion(curGlobalFunc,varName.getText(),varName);
		return String.format("[BP%s%d]", (shift>=0?"+":"") ,shift);
	}
	public int getVarTypeSize(j8086cInterParser.VarNameContext varName) {
		return Integer.valueOf(varName.INT().getText());
	}
	public int getVarType(j8086cInterParser.VarNameContext varName) {
		switch(varName.dataType.getType()) {
			case j8086cInterParser.TYPE_UINT:
				return Symbol.TYPE_UINT;
			case j8086cInterParser.TYPE_INT:
				return Symbol.TYPE_INT;
			default:
				return Symbol.TYPE_CHAR;
		}
	}
	
	@Override
	public String visitProgram(j8086cInterParser.ProgramContext ctx) {
		dataSegStr=visit(ctx.dataSegment());
		codeSegStr=visit(ctx.codeSegment());
		return dataSegStr+"\n\n"+codeSegStr;
	}
	
	@Override
	public String visitDataSegment(j8086cInterParser.DataSegmentContext ctx) {
		String res="";
		for(int i=0;i<ctx.varDecl().size();i++) {
			res+=visit(ctx.varDecl(i).varName());
		}
		return res;
	}
	
	@Override
	public String visitVarName(j8086cInterParser.VarNameContext ctx) {
		return String.format("%s DB %d Dup(0)\n",
				ctx.IDENTIFIER().getText(),
				Integer.valueOf(ctx.INT().getText())
				);
	}


	@Override
	public String visitCodeSegment(j8086cInterParser.CodeSegmentContext ctx) {
		for(int i=0;i<ctx.function().size();i++) {
			funcBPCnter.put(ctx.function(i).IDENTIFIER().getText(), -12);
		}
		String res="";
		for(int i=0;i<ctx.function().size();i++) {
			res+=visit(ctx.function(i));
		}
		return res;
	}

	@Override
	public String visitFunction(j8086cInterParser.FunctionContext ctx) {
		String funcName=ctx.IDENTIFIER().getText();
		curGlobalFunc=funcName;
		String funcBegin=String.format("%s PROC\n", funcName)+
				(funcName.equals("main")?"mov AX,data\nmov DS,AX\nmov BP,SP\n":"PROTECT_SITE\n");
		String endLabel=getNewLabel();
		funcEndLabel.put(funcName, endLabel);
		int paramCount=0;
		for(int i=0;i<ctx.statement().size();i++) {
			if(!(ctx.statement(i) instanceof j8086cInterParser.LocalVarDeclContext))continue;
			j8086cInterParser.VarNameContext curVar=
					((j8086cInterParser.LocalVarDeclContext)ctx.statement(i)).varDecl().varName();
			if(curVar.scope.getType()==j8086cInterParser.PARAM_SCOPE) {
				paramCount++;
				varBPShift.put(curVar.getText(), paramCount*2+2);
			}else
				getVarBPShiftPostion(funcName,curVar.getText(),curVar);
		}
		paramCnter.put(funcName, paramCount);
		String stmt="";
		for(int i=0;i<ctx.statement().size();i++) {
			if(ctx.statement(i) instanceof j8086cInterParser.LocalVarDeclContext)continue;
			stmt+=visit(ctx.statement(i));
		}
		String endLabelL=endLabel+":\n";
		int finalStackSize=funcBPCnter.get(funcName);
		String subSP=String.format("sub SP,%d\n", finalStackSize);
		String addSP=String.format("add SP,%d\n", finalStackSize);
		String funcEnd=(funcName.equals("main")?"mov AH,4Ch\nmov AL,0\nint 21h\n":String.format("RESTORE_SITE %d\n", paramCount*2))+
				String.format("%s ENDP\n", funcName);
		return funcBegin+addSP+stmt+endLabelL+subSP+funcEnd;
	}

	
	@Override
	public String visitMOVI(j8086cInterParser.MOVIContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift=formatVarBPShift(ctx.varName());
		if(getVarTypeSize(ctx.varName())==1)
			return dbg+String.format("mov BYTE PTR %s,%s%s\n", 
					varShift,ctx.SUB()==null?"":"-",ctx.INT().getText()
					);
		else //size==2
			return dbg+String.format("mov WORD PTR %s,%s%s\n", 
					varShift,ctx.SUB()==null?"":"-",ctx.INT().getText()
					);
	}

	
	@Override
	public String visitMOV(j8086cInterParser.MOVContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		 String s1,s2;
		 if(getVarTypeSize(ctx.varName(1))==1)
			 s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
		 else //size==2
			 s1=String.format("mov AX,WORD PTR %s\n", varShift1);
		 if(getVarTypeSize(ctx.varName(0))==1)
			 s2=String.format("mov BYTE PTR %s,AL\n", varShift0);
		 else //size==2
			 s2=String.format("mov WORD PTR %s,AX\n", varShift0);
		 return dbg+s1+s2;
	}

	
	@Override
	public String visitMOVRM(j8086cInterParser.MOVRMContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String s1=String.format("mov BX,WORD PTR %s\n", varShift1);
		String s2=String.format("mov AX,[BX]\n");
		String s3;
		if(getVarTypeSize(ctx.varName(0))==1)
			 s3=String.format("mov BYTE PTR %s,AL\n", varShift0);
		 else //size==2
			 s3=String.format("mov WORD PTR %s,AX\n", varShift0);
		return dbg+s1+s2+s3;
	}
	
	@Override
	public String visitMOVMR(j8086cInterParser.MOVMRContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String s1=String.format("mov BX,WORD PTR %s\n", varShift0);
		String s2=String.format("mov AX,WORD PTR %s\n", varShift1);
		String s3;
		if(getVarTypeSize(ctx.varName(0))==1)
			 s3=String.format("mov [BX],AL\n");
		 else //size==2
			 s3=String.format("mov [BX],AX\n");
		return dbg+s1+s2+s3;
	}

	@Override
	public String visitLEA(j8086cInterParser.LEAContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String s1=String.format("lea AX,%s\n", varShift1);
		String s2=String.format("mov %s,AX\n", varShift0);
		return dbg+s1+s2;
	}

	
	@Override
	public String visitADD(j8086cInterParser.ADDContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String s1,s2,s3;
		if(getVarTypeSize(ctx.varName(0))==1) {
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("add AL,BYTE PTR %s\n", varShift2);
			s3=String.format("mov %s,AL\n", varShift0);
		}else {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("add AX,WORD PTR %s\n", varShift2);
			s3=String.format("mov %s,AX\n", varShift0);	
		}
		return dbg+s1+s2+s3;
	}

	
	@Override
	public String visitSUB(j8086cInterParser.SUBContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String s1,s2,s3;
		if(getVarTypeSize(ctx.varName(0))==1) {
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("sub AL,BYTE PTR %s\n", varShift2);
			s3=String.format("mov %s,AL\n", varShift0);
		}else {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("sub AX,WORD PTR %s\n", varShift2);
			s3=String.format("mov %s,AX\n", varShift0);	
		}
		return dbg+s1+s2+s3;
	}

	
	@Override
	public String visitMUL(j8086cInterParser.MULContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String s1,s2,s3;
		int type=getVarType(ctx.varName(0));
		if(type==Symbol.TYPE_UINT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("mul WORD PTR %s\n", varShift2);
			s3=String.format("mov %s,AX\n", varShift0);
		}else if(type==Symbol.TYPE_INT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("imul WORD PTR %s\n", varShift2);
			s3=String.format("mov %s,AX\n", varShift0);
		}else { //type==Symbol.TYPE_CHAR
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("imul BYTE PTR %s\n", varShift2);
			s3=String.format("mov %s,AL\n", varShift0);
		}
		return dbg+s1+s2+s3;
	}

	
	@Override
	public String visitDIV(j8086cInterParser.DIVContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String s0,s1,s2,s3;
		int type=getVarType(ctx.varName(0));
		if(type==Symbol.TYPE_UINT) {
			s0="mov DX,0\n";
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("div WORD PTR %s\n", varShift2);
			s3=String.format("mov %s,AX\n", varShift0);
		}else if(type==Symbol.TYPE_INT) {
			s0="mov DX,0\n";
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("idiv WORD PTR %s\n", varShift2);
			s3=String.format("mov %s,AX\n", varShift0);
		}else { //type==Symbol.TYPE_CHAR
			s0="mov AH,0\n";
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("idiv BYTE PTR %s\n", varShift2);
			s3=String.format("mov %s,AL\n", varShift0);
		}
		return dbg+s0+s1+s2+s3;
	}

	
	@Override
	public String visitMOD(j8086cInterParser.MODContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String s0,s1,s2,s3;
		int type=getVarType(ctx.varName(0));
		if(type==Symbol.TYPE_UINT) {
			s0="mov DX,0\n";
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("div WORD PTR %s\n", varShift2);
			s3=String.format("mov %s,DX\n", varShift0);
		}else if(type==Symbol.TYPE_INT) {
			s0="mov DX,0\n";
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("idiv WORD PTR %s\n", varShift2);
			s3=String.format("mov %s,DX\n", varShift0);
		}else { //type==Symbol.TYPE_CHAR
			s0="mov AH,0\n";
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("idiv BYTE PTR %s\n", varShift2);
			s3=String.format("mov %s,AH\n", varShift0);
		}
		return dbg+s0+s1+s2+s3;
	}

	
	@Override
	public String visitLT(j8086cInterParser.LTContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		String s1,s2,s3,s4,s5,s6,s7,s8;
		int type=getVarType(ctx.varName(1));
		if(type==Symbol.TYPE_UINT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jb %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else if(type==Symbol.TYPE_INT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jl %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else { //type==Symbol.TYPE_CHAR
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("cmp AL, BYTE PTR %s\n", varShift2);
			s3=String.format("jl %s\n", lbl1);
			s4=String.format("mov BYTE PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov BYTE PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}
		return dbg+s1+s2+s3+s4+s5+s6+s7+s8;
	}

	
	@Override
	public String visitLE(j8086cInterParser.LEContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		String s1,s2,s3,s4,s5,s6,s7,s8;
		int type=getVarType(ctx.varName(1));
		if(type==Symbol.TYPE_UINT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jbe %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else if(type==Symbol.TYPE_INT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jle %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else { //type==Symbol.TYPE_CHAR
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("cmp AL, BYTE PTR %s\n", varShift2);
			s3=String.format("jle %s\n", lbl1);
			s4=String.format("mov BYTE PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov BYTE PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}
		return dbg+s1+s2+s3+s4+s5+s6+s7+s8;
	}

	
	@Override
	public String visitGE(j8086cInterParser.GEContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		String s1,s2,s3,s4,s5,s6,s7,s8;
		int type=getVarType(ctx.varName(1));
		if(type==Symbol.TYPE_UINT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jae %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else if(type==Symbol.TYPE_INT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jge %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else { //type==Symbol.TYPE_CHAR
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("cmp AL, BYTE PTR %s\n", varShift2);
			s3=String.format("jge %s\n", lbl1);
			s4=String.format("mov BYTE PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov BYTE PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}
		return dbg+s1+s2+s3+s4+s5+s6+s7+s8;
	}

	
	@Override
	public String visitGT(j8086cInterParser.GTContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		String s1,s2,s3,s4,s5,s6,s7,s8;
		int type=getVarType(ctx.varName(1));
		if(type==Symbol.TYPE_UINT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("ja %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else if(type==Symbol.TYPE_INT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jg %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else { //type==Symbol.TYPE_CHAR
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("cmp AL, BYTE PTR %s\n", varShift2);
			s3=String.format("jg %s\n", lbl1);
			s4=String.format("mov BYTE PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov BYTE PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}
		return dbg+s1+s2+s3+s4+s5+s6+s7+s8;
	}

	
	@Override
	public String visitEQ(j8086cInterParser.EQContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		String s1,s2,s3,s4,s5,s6,s7,s8;
		int type=getVarType(ctx.varName(1));
		if(type==Symbol.TYPE_UINT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("je %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else if(type==Symbol.TYPE_INT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("je %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else { //type==Symbol.TYPE_CHAR
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("cmp AL, BYTE PTR %s\n", varShift2);
			s3=String.format("je %s\n", lbl1);
			s4=String.format("mov BYTE PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov BYTE PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}
		return dbg+s1+s2+s3+s4+s5+s6+s7+s8;
	}

	
	@Override
	public String visitNE(j8086cInterParser.NEContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		String s1,s2,s3,s4,s5,s6,s7,s8;
		int type=getVarType(ctx.varName(1));
		if(type==Symbol.TYPE_UINT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jne %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else if(type==Symbol.TYPE_INT) {
			s1=String.format("mov AX,WORD PTR %s\n", varShift1);
			s2=String.format("cmp AX, WORD PTR %s\n", varShift2);
			s3=String.format("jne %s\n", lbl1);
			s4=String.format("mov WORD PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov WORD PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}else { //type==Symbol.TYPE_CHAR
			s1=String.format("mov AL,BYTE PTR %s\n", varShift1);
			s2=String.format("cmp AL, BYTE PTR %s\n", varShift2);
			s3=String.format("jne %s\n", lbl1);
			s4=String.format("mov BYTE PTR %s,0\n", varShift0);
			s5=String.format("jmp %s\n", lbl2);
			s6=String.format("%s:\n", lbl1);
			s7=String.format("mov BYTE PTR %s,1\n", varShift0);
			s8=String.format("%s:\n", lbl2);
		}
		return dbg+s1+s2+s3+s4+s5+s6+s7+s8;
	}

	
	@Override
	public String visitLAND(j8086cInterParser.LANDContext ctx) { //TODO
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		String s1,s2,s3,s4,s5,s6,s7,s8,s9;
		s1=String.format("cmp WORD PTR %s,0\n", varShift1);
		s2=String.format("jz %s\n", lbl1);
		s3=String.format("cmp WORD PTR %s,0\n", varShift2);
		s4=String.format("jz %s\n", lbl1);
		s5=String.format("mov WORD PTR %s,1\n", varShift0);
		s6=String.format("jmp %s\n",lbl2);
		s7=String.format("%s:\n", lbl1);
		s8=String.format("mov WORD PTR %s,0\n", varShift0);
		s9=String.format("%s:\n", lbl2);
		return dbg+s1+s2+s3+s4+s5+s6+s7+s8+s9;
	}

	
	@Override
	public String visitLOR(j8086cInterParser.LORContext ctx) { //TODO
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String varShift2=formatVarBPShift(ctx.varName(2));
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		String s1,s2,s3,s4,s5,s6,s7,s8,s9;
		s1=String.format("cmp WORD PTR %s,0\n", varShift1);
		s2=String.format("jnz %s\n", lbl1);
		s3=String.format("cmp WORD PTR %s,0\n", varShift2);
		s4=String.format("jnz %s\n", lbl1);
		s5=String.format("mov WORD PTR %s,0\n", varShift0);
		s6=String.format("jmp %s\n",lbl2);
		s7=String.format("%s:\n", lbl1);
		s8=String.format("mov WORD PTR %s,1\n", varShift0);
		s9=String.format("%s:\n", lbl2);
		return dbg+s1+s2+s3+s4+s5+s6+s7+s8+s9;
	}

	
	@Override
	public String visitLNOT(j8086cInterParser.LNOTContext ctx) { //TODO
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift0=formatVarBPShift(ctx.varName(0));
		String varShift1=formatVarBPShift(ctx.varName(1));
		String s1,s2,s3,s4,s5,s6,s7;
		String lbl1=getNewLabel(),lbl2=getNewLabel();
		s1=String.format("cmp WORD PTR %s,0\n", varShift1);
		s2=String.format("jz %s\n", lbl1);
		s3=String.format("mov WORD PTR %s,0\n", varShift0);
		s4=String.format("jmp %s\n",lbl2);
		s5=String.format("%s:\n", lbl1);
		s6=String.format("mov WORD PTR %s,1\n", varShift0);
		s7=String.format("%s:\n", lbl2);
		return dbg+s1+s2+s3+s4+s5+s6+s7;
	}

	
	@Override
	public String visitJNZ(j8086cInterParser.JNZContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift=formatVarBPShift(ctx.varName());
		String s1=String.format("mov AX,WORD PTR %s\n", varShift);
		String s2="cmp AX,0\n";
		String s3=String.format("jnz %s\n",ctx.LBL().getText());
		return dbg+s1+s2+s3;
	}

	
	@Override
	public String visitJZ(j8086cInterParser.JZContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String varShift=formatVarBPShift(ctx.varName());
		String s1=String.format("mov AX,WORD PTR %s\n", varShift);
		String s2="cmp AX,0\n";
		String s3=String.format("jz %s\n",ctx.LBL().getText());
		return dbg+s1+s2+s3;
	}

	
	@Override
	public String visitJMP(j8086cInterParser.JMPContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		return dbg+String.format("jmp %s\n",ctx.LBL().getText());
	}


	@Override
	public String visitCALL(j8086cInterParser.CALLContext ctx) { //TODO
		String dbg="; "+getFullText(ctx)+"\n";
		String res="";
		for(int i=ctx.varName().size()-1;i>0;i--) {
			String varShift=formatVarBPShift(ctx.varName(i));
			res+=String.format("mov AX,WORD PTR %s\n", varShift);
			res+="push AX\n";
		}
		String varShift0=formatVarBPShift(ctx.varName(0));
		res+=String.format("call %s\n", ctx.IDENTIFIER().getText());
		res+=String.format("mov WORD PTR %s, AX\n", varShift0);
		return dbg+res;
	}


	@Override
	public String visitRET(j8086cInterParser.RETContext ctx) {
		String dbg="; "+getFullText(ctx)+"\n";
		String funcName=getFuncName(ctx);
		Integer dataSize=Integer.valueOf(ctx.varName().INT().getText());
		String retIns="";
		if(dataSize==1) 
			retIns=String.format("mov AL,%s\n", 
					formatVarBPShift(ctx.varName())
					);
		else
			retIns=String.format("mov AX,%s\n", 
					formatVarBPShift(ctx.varName())
					);
		String restore=String.format("jmp %s\n", 
				funcEndLabel.get(funcName)
				);
		return dbg+retIns+restore;
	}

	
	@Override
	public String visitLABEL(j8086cInterParser.LABELContext ctx) {
		return ctx.getText()+"\n";
	}

}
