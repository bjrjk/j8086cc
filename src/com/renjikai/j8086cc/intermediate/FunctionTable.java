package com.renjikai.j8086cc.intermediate;

import java.util.HashMap;

public class FunctionTable {
	public HashMap<String,Function> functionTable;
	
	public FunctionTable() {
		this.functionTable=new HashMap<String,Function>();
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
