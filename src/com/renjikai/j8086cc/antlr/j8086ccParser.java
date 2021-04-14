// Generated from j8086cc.g4 by ANTLR 4.8
package com.renjikai.j8086cc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class j8086ccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TYPE_UINT=16, 
		TYPE_INT=17, TYPE_CHAR=18, ADD=19, SUB=20, MUL=21, DIV=22, MOD=23, NOT=24, 
		EQ=25, NE=26, LT=27, LE=28, GE=29, GT=30, ASSIGN=31, LAND=32, LOR=33, 
		IDENTIFIER=34, STRING=35, INT=36, WS=37, COMMENT=38;
	public static final int
		RULE_program = 0, RULE_arrInit = 1, RULE_function = 2, RULE_paramList = 3, 
		RULE_parameter = 4, RULE_varDeclare = 5, RULE_varType = 6, RULE_block = 7, 
		RULE_leftValue = 8, RULE_statement = 9, RULE_expr = 10, RULE_exprList = 11, 
		RULE_basicType = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "arrInit", "function", "paramList", "parameter", "varDeclare", 
			"varType", "block", "leftValue", "statement", "expr", "exprList", "basicType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'['", "']'", "'{'", "'}'", "'if'", 
			"'else'", "'while'", "'do'", "'break'", "'continue'", "'return'", "'uint'", 
			"'int'", "'char'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'=='", 
			"'!='", "'<'", "'<='", "'>='", "'>'", "'='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TYPE_UINT", "TYPE_INT", "TYPE_CHAR", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "NOT", "EQ", "NE", "LT", "LE", "GE", "GT", 
			"ASSIGN", "LAND", "LOR", "IDENTIFIER", "STRING", "INT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "j8086cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public j8086ccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<VarDeclareContext> varDeclare() {
			return getRuleContexts(VarDeclareContext.class);
		}
		public VarDeclareContext varDeclare(int i) {
			return getRuleContext(VarDeclareContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ArrInitContext> arrInit() {
			return getRuleContexts(ArrInitContext.class);
		}
		public ArrInitContext arrInit(int i) {
			return getRuleContext(ArrInitContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(29);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(26);
					varDeclare();
					}
					break;
				case 2:
					{
					setState(27);
					function();
					}
					break;
				case 3:
					{
					setState(28);
					arrInit();
					}
					break;
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_UINT) | (1L << TYPE_INT) | (1L << TYPE_CHAR) | (1L << IDENTIFIER))) != 0) );
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

	public static class ArrInitContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(j8086ccParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(j8086ccParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(j8086ccParser.STRING, 0); }
		public ArrInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitArrInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrInitContext arrInit() throws RecognitionException {
		ArrInitContext _localctx = new ArrInitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arrInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(IDENTIFIER);
			setState(34);
			match(ASSIGN);
			setState(35);
			match(STRING);
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

	public static class FunctionContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(j8086ccParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			basicType();
			setState(39);
			match(IDENTIFIER);
			setState(40);
			match(T__1);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_UINT) | (1L << TYPE_INT) | (1L << TYPE_CHAR))) != 0)) {
				{
				setState(41);
				paramList();
				}
			}

			setState(44);
			match(T__2);
			setState(45);
			block();
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			parameter();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(48);
				match(T__3);
				setState(49);
				parameter();
				}
				}
				setState(54);
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

	public static class ParameterContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(j8086ccParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			varType();
			setState(56);
			match(IDENTIFIER);
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

	public static class VarDeclareContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(j8086ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(j8086ccParser.IDENTIFIER, i);
		}
		public VarDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitVarDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclareContext varDeclare() throws RecognitionException {
		VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			varType();
			setState(59);
			match(IDENTIFIER);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(60);
				match(T__3);
				setState(61);
				match(IDENTIFIER);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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

	public static class VarTypeContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(j8086ccParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(j8086ccParser.INT, i);
		}
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			basicType();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(70);
				match(T__4);
				setState(71);
				match(INT);
				setState(72);
				match(T__5);
				}
				}
				setState(77);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << TYPE_UINT) | (1L << TYPE_INT) | (1L << TYPE_CHAR) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__7);
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

	public static class LeftValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(j8086ccParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeftValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitLeftValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftValueContext leftValue() throws RecognitionException {
		LeftValueContext _localctx = new LeftValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_leftValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(T__4);
					setState(89);
					expr(0);
					setState(90);
					match(T__5);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class DoWhileSyntaxContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DoWhileSyntaxContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitDoWhileSyntax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SubBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitSubBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclStatContext extends StatementContext {
		public VarDeclareContext varDeclare() {
			return getRuleContext(VarDeclareContext.class,0);
		}
		public VarDeclStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitVarDeclStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueSyntaxContext extends StatementContext {
		public ContinueSyntaxContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitContinueSyntax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnSyntaxContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnSyntaxContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitReturnSyntax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfSyntaxContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfSyntaxContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitIfSyntax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitExprStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LValueAssignContext extends StatementContext {
		public LeftValueContext leftValue() {
			return getRuleContext(LeftValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(j8086ccParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LValueAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitLValueAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileSyntaxContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileSyntaxContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitWhileSyntax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakSyntaxContext extends StatementContext {
		public BreakSyntaxContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitBreakSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SubBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				block();
				}
				break;
			case 2:
				_localctx = new VarDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				varDeclare();
				}
				break;
			case 3:
				_localctx = new IfSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(T__8);
				setState(100);
				match(T__1);
				setState(101);
				expr(0);
				setState(102);
				match(T__2);
				setState(103);
				statement();
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(104);
					match(T__9);
					setState(105);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(T__10);
				setState(109);
				match(T__1);
				setState(110);
				expr(0);
				setState(111);
				match(T__2);
				setState(112);
				statement();
				}
				break;
			case 5:
				_localctx = new DoWhileSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(T__11);
				setState(115);
				statement();
				setState(116);
				match(T__10);
				setState(117);
				match(T__1);
				setState(118);
				expr(0);
				setState(119);
				match(T__2);
				setState(120);
				match(T__0);
				}
				break;
			case 6:
				_localctx = new BreakSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(T__12);
				setState(123);
				match(T__0);
				}
				break;
			case 7:
				_localctx = new ContinueSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				match(T__13);
				setState(125);
				match(T__0);
				}
				break;
			case 8:
				_localctx = new ReturnSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				match(T__14);
				setState(127);
				expr(0);
				setState(128);
				match(T__0);
				}
				break;
			case 9:
				_localctx = new LValueAssignContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				leftValue();
				setState(131);
				match(ASSIGN);
				setState(132);
				expr(0);
				setState(133);
				match(T__0);
				}
				break;
			case 10:
				_localctx = new ExprStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
					{
					setState(135);
					expr(0);
					}
				}

				setState(138);
				match(T__0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicOrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOR() { return getToken(j8086ccParser.LOR, 0); }
		public LogicOrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitLogicOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(j8086ccParser.EQ, 0); }
		public TerminalNode NE() { return getToken(j8086ccParser.NE, 0); }
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(j8086ccParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(j8086ccParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(j8086ccParser.NOT, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicAndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LAND() { return getToken(j8086ccParser.LAND, 0); }
		public LogicAndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitLogicAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends ExprContext {
		public TerminalNode INT() { return getToken(j8086ccParser.INT, 0); }
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(j8086ccParser.IDENTIFIER, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LValueExprContext extends ExprContext {
		public LeftValueContext leftValue() {
			return getRuleContext(LeftValueContext.class,0);
		}
		public LValueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitLValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(j8086ccParser.LT, 0); }
		public TerminalNode LE() { return getToken(j8086ccParser.LE, 0); }
		public TerminalNode GE() { return getToken(j8086ccParser.GE, 0); }
		public TerminalNode GT() { return getToken(j8086ccParser.GT, 0); }
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HighArithExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(j8086ccParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(j8086ccParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(j8086ccParser.MOD, 0); }
		public HighArithExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitHighArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LowArithExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(j8086ccParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(j8086ccParser.SUB, 0); }
		public LowArithExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitLowArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(142);
				match(T__1);
				setState(143);
				expr(0);
				setState(144);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(IDENTIFIER);
				setState(148);
				match(T__1);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
					{
					setState(149);
					exprList();
					}
				}

				setState(152);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new LValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				leftValue();
				}
				break;
			case 5:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << NOT))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new HighArithExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(159);
						((HighArithExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((HighArithExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new LowArithExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						((LowArithExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((LowArithExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(165);
						((RelExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
							((RelExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						((EqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new LogicAndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(171);
						match(LAND);
						setState(172);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new LogicOrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(174);
						match(LOR);
						setState(175);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			expr(0);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(182);
				match(T__3);
				setState(183);
				expr(0);
				}
				}
				setState(188);
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

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_UINT() { return getToken(j8086ccParser.TYPE_UINT, 0); }
		public TerminalNode TYPE_INT() { return getToken(j8086ccParser.TYPE_INT, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(j8086ccParser.TYPE_CHAR, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof j8086ccVisitor ) return ((j8086ccVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_UINT) | (1L << TYPE_INT) | (1L << TYPE_CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\65\n\5"+
		"\f\5\16\58\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\t\3\t\7\tS\n\t\f\t\16"+
		"\tV\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13m\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008b\n\13\3\13\5\13"+
		"\u008e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0099\n\f\3\f\3\f"+
		"\3\f\3\f\5\f\u009f\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b3\n\f\f\f\16\f\u00b6\13\f\3\r\3\r\3\r"+
		"\7\r\u00bb\n\r\f\r\16\r\u00be\13\r\3\16\3\16\3\16\2\3\26\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\b\4\2\25\26\32\32\3\2\27\31\3\2\25\26\3\2\35"+
		" \3\2\33\34\3\2\22\24\2\u00d4\2\37\3\2\2\2\4#\3\2\2\2\6(\3\2\2\2\b\61"+
		"\3\2\2\2\n9\3\2\2\2\f<\3\2\2\2\16G\3\2\2\2\20P\3\2\2\2\22Y\3\2\2\2\24"+
		"\u008d\3\2\2\2\26\u009e\3\2\2\2\30\u00b7\3\2\2\2\32\u00bf\3\2\2\2\34 "+
		"\5\f\7\2\35 \5\6\4\2\36 \5\4\3\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2"+
		"\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#$\7$\2\2$%\7!\2\2%&"+
		"\7%\2\2&\'\7\3\2\2\'\5\3\2\2\2()\5\32\16\2)*\7$\2\2*,\7\4\2\2+-\5\b\5"+
		"\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\5\2\2/\60\5\20\t\2\60\7\3\2\2\2\61"+
		"\66\5\n\6\2\62\63\7\6\2\2\63\65\5\n\6\2\64\62\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\28\66\3\2\2\29:\5\16\b\2:;\7$\2\2;\13"+
		"\3\2\2\2<=\5\16\b\2=B\7$\2\2>?\7\6\2\2?A\7$\2\2@>\3\2\2\2AD\3\2\2\2B@"+
		"\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\3\2\2F\r\3\2\2\2GM\5\32\16"+
		"\2HI\7\7\2\2IJ\7&\2\2JL\7\b\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2N\17\3\2\2\2OM\3\2\2\2PT\7\t\2\2QS\5\24\13\2RQ\3\2\2\2SV\3\2\2\2TR\3"+
		"\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\n\2\2X\21\3\2\2\2Y`\7$\2\2Z["+
		"\7\7\2\2[\\\5\26\f\2\\]\7\b\2\2]_\3\2\2\2^Z\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2`a\3\2\2\2a\23\3\2\2\2b`\3\2\2\2c\u008e\5\20\t\2d\u008e\5\f\7\2ef\7"+
		"\13\2\2fg\7\4\2\2gh\5\26\f\2hi\7\5\2\2il\5\24\13\2jk\7\f\2\2km\5\24\13"+
		"\2lj\3\2\2\2lm\3\2\2\2m\u008e\3\2\2\2no\7\r\2\2op\7\4\2\2pq\5\26\f\2q"+
		"r\7\5\2\2rs\5\24\13\2s\u008e\3\2\2\2tu\7\16\2\2uv\5\24\13\2vw\7\r\2\2"+
		"wx\7\4\2\2xy\5\26\f\2yz\7\5\2\2z{\7\3\2\2{\u008e\3\2\2\2|}\7\17\2\2}\u008e"+
		"\7\3\2\2~\177\7\20\2\2\177\u008e\7\3\2\2\u0080\u0081\7\21\2\2\u0081\u0082"+
		"\5\26\f\2\u0082\u0083\7\3\2\2\u0083\u008e\3\2\2\2\u0084\u0085\5\22\n\2"+
		"\u0085\u0086\7!\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\3\2\2\u0088\u008e"+
		"\3\2\2\2\u0089\u008b\5\26\f\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008e\7\3\2\2\u008dc\3\2\2\2\u008dd\3\2\2\2"+
		"\u008de\3\2\2\2\u008dn\3\2\2\2\u008dt\3\2\2\2\u008d|\3\2\2\2\u008d~\3"+
		"\2\2\2\u008d\u0080\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u008a\3\2\2\2\u008e"+
		"\25\3\2\2\2\u008f\u0090\b\f\1\2\u0090\u0091\7\4\2\2\u0091\u0092\5\26\f"+
		"\2\u0092\u0093\7\5\2\2\u0093\u009f\3\2\2\2\u0094\u009f\7&\2\2\u0095\u0096"+
		"\7$\2\2\u0096\u0098\7\4\2\2\u0097\u0099\5\30\r\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009f\7\5\2\2\u009b\u009f\5\22"+
		"\n\2\u009c\u009d\t\2\2\2\u009d\u009f\5\26\f\t\u009e\u008f\3\2\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00b4\3\2\2\2\u00a0\u00a1\f\b\2\2\u00a1\u00a2\t\3\2\2\u00a2"+
		"\u00b3\5\26\f\t\u00a3\u00a4\f\7\2\2\u00a4\u00a5\t\4\2\2\u00a5\u00b3\5"+
		"\26\f\b\u00a6\u00a7\f\6\2\2\u00a7\u00a8\t\5\2\2\u00a8\u00b3\5\26\f\7\u00a9"+
		"\u00aa\f\5\2\2\u00aa\u00ab\t\6\2\2\u00ab\u00b3\5\26\f\6\u00ac\u00ad\f"+
		"\4\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00b3\5\26\f\5\u00af\u00b0\f\3\2\2\u00b0"+
		"\u00b1\7#\2\2\u00b1\u00b3\5\26\f\4\u00b2\u00a0\3\2\2\2\u00b2\u00a3\3\2"+
		"\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\27\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bc\5\26\f\2\u00b8\u00b9"+
		"\7\6\2\2\u00b9\u00bb\5\26\f\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\31\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c0\t\7\2\2\u00c0\33\3\2\2\2\22\37!,\66BMT`l\u008a\u008d"+
		"\u0098\u009e\u00b2\u00b4\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}