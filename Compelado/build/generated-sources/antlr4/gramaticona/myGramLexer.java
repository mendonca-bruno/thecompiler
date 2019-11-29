// Generated from C:\Users\BrunoPC\Documents\Compiladores\p4\thecompiler\Compelado\grammar\gramaticona\myGram.g4 by ANTLR 4.6

    package gramaticona;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myGramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WHILE=11, GRT=12, LESS=13, GRTEQ=14, LESSEQ=15, EQ=16, NEQ=17, 
		OR=18, IF=19, AND=20, ELSE=21, PRINT=22, MAIN=23, INT=24, FLOAT=25, DOUBLE=26, 
		STRING=27, VOID=28, READ=29, RET=30, OBR=31, CBR=32, EOL=33, GLOBAL=34, 
		STRVALUE=35, VAR=36, PRINTCONC=37, NUM=38, COMMENT=39, LINE_COMMENT=40, 
		WS=41, COM=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "WHILE", "GRT", "LESS", "GRTEQ", "LESSEQ", "EQ", "NEQ", "OR", 
		"IF", "AND", "ELSE", "PRINT", "MAIN", "INT", "FLOAT", "DOUBLE", "STRING", 
		"VOID", "READ", "RET", "OBR", "CBR", "EOL", "GLOBAL", "STRVALUE", "VAR", 
		"PRINTCONC", "NUM", "COMMENT", "LINE_COMMENT", "WS", "COM"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'0'", "')'", "'!'", "'+'", "'='", "'-'", "'*'", "'/'", "'%'", 
		"'while'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'||'", "'if'", 
		"'&&'", "'else'", "'print'", "'main'", "'int'", "'float'", "'double'", 
		"'string'", "'void'", "'read'", "'return'", "'{'", "'}'", "';'", "'global'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "WHILE", 
		"GRT", "LESS", "GRTEQ", "LESSEQ", "EQ", "NEQ", "OR", "IF", "AND", "ELSE", 
		"PRINT", "MAIN", "INT", "FLOAT", "DOUBLE", "STRING", "VOID", "READ", "RET", 
		"OBR", "CBR", "EOL", "GLOBAL", "STRVALUE", "VAR", "PRINTCONC", "NUM", 
		"COMMENT", "LINE_COMMENT", "WS", "COM"
	};
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


	public myGramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u013d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\5$\u00d3\n$\3$\7$\u00d6\n$\f$\16$\u00d9\13$\3$\3$\3%\3%\7%\u00df\n%"+
		"\f%\16%\u00e2\13%\3&\5&\u00e5\n&\3&\3&\5&\u00e9\n&\3&\7&\u00ec\n&\f&\16"+
		"&\u00ef\13&\3&\6&\u00f2\n&\r&\16&\u00f3\3&\3&\5&\u00f8\n&\6&\u00fa\n&"+
		"\r&\16&\u00fb\3\'\5\'\u00ff\n\'\3\'\6\'\u0102\n\'\r\'\16\'\u0103\3\'\3"+
		"\'\6\'\u0108\n\'\r\'\16\'\u0109\5\'\u010c\n\'\3(\3(\3(\3(\7(\u0112\n("+
		"\f(\16(\u0115\13(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0120\n)\f)\16)\u0123"+
		"\13)\3)\3)\3*\6*\u0128\n*\r*\16*\u0129\3*\3*\3+\3+\3+\3+\7+\u0132\n+\f"+
		"+\16+\u0135\13+\3+\5+\u0138\n+\3+\3+\3+\3+\3\u0113\2,\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,\3\2\n\6\2\"\"\62;C\\c|\b\2\"\"\60\60\62<C\\aac|\4\2C\\c|"+
		"\6\2\62;C\\aac|\3\2//\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u014e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3"+
		"\2\2\2\17c\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31"+
		"q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#~\3\2\2\2%\u0081"+
		"\3\2\2\2\'\u0084\3\2\2\2)\u0087\3\2\2\2+\u008a\3\2\2\2-\u008f\3\2\2\2"+
		"/\u0095\3\2\2\2\61\u009a\3\2\2\2\63\u009e\3\2\2\2\65\u00a4\3\2\2\2\67"+
		"\u00ab\3\2\2\29\u00b2\3\2\2\2;\u00b7\3\2\2\2=\u00bc\3\2\2\2?\u00c3\3\2"+
		"\2\2A\u00c5\3\2\2\2C\u00c7\3\2\2\2E\u00c9\3\2\2\2G\u00d0\3\2\2\2I\u00dc"+
		"\3\2\2\2K\u00f9\3\2\2\2M\u00fe\3\2\2\2O\u010d\3\2\2\2Q\u011b\3\2\2\2S"+
		"\u0127\3\2\2\2U\u012d\3\2\2\2WX\7*\2\2X\4\3\2\2\2YZ\7\62\2\2Z\6\3\2\2"+
		"\2[\\\7+\2\2\\\b\3\2\2\2]^\7#\2\2^\n\3\2\2\2_`\7-\2\2`\f\3\2\2\2ab\7?"+
		"\2\2b\16\3\2\2\2cd\7/\2\2d\20\3\2\2\2ef\7,\2\2f\22\3\2\2\2gh\7\61\2\2"+
		"h\24\3\2\2\2ij\7\'\2\2j\26\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7k\2\2no\7n\2\2"+
		"op\7g\2\2p\30\3\2\2\2qr\7@\2\2r\32\3\2\2\2st\7>\2\2t\34\3\2\2\2uv\7@\2"+
		"\2vw\7?\2\2w\36\3\2\2\2xy\7>\2\2yz\7?\2\2z \3\2\2\2{|\7?\2\2|}\7?\2\2"+
		"}\"\3\2\2\2~\177\7#\2\2\177\u0080\7?\2\2\u0080$\3\2\2\2\u0081\u0082\7"+
		"~\2\2\u0082\u0083\7~\2\2\u0083&\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7h\2\2\u0086(\3\2\2\2\u0087\u0088\7(\2\2\u0088\u0089\7(\2\2\u0089*\3"+
		"\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7g\2\2\u008e,\3\2\2\2\u008f\u0090\7r\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094.\3\2\2\2\u0095"+
		"\u0096\7o\2\2\u0096\u0097\7c\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2"+
		"\u0099\60\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7"+
		"v\2\2\u009d\62\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7q\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7v\2\2\u00a3\64\3\2\2\2\u00a4\u00a5"+
		"\7f\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7d\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7u\2\2\u00ac"+
		"\u00ad\7v\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7i\2\2\u00b18\3\2\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7q\2"+
		"\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7f\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7"+
		"t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7f\2\2\u00bb<"+
		"\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7w\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2>\3\2\2\2\u00c3"+
		"\u00c4\7}\2\2\u00c4@\3\2\2\2\u00c5\u00c6\7\177\2\2\u00c6B\3\2\2\2\u00c7"+
		"\u00c8\7=\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7q\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7n\2\2"+
		"\u00cfF\3\2\2\2\u00d0\u00d2\7$\2\2\u00d1\u00d3\t\2\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\t\3\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00db"+
		"H\3\2\2\2\u00dc\u00e0\t\4\2\2\u00dd\u00df\t\5\2\2\u00de\u00dd\3\2\2\2"+
		"\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1J\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\7-\2\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\7$\2\2\u00e7\u00e9\t\2"+
		"\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ed\3\2\2\2\u00ea"+
		"\u00ec\t\3\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f2\7$\2\2\u00f1\u00e4\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\7-\2\2\u00f6"+
		"\u00f8\5I%\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2"+
		"\2\u00f9\u00f1\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fcL\3\2\2\2\u00fd\u00ff\t\6\2\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\t\7\2\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u010b\3\2\2\2\u0105\u0107\7\60\2\2\u0106\u0108\t\7\2\2\u0107\u0106\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u010c\3\2\2\2\u010cN\3\2\2\2"+
		"\u010d\u010e\7\61\2\2\u010e\u010f\7,\2\2\u010f\u0113\3\2\2\2\u0110\u0112"+
		"\13\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0113\u0111\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117"+
		"\7,\2\2\u0117\u0118\7\61\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b(\2\2\u011a"+
		"P\3\2\2\2\u011b\u011c\7\61\2\2\u011c\u011d\7\61\2\2\u011d\u0121\3\2\2"+
		"\2\u011e\u0120\n\b\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\b)\2\2\u0125R\3\2\2\2\u0126\u0128\t\t\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\b*\2\2\u012cT\3\2\2\2\u012d\u012e\7\61\2\2\u012e\u012f"+
		"\7\61\2\2\u012f\u0133\3\2\2\2\u0130\u0132\n\b\2\2\u0131\u0130\3\2\2\2"+
		"\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\7\17\2\2\u0137\u0136\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\f\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\b+\2\2\u013cV\3\2\2\2\25\2\u00d2\u00d7\u00e0\u00e4"+
		"\u00e8\u00ed\u00f3\u00f7\u00fb\u00fe\u0103\u0109\u010b\u0113\u0121\u0129"+
		"\u0133\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}