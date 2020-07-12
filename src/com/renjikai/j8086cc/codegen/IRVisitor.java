package com.renjikai.j8086cc.codegen;

public class IRVisitor extends j8086cInterBaseVisitor<String> {

	@Override
	public String visitMOD(j8086cInterParser.MODContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLT(j8086cInterParser.LTContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLE(j8086cInterParser.LEContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitGE(j8086cInterParser.GEContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitGT(j8086cInterParser.GTContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitEQ(j8086cInterParser.EQContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitNE(j8086cInterParser.NEContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLAND(j8086cInterParser.LANDContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLOR(j8086cInterParser.LORContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLNOT(j8086cInterParser.LNOTContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitJNZ(j8086cInterParser.JNZContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitJZ(j8086cInterParser.JZContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitJMP(j8086cInterParser.JMPContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCALL(j8086cInterParser.CALLContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitRET(j8086cInterParser.RETContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLABEL(j8086cInterParser.LABELContext ctx) {
		return visitChildren(ctx);
	}
}
