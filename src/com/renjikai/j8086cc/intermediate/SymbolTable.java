package com.renjikai.j8086cc.intermediate;

import java.util.HashMap;

public class SymbolTable {
	public final static int LOCAL_VAR=0;
	public final static int GLOBAL_VAR=1;
	public final static int TMP_VAR=2;
	
	public HashMap<String,Symbol> globalSymbolTable,localSymbolTable;
	
	public SymbolTable(HashMap<String,Symbol> globalSymbolTable) {
		this.globalSymbolTable=globalSymbolTable;
		this.localSymbolTable=new HashMap<String,Symbol>();
	}
	
	public boolean insert(Symbol s) {
		if(s.scope==GLOBAL_VAR) {
			if(!globalSymbolTable.containsKey(s.name)) {
				globalSymbolTable.put(s.name,s);
				return true;
			}else return false;
		}else {
			if(!localSymbolTable.containsKey(s.name)) {
				localSymbolTable.put(s.name,s);
				return true;
			}else return false;
		}
	}
	
	public Symbol query(String name) {
		if(localSymbolTable.containsKey(name))
			return localSymbolTable.get(name);
		else if(globalSymbolTable.containsKey(name))
			return globalSymbolTable.get(name);
		else
			return null;
	}
	
}
