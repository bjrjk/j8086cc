// Generated from j8086cc.g4 by ANTLR 4.8
package com.renjikai.j8086cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link j8086ccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface j8086ccVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(j8086ccParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(j8086ccParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(j8086ccParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(j8086ccParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#varDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclare(j8086ccParser.VarDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(j8086ccParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(j8086ccParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#leftValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftValue(j8086ccParser.LeftValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subBlock}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubBlock(j8086ccParser.SubBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclStat}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStat(j8086ccParser.VarDeclStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSyntax}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSyntax(j8086ccParser.IfSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSyntax}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSyntax(j8086ccParser.WhileSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileSyntax}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileSyntax(j8086ccParser.DoWhileSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakSyntax}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakSyntax(j8086ccParser.BreakSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueSyntax}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueSyntax(j8086ccParser.ContinueSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnSyntax}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSyntax(j8086ccParser.ReturnSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lValueAssign}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValueAssign(j8086ccParser.LValueAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link j8086ccParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(j8086ccParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOrExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrExpr(j8086ccParser.LogicOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(j8086ccParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(j8086ccParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicAndExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndExpr(j8086ccParser.LogicAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(j8086ccParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(j8086ccParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lValueExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValueExpr(j8086ccParser.LValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(j8086ccParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code highArithExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighArithExpr(j8086ccParser.HighArithExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lowArithExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowArithExpr(j8086ccParser.LowArithExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link j8086ccParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(j8086ccParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(j8086ccParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link j8086ccParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(j8086ccParser.BasicTypeContext ctx);
}