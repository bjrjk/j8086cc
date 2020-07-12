package com.renjikai.j8086cc.intermediate;

import java.util.HashMap;

public class FunctionTable {
	public HashMap<String,Function> functionTable;
	
	public FunctionTable() {
		this.functionTable=new HashMap<String,Function>();
		Function putchar=new Function(Symbol.TYPE_INT,"putchar");
		putchar.paramList.add(new Symbol("ASCIICode",Symbol.TYPE_CHAR,SymbolTable.LOCAL_VAR,true));
		this.functionTable.put("putchar", putchar);
		Function getchar=new Function(Symbol.TYPE_CHAR,"getchar");
		this.functionTable.put("getchar", getchar);
	}
	
	public boolean insert(Function s) {
			if(!functionTable.containsKey(s.name)) {
				functionTable.put(s.name,s);
				return true;
			}else 
				return false;
	}
	
	public Function query(String name) {
		if(functionTable.containsKey(name))
			return functionTable.get(name);
		else
			return null;
	}
	
}
