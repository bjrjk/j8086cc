package com.renjikai.j8086cc.intermediate;

public class InterDefines {
	// DataType(u,i,c), AllocateSize, VarName
	public final static String varTypeFormat = "%c_%d_%s";
	public final static String tmpVarFormat = "$TMPVAR_%s$";
	public final static String localVarFormat = "$LOCALVAR_%s$";
	public final static String globalVarFormat = "$GLOBALVAR_%s$";
	
	public final static String DSEG_HEAD = ".data";
	public final static String CSEG_HEAD = ".code";
	public final static String DECL_HEAD = ".var";
	public final static String FUNC_HEAD = ".fun";
	public final static String FUNC_TAIL = ".endfun";
	
	public final static String MOVI = "movi";
	public final static String MOV = "mov";
	public final static String MOVRM = "movrm";
	public final static String MOVMR = "movmr";
	public final static String ADD = "add";
	public final static String SUB = "sub";
	public final static String MUL = "mul";
	public final static String DIV = "div";
	public final static String MOD = "mod";
	public final static String LT = "lt";
	public final static String LE = "le";
	public final static String GE = "ge";
	public final static String GT = "gt";
	public final static String EQ = "eq";
	public final static String NE = "ne";
	public final static String LAND = "land";
	public final static String LOR = "lor";
	public final static String JNZ = "jnz";
	public final static String JZ = "jz";
	public final static String JMP = "jmp";
	public final static String CALL = "call";
	public final static String RET = "ret";
	
	public final static String UINT = "uint";
	public final static String INT = "int";
	public final static String CHAR = "char";
}
