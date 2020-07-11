// Generated from j8086cInter.g4 by ANTLR 4.8
package com.renjikai.j8086cc.codegen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class j8086cInterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, TYPE_UINT=24, 
		TYPE_INT=25, TYPE_CHAR=26, GLOB_SCOPE=27, LOC_SCOPE=28, TMP_SCOPE=29, 
		DSEG_HEAD=30, CSEG_HEAD=31, DECL_HEAD=32, FUNC_HEAD=33, FUNC_TAIL=34, 
		LBL=35, ADD=36, SUB=37, MUL=38, DIV=39, MOD=40, NOT=41, EQ=42, NE=43, 
		LT=44, LE=45, GE=46, GT=47, IDENTIFIER=48, INT=49, WS=50, COMMENT=51;
	public static final int
		RULE_program = 0, RULE_dataSegment = 1, RULE_varDecl = 2, RULE_varName = 3, 
		RULE_codeSegment = 4, RULE_function = 5, RULE_statement = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dataSegment", "varDecl", "varName", "codeSegment", "function", 
			"statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'_'", "'mov'", "','", "'add'", "'sub'", "'mul'", "'div'", 
			"'mod'", "'lt'", "'le'", "'ge'", "'gt'", "'eq'", "'ne'", "'land'", "'lor'", 
			"'jnz'", "'jz'", "'jmp'", "'call'", "'ret'", "':'", "'u'", "'i'", "'c'", 
			"'GLOBALVAR_'", "'LOCALVAR_'", "'TMPVAR_'", "'.data'", "'.code'", "'.var'", 
			"'.fun'", "'.endfun'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", 
			"'=='", "'!='", "'<'", "'<='", "'>='", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TYPE_UINT", "TYPE_INT", "TYPE_CHAR", "GLOB_SCOPE", "LOC_SCOPE", "TMP_SCOPE", 
			"DSEG_HEAD", "CSEG_HEAD", "DECL_HEAD", "FUNC_HEAD", "FUNC_TAIL", "LBL", 
			"ADD", "SUB", "MUL", "DIV", "MOD", "NOT", "EQ", "NE", "LT", "LE", "GE", 
			"GT", "IDENTIFIER", "INT", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "j8086cInter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public j8086cInterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public DataSegmentContext dataSegment() {
			return getRuleContext(DataSegmentContext.class,0);
		}
		public CodeSegmentContext codeSegment() {
			return getRuleContext(CodeSegmentContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			dataSegment();
			setState(15);
			codeSegment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSegmentContext extends ParserRuleContext {
		public TerminalNode DSEG_HEAD() { return getToken(j8086cInterParser.DSEG_HEAD, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public DataSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSegment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitDataSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSegmentContext dataSegment() throws RecognitionException {
		DataSegmentContext _localctx = new DataSegmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(DSEG_HEAD);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECL_HEAD) {
				{
				{
				setState(18);
				varDecl();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode DECL_HEAD() { return getToken(j8086cInterParser.DECL_HEAD, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(DECL_HEAD);
			setState(25);
			varName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarNameContext extends ParserRuleContext {
		public Token scope;
		public Token dataType;
		public TerminalNode INT() { return getToken(j8086cInterParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(j8086cInterParser.IDENTIFIER, 0); }
		public TerminalNode GLOB_SCOPE() { return getToken(j8086cInterParser.GLOB_SCOPE, 0); }
		public TerminalNode LOC_SCOPE() { return getToken(j8086cInterParser.LOC_SCOPE, 0); }
		public TerminalNode TMP_SCOPE() { return getToken(j8086cInterParser.TMP_SCOPE, 0); }
		public TerminalNode TYPE_UINT() { return getToken(j8086cInterParser.TYPE_UINT, 0); }
		public TerminalNode TYPE_INT() { return getToken(j8086cInterParser.TYPE_INT, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(j8086cInterParser.TYPE_CHAR, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(28);
			((VarNameContext)_localctx).scope = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GLOB_SCOPE) | (1L << LOC_SCOPE) | (1L << TMP_SCOPE))) != 0)) ) {
				((VarNameContext)_localctx).scope = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(29);
			((VarNameContext)_localctx).dataType = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_UINT) | (1L << TYPE_INT) | (1L << TYPE_CHAR))) != 0)) ) {
				((VarNameContext)_localctx).dataType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(30);
			match(T__1);
			setState(31);
			match(INT);
			setState(32);
			match(T__1);
			setState(33);
			match(IDENTIFIER);
			setState(34);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeSegmentContext extends ParserRuleContext {
		public TerminalNode CSEG_HEAD() { return getToken(j8086cInterParser.CSEG_HEAD, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CodeSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeSegment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitCodeSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeSegmentContext codeSegment() throws RecognitionException {
		CodeSegmentContext _localctx = new CodeSegmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_codeSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(CSEG_HEAD);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				function();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC_HEAD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC_HEAD() { return getToken(j8086cInterParser.FUNC_HEAD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(j8086cInterParser.IDENTIFIER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode FUNC_TAIL() { return getToken(j8086cInterParser.FUNC_TAIL, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(FUNC_HEAD);
			setState(43);
			match(IDENTIFIER);
			setState(44);
			statement();
			setState(45);
			match(FUNC_TAIL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RETContext extends StatementContext {
		public RETContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitRET(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ADDContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public ADDContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SUBContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public SUBContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitSUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CALLContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(j8086cInterParser.IDENTIFIER, 0); }
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public CALLContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitCALL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MODContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public MODContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitMOD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public MULContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitMUL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LTContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public LTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LANDContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public LANDContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EQContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public EQContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JMPContext extends StatementContext {
		public TerminalNode LBL() { return getToken(j8086cInterParser.LBL, 0); }
		public JMPContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitJMP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GTContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public GTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitGT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LORContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public LORContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DIVContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public DIVContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JZContext extends StatementContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode LBL() { return getToken(j8086cInterParser.LBL, 0); }
		public JZContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitJZ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MOVIContext extends StatementContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(j8086cInterParser.INT, 0); }
		public TerminalNode SUB() { return getToken(j8086cInterParser.SUB, 0); }
		public MOVIContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitMOVI(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MOVContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public MOVContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitMOV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NEContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public NEContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitNE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JNZContext extends StatementContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode LBL() { return getToken(j8086cInterParser.LBL, 0); }
		public JNZContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitJNZ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LEContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public LEContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LABELContext extends StatementContext {
		public TerminalNode LBL() { return getToken(j8086cInterParser.LBL, 0); }
		public LABELContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GEContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public GEContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitGE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new MOVIContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__2);
				setState(48);
				varName();
				setState(49);
				match(T__3);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(50);
					match(SUB);
					}
				}

				setState(53);
				match(INT);
				}
				break;
			case 2:
				_localctx = new MOVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__2);
				setState(56);
				varName();
				setState(57);
				match(T__3);
				setState(58);
				varName();
				}
				break;
			case 3:
				_localctx = new ADDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__4);
				setState(61);
				varName();
				setState(62);
				match(T__3);
				setState(63);
				varName();
				setState(64);
				match(T__3);
				setState(65);
				varName();
				}
				break;
			case 4:
				_localctx = new SUBContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(T__5);
				setState(68);
				varName();
				setState(69);
				match(T__3);
				setState(70);
				varName();
				setState(71);
				match(T__3);
				setState(72);
				varName();
				}
				break;
			case 5:
				_localctx = new MULContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(T__6);
				setState(75);
				varName();
				setState(76);
				match(T__3);
				setState(77);
				varName();
				setState(78);
				match(T__3);
				setState(79);
				varName();
				}
				break;
			case 6:
				_localctx = new DIVContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				match(T__7);
				setState(82);
				varName();
				setState(83);
				match(T__3);
				setState(84);
				varName();
				setState(85);
				match(T__3);
				setState(86);
				varName();
				}
				break;
			case 7:
				_localctx = new MODContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				match(T__8);
				setState(89);
				varName();
				setState(90);
				match(T__3);
				setState(91);
				varName();
				setState(92);
				match(T__3);
				setState(93);
				varName();
				}
				break;
			case 8:
				_localctx = new LTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				match(T__9);
				setState(96);
				varName();
				setState(97);
				match(T__3);
				setState(98);
				varName();
				setState(99);
				match(T__3);
				setState(100);
				varName();
				}
				break;
			case 9:
				_localctx = new LEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				match(T__10);
				setState(103);
				varName();
				setState(104);
				match(T__3);
				setState(105);
				varName();
				setState(106);
				match(T__3);
				setState(107);
				varName();
				}
				break;
			case 10:
				_localctx = new GEContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
				match(T__11);
				setState(110);
				varName();
				setState(111);
				match(T__3);
				setState(112);
				varName();
				setState(113);
				match(T__3);
				setState(114);
				varName();
				}
				break;
			case 11:
				_localctx = new GTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(116);
				match(T__12);
				setState(117);
				varName();
				setState(118);
				match(T__3);
				setState(119);
				varName();
				setState(120);
				match(T__3);
				setState(121);
				varName();
				}
				break;
			case 12:
				_localctx = new EQContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(123);
				match(T__13);
				setState(124);
				varName();
				setState(125);
				match(T__3);
				setState(126);
				varName();
				setState(127);
				match(T__3);
				setState(128);
				varName();
				}
				break;
			case 13:
				_localctx = new NEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(130);
				match(T__14);
				setState(131);
				varName();
				setState(132);
				match(T__3);
				setState(133);
				varName();
				setState(134);
				match(T__3);
				setState(135);
				varName();
				}
				break;
			case 14:
				_localctx = new LANDContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(137);
				match(T__15);
				setState(138);
				varName();
				setState(139);
				match(T__3);
				setState(140);
				varName();
				setState(141);
				match(T__3);
				setState(142);
				varName();
				}
				break;
			case 15:
				_localctx = new LORContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(144);
				match(T__16);
				setState(145);
				varName();
				setState(146);
				match(T__3);
				setState(147);
				varName();
				setState(148);
				match(T__3);
				setState(149);
				varName();
				}
				break;
			case 16:
				_localctx = new JNZContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(151);
				match(T__17);
				setState(152);
				varName();
				setState(153);
				match(T__3);
				setState(154);
				match(LBL);
				}
				break;
			case 17:
				_localctx = new JZContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(156);
				match(T__18);
				setState(157);
				varName();
				setState(158);
				match(T__3);
				setState(159);
				match(LBL);
				}
				break;
			case 18:
				_localctx = new JMPContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(161);
				match(T__19);
				setState(162);
				match(LBL);
				}
				break;
			case 19:
				_localctx = new CALLContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(163);
				match(T__20);
				setState(164);
				match(IDENTIFIER);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(165);
					match(T__3);
					setState(166);
					varName();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 20:
				_localctx = new RETContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(172);
				match(T__21);
				}
				break;
			case 21:
				_localctx = new LABELContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(173);
				match(LBL);
				setState(174);
				match(T__22);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\7"+
		"\3\26\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\6\6)\n\6\r\6\16\6*\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5"+
		"\b\66\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16\b"+
		"\u00ad\13\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2"+
		"\35\37\3\2\32\34\2\u00c4\2\20\3\2\2\2\4\23\3\2\2\2\6\32\3\2\2\2\b\35\3"+
		"\2\2\2\n&\3\2\2\2\f,\3\2\2\2\16\u00b1\3\2\2\2\20\21\5\4\3\2\21\22\5\n"+
		"\6\2\22\3\3\2\2\2\23\27\7 \2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2"+
		"\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32\33\7\"\2"+
		"\2\33\34\5\b\5\2\34\7\3\2\2\2\35\36\7\3\2\2\36\37\t\2\2\2\37 \t\3\2\2"+
		" !\7\4\2\2!\"\7\63\2\2\"#\7\4\2\2#$\7\62\2\2$%\7\3\2\2%\t\3\2\2\2&(\7"+
		"!\2\2\')\5\f\7\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\13\3\2\2\2"+
		",-\7#\2\2-.\7\62\2\2./\5\16\b\2/\60\7$\2\2\60\r\3\2\2\2\61\62\7\5\2\2"+
		"\62\63\5\b\5\2\63\65\7\6\2\2\64\66\7\'\2\2\65\64\3\2\2\2\65\66\3\2\2\2"+
		"\66\67\3\2\2\2\678\7\63\2\28\u00b2\3\2\2\29:\7\5\2\2:;\5\b\5\2;<\7\6\2"+
		"\2<=\5\b\5\2=\u00b2\3\2\2\2>?\7\7\2\2?@\5\b\5\2@A\7\6\2\2AB\5\b\5\2BC"+
		"\7\6\2\2CD\5\b\5\2D\u00b2\3\2\2\2EF\7\b\2\2FG\5\b\5\2GH\7\6\2\2HI\5\b"+
		"\5\2IJ\7\6\2\2JK\5\b\5\2K\u00b2\3\2\2\2LM\7\t\2\2MN\5\b\5\2NO\7\6\2\2"+
		"OP\5\b\5\2PQ\7\6\2\2QR\5\b\5\2R\u00b2\3\2\2\2ST\7\n\2\2TU\5\b\5\2UV\7"+
		"\6\2\2VW\5\b\5\2WX\7\6\2\2XY\5\b\5\2Y\u00b2\3\2\2\2Z[\7\13\2\2[\\\5\b"+
		"\5\2\\]\7\6\2\2]^\5\b\5\2^_\7\6\2\2_`\5\b\5\2`\u00b2\3\2\2\2ab\7\f\2\2"+
		"bc\5\b\5\2cd\7\6\2\2de\5\b\5\2ef\7\6\2\2fg\5\b\5\2g\u00b2\3\2\2\2hi\7"+
		"\r\2\2ij\5\b\5\2jk\7\6\2\2kl\5\b\5\2lm\7\6\2\2mn\5\b\5\2n\u00b2\3\2\2"+
		"\2op\7\16\2\2pq\5\b\5\2qr\7\6\2\2rs\5\b\5\2st\7\6\2\2tu\5\b\5\2u\u00b2"+
		"\3\2\2\2vw\7\17\2\2wx\5\b\5\2xy\7\6\2\2yz\5\b\5\2z{\7\6\2\2{|\5\b\5\2"+
		"|\u00b2\3\2\2\2}~\7\20\2\2~\177\5\b\5\2\177\u0080\7\6\2\2\u0080\u0081"+
		"\5\b\5\2\u0081\u0082\7\6\2\2\u0082\u0083\5\b\5\2\u0083\u00b2\3\2\2\2\u0084"+
		"\u0085\7\21\2\2\u0085\u0086\5\b\5\2\u0086\u0087\7\6\2\2\u0087\u0088\5"+
		"\b\5\2\u0088\u0089\7\6\2\2\u0089\u008a\5\b\5\2\u008a\u00b2\3\2\2\2\u008b"+
		"\u008c\7\22\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7\6\2\2\u008e\u008f\5"+
		"\b\5\2\u008f\u0090\7\6\2\2\u0090\u0091\5\b\5\2\u0091\u00b2\3\2\2\2\u0092"+
		"\u0093\7\23\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\6\2\2\u0095\u0096\5"+
		"\b\5\2\u0096\u0097\7\6\2\2\u0097\u0098\5\b\5\2\u0098\u00b2\3\2\2\2\u0099"+
		"\u009a\7\24\2\2\u009a\u009b\5\b\5\2\u009b\u009c\7\6\2\2\u009c\u009d\7"+
		"%\2\2\u009d\u00b2\3\2\2\2\u009e\u009f\7\25\2\2\u009f\u00a0\5\b\5\2\u00a0"+
		"\u00a1\7\6\2\2\u00a1\u00a2\7%\2\2\u00a2\u00b2\3\2\2\2\u00a3\u00a4\7\26"+
		"\2\2\u00a4\u00b2\7%\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00ab\7\62\2\2\u00a7"+
		"\u00a8\7\6\2\2\u00a8\u00aa\5\b\5\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b2\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b2\7\30\2\2\u00af\u00b0\7%\2\2\u00b0\u00b2\7\31"+
		"\2\2\u00b1\61\3\2\2\2\u00b19\3\2\2\2\u00b1>\3\2\2\2\u00b1E\3\2\2\2\u00b1"+
		"L\3\2\2\2\u00b1S\3\2\2\2\u00b1Z\3\2\2\2\u00b1a\3\2\2\2\u00b1h\3\2\2\2"+
		"\u00b1o\3\2\2\2\u00b1v\3\2\2\2\u00b1}\3\2\2\2\u00b1\u0084\3\2\2\2\u00b1"+
		"\u008b\3\2\2\2\u00b1\u0092\3\2\2\2\u00b1\u0099\3\2\2\2\u00b1\u009e\3\2"+
		"\2\2\u00b1\u00a3\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\17\3\2\2\2\7\27*\65\u00ab\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}