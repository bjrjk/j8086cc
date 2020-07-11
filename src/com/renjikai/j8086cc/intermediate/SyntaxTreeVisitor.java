package com.renjikai.j8086cc.intermediate;

import com.renjikai.j8086cc.antlr.j8086ccBaseVisitor;
import com.renjikai.j8086cc.antlr.j8086ccParser;

public class SyntaxTreeVisitor extends j8086ccBaseVisitor<String> {
	
	@Override

	public String visitProgram(j8086ccParser.ProgramContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitFunction(j8086ccParser.FunctionContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitParamList(j8086ccParser.ParamListContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitParameter(j8086ccParser.ParameterContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitVarDeclare(j8086ccParser.VarDeclareContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitVarType(j8086ccParser.VarTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitBlock(j8086ccParser.BlockContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitLeftValue(j8086ccParser.LeftValueContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitSubBlock(j8086ccParser.SubBlockContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitVarDeclStat(j8086ccParser.VarDeclStatContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitIfSyntax(j8086ccParser.IfSyntaxContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitWhileSyntax(j8086ccParser.WhileSyntaxContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitDoWhileSyntax(j8086ccParser.DoWhileSyntaxContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitBreakSyntax(j8086ccParser.BreakSyntaxContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitContinueSyntax(j8086ccParser.ContinueSyntaxContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitReturnSyntax(j8086ccParser.ReturnSyntaxContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitLValueAssign(j8086ccParser.LValueAssignContext ctx) {
		return visitChildren(ctx);
	}

	@Override

	public String visitExprStat(j8086ccParser.ExprStatContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLogicOrExpr(j8086ccParser.LogicOrExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitEqExpr(j8086ccParser.EqExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitUnaryExpr(j8086ccParser.UnaryExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLogicAndExpr(j8086ccParser.LogicAndExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIntLiteral(j8086ccParser.IntLiteralContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionCallExpr(j8086ccParser.FunctionCallExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLValueExpr(j8086ccParser.LValueExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitRelExpr(j8086ccParser.RelExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitHighArithExpr(j8086ccParser.HighArithExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLowArithExpr(j8086ccParser.LowArithExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitParenExpr(j8086ccParser.ParenExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExprList(j8086ccParser.ExprListContext ctx) {
		return visitChildren(ctx);
	}
}
