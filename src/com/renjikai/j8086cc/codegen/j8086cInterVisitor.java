// Generated from j8086cInter.g4 by ANTLR 4.8
package com.renjikai.j8086cc.codegen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link j8086cInterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface j8086cInterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link j8086cInterParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(j8086cInterParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086cInterParser#dataSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSegment(j8086cInterParser.DataSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086cInterParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(j8086cInterParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086cInterParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(j8086cInterParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086cInterParser#codeSegment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeSegment(j8086cInterParser.CodeSegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086cInterParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(j8086cInterParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MOVI}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMOVI(j8086cInterParser.MOVIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MOV}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMOV(j8086cInterParser.MOVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MOVRM}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMOVRM(j8086cInterParser.MOVRMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MOVMR}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMOVMR(j8086cInterParser.MOVMRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LEA}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLEA(j8086cInterParser.LEAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(j8086cInterParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUB(j8086cInterParser.SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMUL(j8086cInterParser.MULContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIV(j8086cInterParser.DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MOD}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMOD(j8086cInterParser.MODContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LT}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLT(j8086cInterParser.LTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LE}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLE(j8086cInterParser.LEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GE}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGE(j8086cInterParser.GEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GT}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGT(j8086cInterParser.GTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQ(j8086cInterParser.EQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NE}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNE(j8086cInterParser.NEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LAND}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAND(j8086cInterParser.LANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOR}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOR(j8086cInterParser.LORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LNOT}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLNOT(j8086cInterParser.LNOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JNZ}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJNZ(j8086cInterParser.JNZContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JZ}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJZ(j8086cInterParser.JZContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JMP}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJMP(j8086cInterParser.JMPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CALL}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCALL(j8086cInterParser.CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RET}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRET(j8086cInterParser.RETContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LABEL}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLABEL(j8086cInterParser.LABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalVarDecl}
	 * labeled alternative in {@link j8086cInterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDecl(j8086cInterParser.LocalVarDeclContext ctx);
}