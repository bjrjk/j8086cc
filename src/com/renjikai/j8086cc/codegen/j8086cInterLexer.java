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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, TYPE_UINT=31, 
		TYPE_INT=32, TYPE_CHAR=33, GLOB_SCOPE=34, LOC_SCOPE=35, TMP_SCOPE=36, 
		PARAM_SCOPE=37, DSEG_HEAD=38, CSEG_HEAD=39, DECL_HEAD=40, FUNC_HEAD=41, 
		FUNC_TAIL=42, LBL=43, ADD=44, SUB=45, MUL=46, DIV=47, MOD=48, NOT=49, 
		EQ=50, NE=51, LT=52, LE=53, GE=54, GT=55, IDENTIFIER=56, STRING=57, INT=58, 
		WS=59, COMMENT=60;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "TYPE_UINT", "TYPE_INT", 
			"TYPE_CHAR", "GLOB_SCOPE", "LOC_SCOPE", "TMP_SCOPE", "PARAM_SCOPE", "DSEG_HEAD", 
			"CSEG_HEAD", "DECL_HEAD", "FUNC_HEAD", "FUNC_TAIL", "LBL", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "NOT", "EQ", "NE", "LT", "LE", "GE", "GT", "IDENTIFIER", 
			"STRING", "INT", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u017d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\79\u0155\n9\f9\169\u0158\13"+
		"9\3:\3:\3:\3:\7:\u015e\n:\f:\16:\u0161\13:\3:\3:\3;\6;\u0166\n;\r;\16"+
		";\u0167\3<\6<\u016b\n<\r<\16<\u016c\3<\3<\3=\3=\3=\3=\7=\u0175\n=\f=\16"+
		"=\u0178\13=\3=\3=\3=\3=\4\u015f\u0176\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\6\5\2C\\aac|\6"+
		"\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0182\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7"+
		"\u0080\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u008b\3\2\2\2\17\u0091"+
		"\3\2\2\2\21\u0093\3\2\2\2\23\u0095\3\2\2\2\25\u009b\3\2\2\2\27\u009f\3"+
		"\2\2\2\31\u00a3\3\2\2\2\33\u00a7\3\2\2\2\35\u00ab\3\2\2\2\37\u00af\3\2"+
		"\2\2!\u00b3\3\2\2\2#\u00b6\3\2\2\2%\u00b9\3\2\2\2\'\u00bc\3\2\2\2)\u00bf"+
		"\3\2\2\2+\u00c2\3\2\2\2-\u00c5\3\2\2\2/\u00ca\3\2\2\2\61\u00ce\3\2\2\2"+
		"\63\u00d3\3\2\2\2\65\u00d7\3\2\2\2\67\u00da\3\2\2\29\u00de\3\2\2\2;\u00e3"+
		"\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00ec\3\2\2\2C\u00ef\3\2\2\2E"+
		"\u00f2\3\2\2\2G\u00fc\3\2\2\2I\u0105\3\2\2\2K\u010c\3\2\2\2M\u0115\3\2"+
		"\2\2O\u011b\3\2\2\2Q\u0121\3\2\2\2S\u0126\3\2\2\2U\u012b\3\2\2\2W\u0133"+
		"\3\2\2\2Y\u0136\3\2\2\2[\u0138\3\2\2\2]\u013a\3\2\2\2_\u013c\3\2\2\2a"+
		"\u013e\3\2\2\2c\u0140\3\2\2\2e\u0142\3\2\2\2g\u0145\3\2\2\2i\u0148\3\2"+
		"\2\2k\u014a\3\2\2\2m\u014d\3\2\2\2o\u0150\3\2\2\2q\u0152\3\2\2\2s\u0159"+
		"\3\2\2\2u\u0165\3\2\2\2w\u016a\3\2\2\2y\u0170\3\2\2\2{|\7&\2\2|\4\3\2"+
		"\2\2}~\7/\2\2~\177\7B\2\2\177\6\3\2\2\2\u0080\u0081\7o\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0083\7x\2\2\u0083\u0084\7k\2\2\u0084\b\3\2\2\2\u0085\u0086"+
		"\7.\2\2\u0086\n\3\2\2\2\u0087\u0088\7o\2\2\u0088\u0089\7q\2\2\u0089\u008a"+
		"\7x\2\2\u008a\f\3\2\2\2\u008b\u008c\7o\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7x\2\2\u008e\u008f\7t\2\2\u008f\u0090\7o\2\2\u0090\16\3\2\2\2\u0091\u0092"+
		"\7]\2\2\u0092\20\3\2\2\2\u0093\u0094\7_\2\2\u0094\22\3\2\2\2\u0095\u0096"+
		"\7o\2\2\u0096\u0097\7q\2\2\u0097\u0098\7x\2\2\u0098\u0099\7o\2\2\u0099"+
		"\u009a\7t\2\2\u009a\24\3\2\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7c\2\2\u009e\26\3\2\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\u00a2\7f\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7w\2\2\u00a5"+
		"\u00a6\7d\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7x\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7q\2\2\u00b1"+
		"\u00b2\7f\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7v\2\2\u00b5"+
		"\"\3\2\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8$\3\2\2\2\u00b9"+
		"\u00ba\7i\2\2\u00ba\u00bb\7g\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7i\2\2\u00bd"+
		"\u00be\7v\2\2\u00be(\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7s\2\2\u00c1"+
		"*\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7g\2\2\u00c4,\3\2\2\2\u00c5\u00c6"+
		"\7n\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7f\2\2\u00c9"+
		".\3\2\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\60\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7q\2\2\u00d1"+
		"\u00d2\7v\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7l\2\2\u00d4\u00d5\7p\2\2\u00d5"+
		"\u00d6\7|\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7l\2\2\u00d8\u00d9\7|\2\2\u00d9"+
		"\66\3\2\2\2\u00da\u00db\7l\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7r\2\2\u00dd"+
		"8\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7n\2\2\u00e2:\3\2\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"\u00e6\7v\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7<\2\2\u00e8>\3\2\2\2\u00e9\u00ea"+
		"\7/\2\2\u00ea\u00eb\7w\2\2\u00eb@\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee"+
		"\7k\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\7e\2\2\u00f1D\3"+
		"\2\2\2\u00f2\u00f3\7I\2\2\u00f3\u00f4\7N\2\2\u00f4\u00f5\7Q\2\2\u00f5"+
		"\u00f6\7D\2\2\u00f6\u00f7\7C\2\2\u00f7\u00f8\7N\2\2\u00f8\u00f9\7X\2\2"+
		"\u00f9\u00fa\7C\2\2\u00fa\u00fb\7T\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7N\2"+
		"\2\u00fd\u00fe\7Q\2\2\u00fe\u00ff\7E\2\2\u00ff\u0100\7C\2\2\u0100\u0101"+
		"\7N\2\2\u0101\u0102\7X\2\2\u0102\u0103\7C\2\2\u0103\u0104\7T\2\2\u0104"+
		"H\3\2\2\2\u0105\u0106\7V\2\2\u0106\u0107\7O\2\2\u0107\u0108\7R\2\2\u0108"+
		"\u0109\7X\2\2\u0109\u010a\7C\2\2\u010a\u010b\7T\2\2\u010bJ\3\2\2\2\u010c"+
		"\u010d\7R\2\2\u010d\u010e\7C\2\2\u010e\u010f\7T\2\2\u010f\u0110\7C\2\2"+
		"\u0110\u0111\7O\2\2\u0111\u0112\7X\2\2\u0112\u0113\7C\2\2\u0113\u0114"+
		"\7T\2\2\u0114L\3\2\2\2\u0115\u0116\7\60\2\2\u0116\u0117\7f\2\2\u0117\u0118"+
		"\7c\2\2\u0118\u0119\7v\2\2\u0119\u011a\7c\2\2\u011aN\3\2\2\2\u011b\u011c"+
		"\7\60\2\2\u011c\u011d\7e\2\2\u011d\u011e\7q\2\2\u011e\u011f\7f\2\2\u011f"+
		"\u0120\7g\2\2\u0120P\3\2\2\2\u0121\u0122\7\60\2\2\u0122\u0123\7x\2\2\u0123"+
		"\u0124\7c\2\2\u0124\u0125\7t\2\2\u0125R\3\2\2\2\u0126\u0127\7\60\2\2\u0127"+
		"\u0128\7h\2\2\u0128\u0129\7w\2\2\u0129\u012a\7p\2\2\u012aT\3\2\2\2\u012b"+
		"\u012c\7\60\2\2\u012c\u012d\7g\2\2\u012d\u012e\7p\2\2\u012e\u012f\7f\2"+
		"\2\u012f\u0130\7h\2\2\u0130\u0131\7w\2\2\u0131\u0132\7p\2\2\u0132V\3\2"+
		"\2\2\u0133\u0134\7N\2\2\u0134\u0135\5u;\2\u0135X\3\2\2\2\u0136\u0137\7"+
		"-\2\2\u0137Z\3\2\2\2\u0138\u0139\7/\2\2\u0139\\\3\2\2\2\u013a\u013b\7"+
		",\2\2\u013b^\3\2\2\2\u013c\u013d\7\61\2\2\u013d`\3\2\2\2\u013e\u013f\7"+
		"\'\2\2\u013fb\3\2\2\2\u0140\u0141\7#\2\2\u0141d\3\2\2\2\u0142\u0143\7"+
		"?\2\2\u0143\u0144\7?\2\2\u0144f\3\2\2\2\u0145\u0146\7#\2\2\u0146\u0147"+
		"\7?\2\2\u0147h\3\2\2\2\u0148\u0149\7>\2\2\u0149j\3\2\2\2\u014a\u014b\7"+
		">\2\2\u014b\u014c\7?\2\2\u014cl\3\2\2\2\u014d\u014e\7@\2\2\u014e\u014f"+
		"\7?\2\2\u014fn\3\2\2\2\u0150\u0151\7@\2\2\u0151p\3\2\2\2\u0152\u0156\t"+
		"\2\2\2\u0153\u0155\t\3\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157r\3\2\2\2\u0158\u0156\3\2\2\2"+
		"\u0159\u015f\7$\2\2\u015a\u015b\7^\2\2\u015b\u015e\7$\2\2\u015c\u015e"+
		"\13\2\2\2\u015d\u015a\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0163\7$\2\2\u0163t\3\2\2\2\u0164\u0166\t\4\2\2\u0165\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"v\3\2\2\2\u0169\u016b\t\5\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f"+
		"\b<\2\2\u016fx\3\2\2\2\u0170\u0171\7\61\2\2\u0171\u0172\7\61\2\2\u0172"+
		"\u0176\3\2\2\2\u0173\u0175\13\2\2\2\u0174\u0173\3\2\2\2\u0175\u0178\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\7\f\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b="+
		"\2\2\u017cz\3\2\2\2\t\2\u0156\u015d\u015f\u0167\u016c\u0176\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}