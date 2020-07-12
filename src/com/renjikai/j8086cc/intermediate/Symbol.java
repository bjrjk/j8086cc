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
	public boolean isParameter;
	public boolean isArray;
	public int dimension;
	public ArrayList<Integer> arrayDimSize,arrDimPostProduct;
	
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
		this.isParameter=false;
		this.dimension=0;
		this.arrayDimSize=null;
		this.arrDimPostProduct=null;
	}
	
	public Symbol(String name,int dataType,int scope,boolean isParameter) {
		this(name,dataType,scope);
		this.isParameter=isParameter;
		if(isParameter)this.allocateSize=InterDefines.stackDataSize;
	}
	
	public Symbol(String name,int dataType,int scope,boolean isParameter,ArrayList<Integer> arrayDimSize) {
		this(name,dataType,scope,arrayDimSize);
		this.isParameter=isParameter;
		if(isParameter)this.allocateSize=InterDefines.stackDataSize;
		this.isArray=true;
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
		this.arrDimPostProduct=new ArrayList<Integer>();
		while(arrDimPostProduct.size()!=arrayDimSize.size())
			arrDimPostProduct.add(0);
		arrDimPostProduct.set(arrDimPostProduct.size()-1, 1);
		for(int i=arrDimPostProduct.size()-2;i>=0;i--) {
			arrDimPostProduct.set(i, arrDimPostProduct.get(i+1)*arrayDimSize.get(i+1));
		}
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
	
	//Perform Semantic Check before Calling this function
	public int getDimensionSize(int dim) {
		return arrDimPostProduct.get(dim);
	}
	
	@Override
	public String toString() {
		String varType;
		varType=String.format(InterDefines.varTypeFormat, 
				typeID[this.dataType],
				this.allocateSize,
				this.name
						);
		if(this.scope==SymbolTable.TMP_VAR) {
			varType=String.format(InterDefines.varTmpTypeFormat, 
					typeID[this.dataType],
					this.allocateSize,
					this.name
							);
		}
		String formatRef;
		switch(this.scope) {
		case SymbolTable.GLOBAL_VAR:
			formatRef=InterDefines.globalVarFormat;
			break;
		case SymbolTable.LOCAL_VAR:
			if(!this.isParameter)
				formatRef=InterDefines.localVarFormat;
			else
				formatRef=InterDefines.paramVarFormat;
			break;
		default: //case SymbolTable.TMP_VAR
			formatRef=InterDefines.tmpVarFormat;
			break;
		}
		String interVarName=String.format(formatRef, varType);
		return interVarName;
	}
}
