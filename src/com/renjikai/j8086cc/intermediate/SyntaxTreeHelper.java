package com.renjikai.j8086cc.intermediate;

import java.util.ArrayList;

import com.renjikai.j8086cc.antlr.j8086ccParser;

public class SyntaxTreeHelper {
	public static ArrayList<Symbol> packVariable(j8086ccParser.VarDeclareContext ctx,int scope) {
		ArrayList<Symbol> arr=new ArrayList<Symbol>();
		j8086ccParser.VarTypeContext varTypeRef=ctx.varType();
		int varBasicType;
		switch(varTypeRef.basicType().getText()) {
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
		}
		return arr;
	}
}
