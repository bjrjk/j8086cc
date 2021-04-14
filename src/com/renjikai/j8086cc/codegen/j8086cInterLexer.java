// Generated from j8086cInter.g4 by ANTLR 4.8
package com.renjikai.j8086cc.codegen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class j8086cInterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		TYPE_UINT=32, TYPE_INT=33, TYPE_CHAR=34, GLOB_SCOPE=35, LOC_SCOPE=36, 
		TMP_SCOPE=37, PARAM_SCOPE=38, DSEG_HEAD=39, CSEG_HEAD=40, DECL_HEAD=41, 
		FUNC_HEAD=42, FUNC_TAIL=43, LBL=44, ADD=45, SUB=46, MUL=47, DIV=48, MOD=49, 
		NOT=50, EQ=51, NE=52, LT=53, LE=54, GE=55, GT=56, IDENTIFIER=57, STRING=58, 
		INT=59, WS=60, COMMENT=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "TYPE_UINT", "TYPE_INT", 
			"TYPE_CHAR", "GLOB_SCOPE", "LOC_SCOPE", "TMP_SCOPE", "PARAM_SCOPE", "DSEG_HEAD", 
			"CSEG_HEAD", "DECL_HEAD", "FUNC_HEAD", "FUNC_TAIL", "LBL", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "NOT", "EQ", "NE", "LT", "LE", "GE", "GT", "IDENTIFIER", 
			"STRING", "INT", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'_'", "'_@'", "'movi'", "','", "'mov'", "'movrm'", "'['", 
			"']'", "'movmr'", "'lea'", "'add'", "'sub'", "'mul'", "'div'", "'mod'", 
			"'lt'", "'le'", "'ge'", "'gt'", "'eq'", "'ne'", "'land'", "'lor'", "'lnot'", 
			"'jnz'", "'jz'", "'jmp'", "'call'", "'ret'", "':'", "'_u'", "'_i'", "'_c'", 
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
			null, null, null, null, null, null, null, null, "TYPE_UINT", "TYPE_INT", 
			"TYPE_CHAR", "GLOB_SCOPE", "LOC_SCOPE", "TMP_SCOPE", "PARAM_SCOPE", "DSEG_HEAD", 
			"CSEG_HEAD", "DECL_HEAD", "FUNC_HEAD", "FUNC_TAIL", "LBL", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "NOT", "EQ", "NE", "LT", "LE", "GE", "GT", "IDENTIFIER", 
			"STRING", "INT", "WS", "COMMENT"
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


	public j8086cInterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "j8086cInter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0181\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\7:\u0159"+
		"\n:\f:\16:\u015c\13:\3;\3;\3;\3;\7;\u0162\n;\f;\16;\u0165\13;\3;\3;\3"+
		"<\6<\u016a\n<\r<\16<\u016b\3=\6=\u016f\n=\r=\16=\u0170\3=\3=\3>\3>\3>"+
		"\3>\7>\u0179\n>\f>\16>\u017c\13>\3>\3>\3>\3>\4\u0163\u017a\2?\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0186\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\3}\3\2\2\2\5\177\3\2\2\2\7\u0081\3\2\2\2\t\u0084\3\2\2\2\13\u0089"+
		"\3\2\2\2\r\u008b\3\2\2\2\17\u008f\3\2\2\2\21\u0095\3\2\2\2\23\u0097\3"+
		"\2\2\2\25\u0099\3\2\2\2\27\u009f\3\2\2\2\31\u00a3\3\2\2\2\33\u00a7\3\2"+
		"\2\2\35\u00ab\3\2\2\2\37\u00af\3\2\2\2!\u00b3\3\2\2\2#\u00b7\3\2\2\2%"+
		"\u00ba\3\2\2\2\'\u00bd\3\2\2\2)\u00c0\3\2\2\2+\u00c3\3\2\2\2-\u00c6\3"+
		"\2\2\2/\u00c9\3\2\2\2\61\u00ce\3\2\2\2\63\u00d2\3\2\2\2\65\u00d7\3\2\2"+
		"\2\67\u00db\3\2\2\29\u00de\3\2\2\2;\u00e2\3\2\2\2=\u00e7\3\2\2\2?\u00eb"+
		"\3\2\2\2A\u00ed\3\2\2\2C\u00f0\3\2\2\2E\u00f3\3\2\2\2G\u00f6\3\2\2\2I"+
		"\u0100\3\2\2\2K\u0109\3\2\2\2M\u0110\3\2\2\2O\u0119\3\2\2\2Q\u011f\3\2"+
		"\2\2S\u0125\3\2\2\2U\u012a\3\2\2\2W\u012f\3\2\2\2Y\u0137\3\2\2\2[\u013a"+
		"\3\2\2\2]\u013c\3\2\2\2_\u013e\3\2\2\2a\u0140\3\2\2\2c\u0142\3\2\2\2e"+
		"\u0144\3\2\2\2g\u0146\3\2\2\2i\u0149\3\2\2\2k\u014c\3\2\2\2m\u014e\3\2"+
		"\2\2o\u0151\3\2\2\2q\u0154\3\2\2\2s\u0156\3\2\2\2u\u015d\3\2\2\2w\u0169"+
		"\3\2\2\2y\u016e\3\2\2\2{\u0174\3\2\2\2}~\7&\2\2~\4\3\2\2\2\177\u0080\7"+
		"a\2\2\u0080\6\3\2\2\2\u0081\u0082\7a\2\2\u0082\u0083\7B\2\2\u0083\b\3"+
		"\2\2\2\u0084\u0085\7o\2\2\u0085\u0086\7q\2\2\u0086\u0087\7x\2\2\u0087"+
		"\u0088\7k\2\2\u0088\n\3\2\2\2\u0089\u008a\7.\2\2\u008a\f\3\2\2\2\u008b"+
		"\u008c\7o\2\2\u008c\u008d\7q\2\2\u008d\u008e\7x\2\2\u008e\16\3\2\2\2\u008f"+
		"\u0090\7o\2\2\u0090\u0091\7q\2\2\u0091\u0092\7x\2\2\u0092\u0093\7t\2\2"+
		"\u0093\u0094\7o\2\2\u0094\20\3\2\2\2\u0095\u0096\7]\2\2\u0096\22\3\2\2"+
		"\2\u0097\u0098\7_\2\2\u0098\24\3\2\2\2\u0099\u009a\7o\2\2\u009a\u009b"+
		"\7q\2\2\u009b\u009c\7x\2\2\u009c\u009d\7o\2\2\u009d\u009e\7t\2\2\u009e"+
		"\26\3\2\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\30\3\2\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7f\2\2\u00a6"+
		"\32\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7d\2\2\u00aa"+
		"\34\3\2\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		"\36\3\2\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7x\2\2\u00b2"+
		" \3\2\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7f\2\2\u00b6"+
		"\"\3\2\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7v\2\2\u00b9$\3\2\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc&\3\2\2\2\u00bd\u00be\7i\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"*\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7s\2\2\u00c5,\3\2\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7g\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cd\60\3\2\2\2\u00ce\u00cf"+
		"\7n\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1\62\3\2\2\2\u00d2\u00d3"+
		"\7n\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7v\2\2\u00d6"+
		"\64\3\2\2\2\u00d7\u00d8\7l\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7|\2\2\u00da"+
		"\66\3\2\2\2\u00db\u00dc\7l\2\2\u00dc\u00dd\7|\2\2\u00dd8\3\2\2\2\u00de"+
		"\u00df\7l\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7r\2\2\u00e1:\3\2\2\2\u00e2"+
		"\u00e3\7e\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7n\2\2"+
		"\u00e6<\3\2\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7v\2"+
		"\2\u00ea>\3\2\2\2\u00eb\u00ec\7<\2\2\u00ec@\3\2\2\2\u00ed\u00ee\7a\2\2"+
		"\u00ee\u00ef\7w\2\2\u00efB\3\2\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7k\2"+
		"\2\u00f2D\3\2\2\2\u00f3\u00f4\7a\2\2\u00f4\u00f5\7e\2\2\u00f5F\3\2\2\2"+
		"\u00f6\u00f7\7I\2\2\u00f7\u00f8\7N\2\2\u00f8\u00f9\7Q\2\2\u00f9\u00fa"+
		"\7D\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc\7N\2\2\u00fc\u00fd\7X\2\2\u00fd"+
		"\u00fe\7C\2\2\u00fe\u00ff\7T\2\2\u00ffH\3\2\2\2\u0100\u0101\7N\2\2\u0101"+
		"\u0102\7Q\2\2\u0102\u0103\7E\2\2\u0103\u0104\7C\2\2\u0104\u0105\7N\2\2"+
		"\u0105\u0106\7X\2\2\u0106\u0107\7C\2\2\u0107\u0108\7T\2\2\u0108J\3\2\2"+
		"\2\u0109\u010a\7V\2\2\u010a\u010b\7O\2\2\u010b\u010c\7R\2\2\u010c\u010d"+
		"\7X\2\2\u010d\u010e\7C\2\2\u010e\u010f\7T\2\2\u010fL\3\2\2\2\u0110\u0111"+
		"\7R\2\2\u0111\u0112\7C\2\2\u0112\u0113\7T\2\2\u0113\u0114\7C\2\2\u0114"+
		"\u0115\7O\2\2\u0115\u0116\7X\2\2\u0116\u0117\7C\2\2\u0117\u0118\7T\2\2"+
		"\u0118N\3\2\2\2\u0119\u011a\7\60\2\2\u011a\u011b\7f\2\2\u011b\u011c\7"+
		"c\2\2\u011c\u011d\7v\2\2\u011d\u011e\7c\2\2\u011eP\3\2\2\2\u011f\u0120"+
		"\7\60\2\2\u0120\u0121\7e\2\2\u0121\u0122\7q\2\2\u0122\u0123\7f\2\2\u0123"+
		"\u0124\7g\2\2\u0124R\3\2\2\2\u0125\u0126\7\60\2\2\u0126\u0127\7x\2\2\u0127"+
		"\u0128\7c\2\2\u0128\u0129\7t\2\2\u0129T\3\2\2\2\u012a\u012b\7\60\2\2\u012b"+
		"\u012c\7h\2\2\u012c\u012d\7w\2\2\u012d\u012e\7p\2\2\u012eV\3\2\2\2\u012f"+
		"\u0130\7\60\2\2\u0130\u0131\7g\2\2\u0131\u0132\7p\2\2\u0132\u0133\7f\2"+
		"\2\u0133\u0134\7h\2\2\u0134\u0135\7w\2\2\u0135\u0136\7p\2\2\u0136X\3\2"+
		"\2\2\u0137\u0138\7N\2\2\u0138\u0139\5w<\2\u0139Z\3\2\2\2\u013a\u013b\7"+
		"-\2\2\u013b\\\3\2\2\2\u013c\u013d\7/\2\2\u013d^\3\2\2\2\u013e\u013f\7"+
		",\2\2\u013f`\3\2\2\2\u0140\u0141\7\61\2\2\u0141b\3\2\2\2\u0142\u0143\7"+
		"\'\2\2\u0143d\3\2\2\2\u0144\u0145\7#\2\2\u0145f\3\2\2\2\u0146\u0147\7"+
		"?\2\2\u0147\u0148\7?\2\2\u0148h\3\2\2\2\u0149\u014a\7#\2\2\u014a\u014b"+
		"\7?\2\2\u014bj\3\2\2\2\u014c\u014d\7>\2\2\u014dl\3\2\2\2\u014e\u014f\7"+
		">\2\2\u014f\u0150\7?\2\2\u0150n\3\2\2\2\u0151\u0152\7@\2\2\u0152\u0153"+
		"\7?\2\2\u0153p\3\2\2\2\u0154\u0155\7@\2\2\u0155r\3\2\2\2\u0156\u015a\t"+
		"\2\2\2\u0157\u0159\t\3\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015bt\3\2\2\2\u015c\u015a\3\2\2\2"+
		"\u015d\u0163\7$\2\2\u015e\u015f\7^\2\2\u015f\u0162\7$\2\2\u0160\u0162"+
		"\13\2\2\2\u0161\u015e\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0166\u0167\7$\2\2\u0167v\3\2\2\2\u0168\u016a\t\4\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"x\3\2\2\2\u016d\u016f\t\5\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173"+
		"\b=\2\2\u0173z\3\2\2\2\u0174\u0175\7\61\2\2\u0175\u0176\7\61\2\2\u0176"+
		"\u017a\3\2\2\2\u0177\u0179\13\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3"+
		"\2\2\2\u017a\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\7\f\2\2\u017e\u017f\3\2\2\2\u017f\u0180\b>"+
		"\2\2\u0180|\3\2\2\2\t\2\u015a\u0161\u0163\u016b\u0170\u017a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}