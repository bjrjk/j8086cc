package com.renjikai.j8086cc.intermediate;

public class InterDefines {
	// DataType(u,i,c), AllocateSize, VarName
	public final static String varTypeFormat = "%c_%d_@%s";
	public final static String varTmpTypeFormat = "%c_%d_@t%s";
	public final static String tmpVarFormat = "$TMPVAR_%s$";
	public final static String localVarFormat = "$LOCALVAR_%s$";
	public final static String paramVarFormat = "$PARAMVAR_%s$";
	public final static String globalVarFormat = "$GLOBALVAR_%s$";
	public final static int stackDataSize = 2;
	
	public final static String DSEG_HEAD = ".data";
	public final static String CSEG_HEAD = ".code";
	public final static String DECL_HEAD = ".var";
	public final static String FUNC_HEAD = ".fun";
	public final static String FUNC_TAIL = ".endfun";
	
	public final static String MOVI = "movi %s, %d";
	public final static String MOV = "mov %s, %s";
	public final static String MOVRM = "movrm %s, [%s]";
	public final static String MOVMR = "movmr [%s], %s";
	public final static String LEA = "lea %s, %s";
	public final static String ADD = "add %s, %s, %s";
	public final static String SUB = "sub %s, %s, %s";
	public final static String MUL = "mul %s, %s, %s";
	public final static String DIV = "div %s, %s, %s";
	public final static String MOD = "mod %s, %s, %s";
	public final static String LT = "lt %s, %s, %s";
	public final static String LE = "le %s, %s, %s";
	public final static String GE = "ge %s, %s, %s";
	public final static String GT = "gt %s, %s, %s";
	public final static String EQ = "eq %s, %s, %s";
	public final static String NE = "ne %s, %s, %s";
	public final static String LAND = "land %s, %s, %s";
	public final static String LOR = "lor %s, %s, %s";
	public final static String LNOT = "lnot %s, %s";
	public final static String JNZ = "jnz %s, L%d";
	public final static String JZ = "jz %s, L%d";
	public final static String JMP = "jmp L%d";
	public final static String CALL = "call %s,%s%s";
	public final static String RET = "ret %s";
	
	public final static String LABEL = "L%d:";
	
	public final static String UINT = "uint";
	public final static String INT = "int";
	public final static String CHAR = "char";
}
