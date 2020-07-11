package com.renjikai.j8086cc.intermediate;

import java.util.ArrayList;

public class Symbol {
	public final static int TYPE_UINT=0;
	public final static int TYPE_INT=1;
	public final static int TYPE_CHAR=2;
	public final static char typeID[]= {'u','i','c'};
	
	public String name;
	public int dataType;
	public int scope;
	public int dataSize;
	public int allocateSize;
	public boolean isArray;
	public int dimension;
	public ArrayList<Integer> arrayDimSize;
	
	public Symbol(String name,int dataType,int scope) {
		this.name=name;
		this.dataType=dataType;
		this.scope=scope;
		switch(dataType) {
			case TYPE_UINT:
			case TYPE_INT:
				this.dataSize=2;
				this.allocateSize=2;
				break;
			case TYPE_CHAR:
				this.dataSize=1;
				this.allocateSize=1;
				break;
		}
		this.isArray=false;
		this.dimension=0;
		this.arrayDimSize=null;
	}
	
	public Symbol(String name,int dataType,int scope,ArrayList<Integer> arrayDimSize) {
		this.name=name;
		this.dataType=dataType;
		this.scope=scope;
		int arraySize=1;
		for(int i=0;i<arrayDimSize.size();i++) {
			arraySize*=arrayDimSize.get(i);
		}
		switch(dataType) {
			case TYPE_UINT:
			case TYPE_INT:
				this.dataSize=2;
				break;
			case TYPE_CHAR:
				this.dataSize=1;
				break;
		}
		this.allocateSize=this.dataSize*arraySize;
		this.isArray=true;
		this.dimension=arrayDimSize.size();
		this.arrayDimSize=arrayDimSize;
	}
	
	//Perform Semantic Check before Calling this function
	public int getElementAddress(ArrayList<Integer> arrayDimIndex) {
		if(!this.isArray||arrayDimIndex==null)return 0;
		int elementIndex=0;
		for(int i=0;i<arrayDimIndex.size();i++) {
			elementIndex*=this.arrayDimSize.get(i);
			elementIndex+=arrayDimIndex.get(i);
		}
		return this.dataSize*elementIndex;
	}
	
	@Override
	public String toString() {
		String varType=String.format(InterDefines.varTypeFormat, 
				typeID[this.dataType],
				this.allocateSize,
				this.name
						);
		String formatRef;
		switch(this.scope) {
		case SymbolTable.GLOBAL_VAR:
			formatRef=InterDefines.globalVarFormat;
			break;
		case SymbolTable.LOCAL_VAR:
			formatRef=InterDefines.localVarFormat;
			break;
		default: //case SymbolTable.TMP_VAR
			formatRef=InterDefines.tmpVarFormat;
			break;
		}
		String interVarName=String.format(formatRef, varType);
		return interVarName;
	}
}