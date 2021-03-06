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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, TYPE_UINT=31, 
		TYPE_INT=32, TYPE_CHAR=33, GLOB_SCOPE=34, LOC_SCOPE=35, TMP_SCOPE=36, 
		PARAM_SCOPE=37, DSEG_HEAD=38, CSEG_HEAD=39, DECL_HEAD=40, FUNC_HEAD=41, 
		FUNC_TAIL=42, LBL=43, ADD=44, SUB=45, MUL=46, DIV=47, MOD=48, NOT=49, 
		EQ=50, NE=51, LT=52, LE=53, GE=54, GT=55, IDENTIFIER=56, STRING=57, INT=58, 
		WS=59, COMMENT=60;
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
			null, "'$'", "'-@'", "'movi'", "','", "'mov'", "'movrm'", "'['", "']'", 
			"'movmr'", "'lea'", "'add'", "'sub'", "'mul'", "'div'", "'mod'", "'lt'", 
			"'le'", "'ge'", "'gt'", "'eq'", "'ne'", "'land'", "'lor'", "'lnot'", 
			"'jnz'", "'jz'", "'jmp'", "'call'", "'ret'", "':'", "'-u'", "'-i'", "'-c'", 
			"'GLOBALVAR'", "'LOCALVAR'", "'TMPVAR'", "'PARAMVAR'", "'.data'", "'.code'", 
			"'.var'", "'.fun'", "'.endfun'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TYPE_UINT", "TYPE_INT", "TYPE_CHAR", 
			"GLOB_SCOPE", "LOC_SCOPE", "TMP_SCOPE", "PARAM_SCOPE", "DSEG_HEAD", "CSEG_HEAD", 
			"DECL_HEAD", "FUNC_HEAD", "FUNC_TAIL", "LBL", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "NOT", "EQ", "NE", "LT", "LE", "GE", "GT", "IDENTIFIER", "STRING", 
			"INT", "WS", "COMMENT"
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
		public TerminalNode STRING() { return getToken(j8086cInterParser.STRING, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(DECL_HEAD);
			setState(25);
			varName();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(26);
				match(STRING);
				}
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

	public static class VarNameContext extends ParserRuleContext {
		public Token scope;
		public Token dataType;
		public TerminalNode SUB() { return getToken(j8086cInterParser.SUB, 0); }
		public TerminalNode INT() { return getToken(j8086cInterParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(j8086cInterParser.IDENTIFIER, 0); }
		public TerminalNode GLOB_SCOPE() { return getToken(j8086cInterParser.GLOB_SCOPE, 0); }
		public TerminalNode LOC_SCOPE() { return getToken(j8086cInterParser.LOC_SCOPE, 0); }
		public TerminalNode TMP_SCOPE() { return getToken(j8086cInterParser.TMP_SCOPE, 0); }
		public TerminalNode PARAM_SCOPE() { return getToken(j8086cInterParser.PARAM_SCOPE, 0); }
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
			setState(29);
			match(T__0);
			setState(30);
			((VarNameContext)_localctx).scope = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GLOB_SCOPE) | (1L << LOC_SCOPE) | (1L << TMP_SCOPE) | (1L << PARAM_SCOPE))) != 0)) ) {
				((VarNameContext)_localctx).scope = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(31);
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
			setState(32);
			match(SUB);
			setState(33);
			match(INT);
			setState(34);
			match(T__1);
			setState(35);
			match(IDENTIFIER);
			setState(36);
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
			setState(38);
			match(CSEG_HEAD);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				function();
				}
				}
				setState(42); 
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
		public TerminalNode FUNC_TAIL() { return getToken(j8086cInterParser.FUNC_TAIL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(FUNC_HEAD);
			setState(45);
			match(IDENTIFIER);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << DECL_HEAD) | (1L << LBL))) != 0)) {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
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
	public static class LNOTContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public LNOTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLNOT(this);
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
	public static class MOVRMContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public MOVRMContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitMOVRM(this);
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
	public static class LABELContext extends StatementContext {
		public TerminalNode LBL() { return getToken(j8086cInterParser.LBL, 0); }
		public LABELContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalVarDeclContext extends StatementContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public LocalVarDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLocalVarDecl(this);
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
	public static class LEAContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public LEAContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitLEA(this);
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
	public static class MOVMRContext extends StatementContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public MOVMRContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086cInterVisitor ) return ((j8086cInterVisitor<? extends T>)visitor).visitMOVMR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new MOVIContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__2);
				setState(55);
				varName();
				setState(56);
				match(T__3);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(57);
					match(SUB);
					}
				}

				setState(60);
				match(INT);
				}
				break;
			case T__4:
				_localctx = new MOVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__4);
				setState(63);
				varName();
				setState(64);
				match(T__3);
				setState(65);
				varName();
				}
				break;
			case T__5:
				_localctx = new MOVRMContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__5);
				setState(68);
				varName();
				setState(69);
				match(T__3);
				setState(70);
				match(T__6);
				setState(71);
				varName();
				setState(72);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new MOVMRContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__8);
				setState(75);
				match(T__6);
				setState(76);
				varName();
				setState(77);
				match(T__7);
				setState(78);
				match(T__3);
				setState(79);
				varName();
				}
				break;
			case T__9:
				_localctx = new LEAContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(T__9);
				setState(82);
				varName();
				setState(83);
				match(T__3);
				setState(84);
				varName();
				}
				break;
			case T__10:
				_localctx = new ADDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(T__10);
				setState(87);
				varName();
				setState(88);
				match(T__3);
				setState(89);
				varName();
				setState(90);
				match(T__3);
				setState(91);
				varName();
				}
				break;
			case T__11:
				_localctx = new SUBContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				match(T__11);
				setState(94);
				varName();
				setState(95);
				match(T__3);
				setState(96);
				varName();
				setState(97);
				match(T__3);
				setState(98);
				varName();
				}
				break;
			case T__12:
				_localctx = new MULContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				match(T__12);
				setState(101);
				varName();
				setState(102);
				match(T__3);
				setState(103);
				varName();
				setState(104);
				match(T__3);
				setState(105);
				varName();
				}
				break;
			case T__13:
				_localctx = new DIVContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				match(T__13);
				setState(108);
				varName();
				setState(109);
				match(T__3);
				setState(110);
				varName();
				setState(111);
				match(T__3);
				setState(112);
				varName();
				}
				break;
			case T__14:
				_localctx = new MODContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(114);
				match(T__14);
				setState(115);
				varName();
				setState(116);
				match(T__3);
				setState(117);
				varName();
				setState(118);
				match(T__3);
				setState(119);
				varName();
				}
				break;
			case T__15:
				_localctx = new LTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(121);
				match(T__15);
				setState(122);
				varName();
				setState(123);
				match(T__3);
				setState(124);
				varName();
				setState(125);
				match(T__3);
				setState(126);
				varName();
				}
				break;
			case T__16:
				_localctx = new LEContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(128);
				match(T__16);
				setState(129);
				varName();
				setState(130);
				match(T__3);
				setState(131);
				varName();
				setState(132);
				match(T__3);
				setState(133);
				varName();
				}
				break;
			case T__17:
				_localctx = new GEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(135);
				match(T__17);
				setState(136);
				varName();
				setState(137);
				match(T__3);
				setState(138);
				varName();
				setState(139);
				match(T__3);
				setState(140);
				varName();
				}
				break;
			case T__18:
				_localctx = new GTContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(142);
				match(T__18);
				setState(143);
				varName();
				setState(144);
				match(T__3);
				setState(145);
				varName();
				setState(146);
				match(T__3);
				setState(147);
				varName();
				}
				break;
			case T__19:
				_localctx = new EQContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(149);
				match(T__19);
				setState(150);
				varName();
				setState(151);
				match(T__3);
				setState(152);
				varName();
				setState(153);
				match(T__3);
				setState(154);
				varName();
				}
				break;
			case T__20:
				_localctx = new NEContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(156);
				match(T__20);
				setState(157);
				varName();
				setState(158);
				match(T__3);
				setState(159);
				varName();
				setState(160);
				match(T__3);
				setState(161);
				varName();
				}
				break;
			case T__21:
				_localctx = new LANDContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(163);
				match(T__21);
				setState(164);
				varName();
				setState(165);
				match(T__3);
				setState(166);
				varName();
				setState(167);
				match(T__3);
				setState(168);
				varName();
				}
				break;
			case T__22:
				_localctx = new LORContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(170);
				match(T__22);
				setState(171);
				varName();
				setState(172);
				match(T__3);
				setState(173);
				varName();
				setState(174);
				match(T__3);
				setState(175);
				varName();
				}
				break;
			case T__23:
				_localctx = new LNOTContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(177);
				match(T__23);
				setState(178);
				varName();
				setState(179);
				match(T__3);
				setState(180);
				varName();
				}
				break;
			case T__24:
				_localctx = new JNZContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(182);
				match(T__24);
				setState(183);
				varName();
				setState(184);
				match(T__3);
				setState(185);
				match(LBL);
				}
				break;
			case T__25:
				_localctx = new JZContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(187);
				match(T__25);
				setState(188);
				varName();
				setState(189);
				match(T__3);
				setState(190);
				match(LBL);
				}
				break;
			case T__26:
				_localctx = new JMPContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(192);
				match(T__26);
				setState(193);
				match(LBL);
				}
				break;
			case T__27:
				_localctx = new CALLContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(194);
				match(T__27);
				setState(195);
				match(IDENTIFIER);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(196);
					match(T__3);
					setState(197);
					varName();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__28:
				_localctx = new RETContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(203);
				match(T__28);
				setState(204);
				varName();
				}
				break;
			case LBL:
				_localctx = new LABELContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(205);
				match(LBL);
				setState(206);
				match(T__29);
				}
				break;
			case DECL_HEAD:
				_localctx = new LocalVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(207);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u00d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\7\3"+
		"\26\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\6\6+\n\6\r\6\16\6,\3\7\3\7\3\7\7\7\62\n\7\f\7\16"+
		"\7\65\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b=\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c9\n\b\f\b\16\b\u00cc\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00d3\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2$\'"+
		"\3\2!#\2\u00ec\2\20\3\2\2\2\4\23\3\2\2\2\6\32\3\2\2\2\b\37\3\2\2\2\n("+
		"\3\2\2\2\f.\3\2\2\2\16\u00d2\3\2\2\2\20\21\5\4\3\2\21\22\5\n\6\2\22\3"+
		"\3\2\2\2\23\27\7(\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25"+
		"\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32\33\7*\2\2\33\35\5"+
		"\b\5\2\34\36\7;\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\7\3\2\2\2\37 \7\3\2"+
		"\2 !\t\2\2\2!\"\t\3\2\2\"#\7/\2\2#$\7<\2\2$%\7\4\2\2%&\7:\2\2&\'\7\3\2"+
		"\2\'\t\3\2\2\2(*\7)\2\2)+\5\f\7\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2"+
		"\2\2-\13\3\2\2\2./\7+\2\2/\63\7:\2\2\60\62\5\16\b\2\61\60\3\2\2\2\62\65"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67"+
		"\7,\2\2\67\r\3\2\2\289\7\5\2\29:\5\b\5\2:<\7\6\2\2;=\7/\2\2<;\3\2\2\2"+
		"<=\3\2\2\2=>\3\2\2\2>?\7<\2\2?\u00d3\3\2\2\2@A\7\7\2\2AB\5\b\5\2BC\7\6"+
		"\2\2CD\5\b\5\2D\u00d3\3\2\2\2EF\7\b\2\2FG\5\b\5\2GH\7\6\2\2HI\7\t\2\2"+
		"IJ\5\b\5\2JK\7\n\2\2K\u00d3\3\2\2\2LM\7\13\2\2MN\7\t\2\2NO\5\b\5\2OP\7"+
		"\n\2\2PQ\7\6\2\2QR\5\b\5\2R\u00d3\3\2\2\2ST\7\f\2\2TU\5\b\5\2UV\7\6\2"+
		"\2VW\5\b\5\2W\u00d3\3\2\2\2XY\7\r\2\2YZ\5\b\5\2Z[\7\6\2\2[\\\5\b\5\2\\"+
		"]\7\6\2\2]^\5\b\5\2^\u00d3\3\2\2\2_`\7\16\2\2`a\5\b\5\2ab\7\6\2\2bc\5"+
		"\b\5\2cd\7\6\2\2de\5\b\5\2e\u00d3\3\2\2\2fg\7\17\2\2gh\5\b\5\2hi\7\6\2"+
		"\2ij\5\b\5\2jk\7\6\2\2kl\5\b\5\2l\u00d3\3\2\2\2mn\7\20\2\2no\5\b\5\2o"+
		"p\7\6\2\2pq\5\b\5\2qr\7\6\2\2rs\5\b\5\2s\u00d3\3\2\2\2tu\7\21\2\2uv\5"+
		"\b\5\2vw\7\6\2\2wx\5\b\5\2xy\7\6\2\2yz\5\b\5\2z\u00d3\3\2\2\2{|\7\22\2"+
		"\2|}\5\b\5\2}~\7\6\2\2~\177\5\b\5\2\177\u0080\7\6\2\2\u0080\u0081\5\b"+
		"\5\2\u0081\u00d3\3\2\2\2\u0082\u0083\7\23\2\2\u0083\u0084\5\b\5\2\u0084"+
		"\u0085\7\6\2\2\u0085\u0086\5\b\5\2\u0086\u0087\7\6\2\2\u0087\u0088\5\b"+
		"\5\2\u0088\u00d3\3\2\2\2\u0089\u008a\7\24\2\2\u008a\u008b\5\b\5\2\u008b"+
		"\u008c\7\6\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7\6\2\2\u008e\u008f\5\b"+
		"\5\2\u008f\u00d3\3\2\2\2\u0090\u0091\7\25\2\2\u0091\u0092\5\b\5\2\u0092"+
		"\u0093\7\6\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\6\2\2\u0095\u0096\5\b"+
		"\5\2\u0096\u00d3\3\2\2\2\u0097\u0098\7\26\2\2\u0098\u0099\5\b\5\2\u0099"+
		"\u009a\7\6\2\2\u009a\u009b\5\b\5\2\u009b\u009c\7\6\2\2\u009c\u009d\5\b"+
		"\5\2\u009d\u00d3\3\2\2\2\u009e\u009f\7\27\2\2\u009f\u00a0\5\b\5\2\u00a0"+
		"\u00a1\7\6\2\2\u00a1\u00a2\5\b\5\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\5\b"+
		"\5\2\u00a4\u00d3\3\2\2\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\5\b\5\2\u00a7"+
		"\u00a8\7\6\2\2\u00a8\u00a9\5\b\5\2\u00a9\u00aa\7\6\2\2\u00aa\u00ab\5\b"+
		"\5\2\u00ab\u00d3\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad\u00ae\5\b\5\2\u00ae"+
		"\u00af\7\6\2\2\u00af\u00b0\5\b\5\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2\5\b"+
		"\5\2\u00b2\u00d3\3\2\2\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\5\b\5\2\u00b5"+
		"\u00b6\7\6\2\2\u00b6\u00b7\5\b\5\2\u00b7\u00d3\3\2\2\2\u00b8\u00b9\7\33"+
		"\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb\7\6\2\2\u00bb\u00bc\7-\2\2\u00bc"+
		"\u00d3\3\2\2\2\u00bd\u00be\7\34\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c0\7"+
		"\6\2\2\u00c0\u00c1\7-\2\2\u00c1\u00d3\3\2\2\2\u00c2\u00c3\7\35\2\2\u00c3"+
		"\u00d3\7-\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00ca\7:\2\2\u00c6\u00c7\7\6"+
		"\2\2\u00c7\u00c9\5\b\5\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d3\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7\37\2\2\u00ce\u00d3\5\b\5\2\u00cf\u00d0\7-\2\2\u00d0"+
		"\u00d3\7 \2\2\u00d1\u00d3\5\6\4\2\u00d28\3\2\2\2\u00d2@\3\2\2\2\u00d2"+
		"E\3\2\2\2\u00d2L\3\2\2\2\u00d2S\3\2\2\2\u00d2X\3\2\2\2\u00d2_\3\2\2\2"+
		"\u00d2f\3\2\2\2\u00d2m\3\2\2\2\u00d2t\3\2\2\2\u00d2{\3\2\2\2\u00d2\u0082"+
		"\3\2\2\2\u00d2\u0089\3\2\2\2\u00d2\u0090\3\2\2\2\u00d2\u0097\3\2\2\2\u00d2"+
		"\u009e\3\2\2\2\u00d2\u00a5\3\2\2\2\u00d2\u00ac\3\2\2\2\u00d2\u00b3\3\2"+
		"\2\2\u00d2\u00b8\3\2\2\2\u00d2\u00bd\3\2\2\2\u00d2\u00c2\3\2\2\2\u00d2"+
		"\u00c4\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\17\3\2\2\2\t\27\35,\63<\u00ca\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}