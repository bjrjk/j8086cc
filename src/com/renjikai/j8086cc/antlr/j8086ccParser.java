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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, TYPE_UINT=19, TYPE_INT=20, TYPE_CHAR=21, ADD=22, SUB=23, MUL=24, 
		DIV=25, MOD=26, NOT=27, EQ=28, NE=29, LT=30, LE=31, GE=32, GT=33, IDENTIFIER=34, 
		INT=35, WS=36, COMMENT=37;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_paramList = 2, RULE_parameter = 3, 
		RULE_varDeclare = 4, RULE_varType = 5, RULE_block = 6, RULE_leftValue = 7, 
		RULE_statement = 8, RULE_expr = 9, RULE_exprList = 10, RULE_basicType = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "paramList", "parameter", "varDeclare", "varType", 
			"block", "leftValue", "statement", "expr", "exprList", "basicType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "';'", "'['", "']'", "'{'", "'}'", "'if'", 
			"'else'", "'while'", "'do'", "'break'", "'continue'", "'return'", "'='", 
			"'&&'", "'||'", "'uint'", "'int'", "'char'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'!'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TYPE_UINT", "TYPE_INT", "TYPE_CHAR", 
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
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(24);
					varDeclare();
					}
					break;
				case 2:
					{
					setState(25);
					function();
					}
					break;
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_UINT) | (1L << TYPE_INT) | (1L << TYPE_CHAR))) != 0) );
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
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			basicType();
			setState(31);
			match(IDENTIFIER);
			setState(32);
			match(T__0);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_UINT) | (1L << TYPE_INT) | (1L << TYPE_CHAR))) != 0)) {
				{
				setState(33);
				paramList();
				}
			}

			setState(36);
			match(T__1);
			setState(37);
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
		enterRule(_localctx, 4, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			parameter();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(40);
				match(T__2);
				setState(41);
				parameter();
				}
				}
				setState(46);
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
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			varType();
			setState(48);
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
		enterRule(_localctx, 8, RULE_varDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			varType();
			setState(51);
			match(IDENTIFIER);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(52);
				match(T__2);
				setState(53);
				match(IDENTIFIER);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(T__3);
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
		enterRule(_localctx, 10, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			basicType();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(62);
				match(T__4);
				setState(63);
				match(INT);
				setState(64);
				match(T__5);
				}
				}
				setState(69);
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__6);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << TYPE_UINT) | (1L << TYPE_INT) | (1L << TYPE_CHAR) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
		enterRule(_localctx, 14, RULE_leftValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IDENTIFIER);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(T__4);
					setState(81);
					expr(0);
					setState(82);
					match(T__5);
					}
					} 
				}
				setState(88);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SubBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				block();
				}
				break;
			case 2:
				_localctx = new VarDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				varDeclare();
				}
				break;
			case 3:
				_localctx = new IfSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T__8);
				setState(92);
				match(T__0);
				setState(93);
				expr(0);
				setState(94);
				match(T__1);
				setState(95);
				statement();
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(96);
					match(T__9);
					setState(97);
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
				setState(100);
				match(T__10);
				setState(101);
				match(T__0);
				setState(102);
				expr(0);
				setState(103);
				match(T__1);
				setState(104);
				statement();
				}
				break;
			case 5:
				_localctx = new DoWhileSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(T__11);
				setState(107);
				statement();
				setState(108);
				match(T__10);
				setState(109);
				match(T__0);
				setState(110);
				expr(0);
				setState(111);
				match(T__1);
				setState(112);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new BreakSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(T__12);
				setState(115);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new ContinueSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				match(T__13);
				setState(117);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new ReturnSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				match(T__14);
				setState(119);
				expr(0);
				setState(120);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new LValueAssignContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				leftValue();
				setState(123);
				match(T__15);
				setState(124);
				expr(0);
				setState(125);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new ExprStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
					{
					setState(127);
					expr(0);
					}
				}

				setState(130);
				match(T__3);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(134);
				match(T__0);
				setState(135);
				expr(0);
				setState(136);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(IDENTIFIER);
				setState(140);
				match(T__0);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
					{
					setState(141);
					exprList();
					}
				}

				setState(144);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new LValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				leftValue();
				}
				break;
			case 5:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
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
				setState(147);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new HighArithExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(151);
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
						setState(152);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new LowArithExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(154);
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
						setState(155);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
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
						setState(158);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
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
						setState(161);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new LogicAndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(T__16);
						setState(164);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new LogicOrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						match(T__17);
						setState(167);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(172);
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
		enterRule(_localctx, 20, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			expr(0);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(174);
				match(T__2);
				setState(175);
				expr(0);
				}
				}
				setState(180);
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
		enterRule(_localctx, 22, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\3\3\3\3\3\3\3\5\3"+
		"%\n\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7D\n"+
		"\7\f\7\16\7G\13\7\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\7\tW\n\t\f\t\16\tZ\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\ne\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\n\5"+
		"\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091\n"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ab"+
		"\n\13\f\13\16\13\u00ae\13\13\3\f\3\f\3\f\7\f\u00b3\n\f\f\f\16\f\u00b6"+
		"\13\f\3\r\3\r\3\r\2\3\24\16\2\4\6\b\n\f\16\20\22\24\26\30\2\b\4\2\30\31"+
		"\35\35\3\2\32\34\3\2\30\31\3\2 #\3\2\36\37\3\2\25\27\2\u00cc\2\34\3\2"+
		"\2\2\4 \3\2\2\2\6)\3\2\2\2\b\61\3\2\2\2\n\64\3\2\2\2\f?\3\2\2\2\16H\3"+
		"\2\2\2\20Q\3\2\2\2\22\u0085\3\2\2\2\24\u0096\3\2\2\2\26\u00af\3\2\2\2"+
		"\30\u00b7\3\2\2\2\32\35\5\n\6\2\33\35\5\4\3\2\34\32\3\2\2\2\34\33\3\2"+
		"\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 !\5\30\r\2"+
		"!\"\7$\2\2\"$\7\3\2\2#%\5\6\4\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\4\2"+
		"\2\'(\5\16\b\2(\5\3\2\2\2).\5\b\5\2*+\7\5\2\2+-\5\b\5\2,*\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60.\3\2\2\2\61\62\5\f\7\2\62\63"+
		"\7$\2\2\63\t\3\2\2\2\64\65\5\f\7\2\65:\7$\2\2\66\67\7\5\2\2\679\7$\2\2"+
		"8\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\6\2"+
		"\2>\13\3\2\2\2?E\5\30\r\2@A\7\7\2\2AB\7%\2\2BD\7\b\2\2C@\3\2\2\2DG\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2F\r\3\2\2\2GE\3\2\2\2HL\7\t\2\2IK\5\22\n\2JI\3"+
		"\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\n\2\2P\17"+
		"\3\2\2\2QX\7$\2\2RS\7\7\2\2ST\5\24\13\2TU\7\b\2\2UW\3\2\2\2VR\3\2\2\2"+
		"WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\21\3\2\2\2ZX\3\2\2\2[\u0086\5\16\b\2\\"+
		"\u0086\5\n\6\2]^\7\13\2\2^_\7\3\2\2_`\5\24\13\2`a\7\4\2\2ad\5\22\n\2b"+
		"c\7\f\2\2ce\5\22\n\2db\3\2\2\2de\3\2\2\2e\u0086\3\2\2\2fg\7\r\2\2gh\7"+
		"\3\2\2hi\5\24\13\2ij\7\4\2\2jk\5\22\n\2k\u0086\3\2\2\2lm\7\16\2\2mn\5"+
		"\22\n\2no\7\r\2\2op\7\3\2\2pq\5\24\13\2qr\7\4\2\2rs\7\6\2\2s\u0086\3\2"+
		"\2\2tu\7\17\2\2u\u0086\7\6\2\2vw\7\20\2\2w\u0086\7\6\2\2xy\7\21\2\2yz"+
		"\5\24\13\2z{\7\6\2\2{\u0086\3\2\2\2|}\5\20\t\2}~\7\22\2\2~\177\5\24\13"+
		"\2\177\u0080\7\6\2\2\u0080\u0086\3\2\2\2\u0081\u0083\5\24\13\2\u0082\u0081"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\7\6\2\2\u0085"+
		"[\3\2\2\2\u0085\\\3\2\2\2\u0085]\3\2\2\2\u0085f\3\2\2\2\u0085l\3\2\2\2"+
		"\u0085t\3\2\2\2\u0085v\3\2\2\2\u0085x\3\2\2\2\u0085|\3\2\2\2\u0085\u0082"+
		"\3\2\2\2\u0086\23\3\2\2\2\u0087\u0088\b\13\1\2\u0088\u0089\7\3\2\2\u0089"+
		"\u008a\5\24\13\2\u008a\u008b\7\4\2\2\u008b\u0097\3\2\2\2\u008c\u0097\7"+
		"%\2\2\u008d\u008e\7$\2\2\u008e\u0090\7\3\2\2\u008f\u0091\5\26\f\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0097\7\4"+
		"\2\2\u0093\u0097\5\20\t\2\u0094\u0095\t\2\2\2\u0095\u0097\5\24\13\t\u0096"+
		"\u0087\3\2\2\2\u0096\u008c\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u0093\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u00ac\3\2\2\2\u0098\u0099\f\b\2\2\u0099"+
		"\u009a\t\3\2\2\u009a\u00ab\5\24\13\t\u009b\u009c\f\7\2\2\u009c\u009d\t"+
		"\4\2\2\u009d\u00ab\5\24\13\b\u009e\u009f\f\6\2\2\u009f\u00a0\t\5\2\2\u00a0"+
		"\u00ab\5\24\13\7\u00a1\u00a2\f\5\2\2\u00a2\u00a3\t\6\2\2\u00a3\u00ab\5"+
		"\24\13\6\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00ab\5\24\13"+
		"\5\u00a7\u00a8\f\3\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00ab\5\24\13\4\u00aa"+
		"\u0098\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a1\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b4\5\24\13\2\u00b0\u00b1\7\5\2\2\u00b1\u00b3\5\24\13\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\27\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\t\7\2\2\u00b8\31"+
		"\3\2\2\2\22\34\36$.:ELXd\u0082\u0085\u0090\u0096\u00aa\u00ac\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}