package com.renjikai.j8086cc.intermediate;

import java.util.ArrayList;

public class Function {
	public int retType;
	public String name;
	public ArrayList<Symbol> paramList;

	public Function(int retType, String name) {
		this.retType = retType;
		this.name = name;
		this.paramList = new ArrayList<Symbol>();
	}
}
