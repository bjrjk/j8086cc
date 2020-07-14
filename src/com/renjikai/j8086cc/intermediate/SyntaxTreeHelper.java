package com.renjikai.j8086cc.intermediate;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import com.renjikai.j8086cc.antlr.j8086ccParser;

public class SyntaxTreeHelper {
	
	public static int funcTypeStr2IntType(String s) {
		int varBasicType;
		switch(s) {
			case InterDefines.UINT:
				varBasicType=Symbol.TYPE_UINT;
				break;
			case InterDefines.INT:
				varBasicType=Symbol.TYPE_INT;
				break;
			default: //case InterDefines.CHAR
				varBasicType=Symbol.TYPE_CHAR;
				break;
		}
		return varBasicType;
	}
	
	public static ArrayList<Symbol> packVariable(j8086ccParser.VarDeclareContext ctx,int scope,String funcName) {
		ArrayList<Symbol> arr=new ArrayList<Symbol>();
		j8086ccParser.VarTypeContext varTypeRef=ctx.varType();
		int varBasicType=funcTypeStr2IntType(varTypeRef.basicType().getText());
		ArrayList<Integer> arrayDimSize=null;
		if(varTypeRef.INT().size()!=0) {
			arrayDimSize=new ArrayList<Integer>();
			for(int i=0;i<varTypeRef.INT().size();i++) {
				arrayDimSize.add(Integer.valueOf(varTypeRef.INT(i).getText()));
			}
		}
		for(int i=0;i<ctx.IDENTIFIER().size();i++) {
			String varName=ctx.IDENTIFIER(i).getText();
			Symbol templateSymbol;
			if(arrayDimSize==null)
				templateSymbol=new Symbol(varName,varBasicType,scope);
			else
				templateSymbol=new Symbol(varName,varBasicType,scope,arrayDimSize);
			templateSymbol.funcName=funcName;
			arr.add(templateSymbol);
		}
		return arr;
	}
	
	public static Symbol packParameter(j8086ccParser.ParameterContext ctx,String funcName) {
		j8086ccParser.VarTypeContext varTypeRef=ctx.varType();
		int varBasicType=funcTypeStr2IntType(varTypeRef.basicType().getText());
		ArrayList<Integer> arrayDimSize=null;
		if(varTypeRef.INT().size()!=0) {
			arrayDimSize=new ArrayList<Integer>();
			for(int i=0;i<varTypeRef.INT().size();i++) {
				arrayDimSize.add(Integer.valueOf(varTypeRef.INT(i).getText()));
			}
		}
		String varName=ctx.IDENTIFIER().getText();
		Symbol s;
		if(arrayDimSize==null)
			s=new Symbol(varName,varBasicType,SymbolTable.LOCAL_VAR,true);
		else
			s=new Symbol(varName,varBasicType,SymbolTable.LOCAL_VAR,true,arrayDimSize);
		s.funcName=funcName;
		return s;
	}
	
	public static Function packFunctionHeader(j8086ccParser.FunctionContext ctx) {
		String funcName=ctx.IDENTIFIER().getText();
		int retType=funcTypeStr2IntType(ctx.basicType().getText());
		Function newFunc=new Function(retType,funcName);
		ArrayList<Symbol> paramList=newFunc.paramList;
		if(ctx.paramList()==null)return newFunc;
		List<j8086ccParser.ParameterContext> params=ctx.paramList().parameter();
		for(int i=0;i<params.size();i++) {
			paramList.add(packParameter(params.get(i),funcName));
		}
		return newFunc;
	}
	
	public static Symbol genTmpFatherNode(Counter cnter,Symbol s1,Symbol s2) {
		if(s2==null)return new Symbol(cnter.getNewStringID(),
				s1.dataType,
				SymbolTable.TMP_VAR
				);
		Symbol res=new Symbol(cnter.getNewStringID(),
				Math.min(s1.dataType, s2.dataType),
				SymbolTable.TMP_VAR
				);
		return res;
	}
	
	public static Symbol genIntLiteralNode(Counter cnter) {
		Symbol res=new Symbol(cnter.getNewStringID(),
				Symbol.TYPE_INT,
				SymbolTable.TMP_VAR
				);
		return res;
	}
	
	public static String getFatherFuncName(ParserRuleContext ctx) {
		if(ctx==null)return null;
		while(ctx!=null) {
			if(ctx instanceof j8086ccParser.FunctionContext) {
				return ((j8086ccParser.FunctionContext) ctx).IDENTIFIER().getText();
			}
			ctx=ctx.getParent();
		}
		return null;
	}
	
	public static SymbolTable getSymbolTable(ParseTreeProperty<SymbolTable> symbolTableTree, ParserRuleContext ctx) {
		if(symbolTableTree==null||ctx==null)return null;
		while(ctx!=null) {
			if(ctx instanceof j8086ccParser.FunctionContext) {
				return symbolTableTree.get(ctx);
			}
			ctx=ctx.getParent();
		}
		return null;
	}
	
	public static Integer getCtlBeforeLabel(ParseTreeProperty<Integer> CtlBeforeLabel, ParserRuleContext ctx) {
		if(CtlBeforeLabel==null||ctx==null)return null;
		while(ctx!=null) {
			if(ctx instanceof j8086ccParser.WhileSyntaxContext ||
				ctx instanceof j8086ccParser.DoWhileSyntaxContext) {
				return CtlBeforeLabel.get(ctx);
			}
			ctx=ctx.getParent();
		}
		return null;
	}
	
	public static Integer getCtlAfterLabel(ParseTreeProperty<Integer> CtlAfterLabel, ParserRuleContext ctx) {
		if(CtlAfterLabel==null||ctx==null)return null;
		while(ctx!=null) {
			if(ctx instanceof j8086ccParser.WhileSyntaxContext ||
				ctx instanceof j8086ccParser.DoWhileSyntaxContext) {
				return CtlAfterLabel.get(ctx);
			}
			ctx=ctx.getParent();
		}
		return null;
	}
	
	
}
