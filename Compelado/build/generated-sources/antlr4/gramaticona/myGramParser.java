// Generated from C:\Users\BrunoPC\Documents\Compiladores\p4\thecompiler\Compelado\grammar\gramaticona\myGram.g4 by ANTLR 4.6

    package gramaticona;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, GRAMATICA=12, IMPORT=13, TRUE=14, FALSE=15, FOR=16, 
		WHILE=17, GRT=18, LESS=19, GRTEQ=20, LESSEQ=21, EQ=22, NEQ=23, OR=24, 
		IF=25, AND=26, ELSE=27, PRINT=28, MAIN=29, INT=30, FLOAT=31, DOUBLE=32, 
		STRING=33, VOID=34, BOOL=35, READ=36, RET=37, OBR=38, CBR=39, EOL=40, 
		GLOBAL=41, STRVALUE=42, VAR=43, PRINTCONC=44, NUM=45, COMMENT=46, LINE_COMMENT=47, 
		WS=48, COM=49;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_func = 2, RULE_cmd = 3, RULE_while_ = 4, 
		RULE_for_ = 5, RULE_ifstmt = 6, RULE_cond = 7, RULE_cdand = 8, RULE_cndts = 9, 
		RULE_relop = 10, RULE_read = 11, RULE_print = 12, RULE_init_ = 13, RULE_retr = 14, 
		RULE_atr = 15, RULE_expr = 16, RULE_term = 17, RULE_fact = 18, RULE_type_ = 19;
	public static final String[] ruleNames = {
		"prog", "line", "func", "cmd", "while_", "for_", "ifstmt", "cond", "cdand", 
		"cndts", "relop", "read", "print", "init_", "retr", "atr", "expr", "term", 
		"fact", "type_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "'0'", "')'", "'!'", "'+'", "'='", "'-'", "'*'", "'/'", 
		"'%'", "'gramaticaextensao'", "'import'", "'true'", "'false'", "'for'", 
		"'while'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'||'", "'if'", 
		"'&&'", "'else'", "'print'", "'main'", "'int'", "'float'", "'double'", 
		"'string'", "'void'", "'boolean'", "'read'", "'return'", "'{'", "'}'", 
		"';'", "'global'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"GRAMATICA", "IMPORT", "TRUE", "FALSE", "FOR", "WHILE", "GRT", "LESS", 
		"GRTEQ", "LESSEQ", "EQ", "NEQ", "OR", "IF", "AND", "ELSE", "PRINT", "MAIN", 
		"INT", "FLOAT", "DOUBLE", "STRING", "VOID", "BOOL", "READ", "RET", "OBR", 
		"CBR", "EOL", "GLOBAL", "STRVALUE", "VAR", "PRINTCONC", "NUM", "COMMENT", 
		"LINE_COMMENT", "WS", "COM"
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

	@Override
	public String getGrammarFileName() { return "myGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(myGramParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(myGramParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(myGramParser.EOL, i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public TerminalNode IMPORT() { return getToken(myGramParser.IMPORT, 0); }
		public TerminalNode VAR() { return getToken(myGramParser.VAR, 0); }
		public TerminalNode GRAMATICA() { return getToken(myGramParser.GRAMATICA, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case VOID:
			case BOOL:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(40);
						line();
						setState(41);
						match(EOL);
						}
						break;
					case 2:
						{
						setState(43);
						func();
						}
						break;
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << BOOL) | (1L << VAR))) != 0) );
				setState(48);
				match(EOF);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(IMPORT);
				setState(51);
				match(LESS);
				setState(52);
				match(VAR);
				setState(53);
				match(T__0);
				setState(54);
				match(GRAMATICA);
				setState(55);
				match(GRT);
				setState(56);
				match(EOL);
				setState(57);
				prog();
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

	public static class LineContext extends ParserRuleContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public Init_Context init_() {
			return getRuleContext(Init_Context.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				atr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				init_();
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

	public static class FuncContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(myGramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(myGramParser.VAR, i);
		}
		public TerminalNode OBR() { return getToken(myGramParser.OBR, 0); }
		public RetrContext retr() {
			return getRuleContext(RetrContext.class,0);
		}
		public TerminalNode CBR() { return getToken(myGramParser.CBR, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode VOID() { return getToken(myGramParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(myGramParser.MAIN, 0); }
		public TerminalNode RET() { return getToken(myGramParser.RET, 0); }
		public TerminalNode EOL() { return getToken(myGramParser.EOL, 0); }
		public TerminalNode INT() { return getToken(myGramParser.INT, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				type_();
				setState(65);
				match(VAR);
				setState(66);
				match(T__1);
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
					{
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(67);
						type_();
						setState(68);
						match(VAR);
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOL) {
							{
							setState(70);
							match(EOL);
							}
						}

						}
						}
						setState(75); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL))) != 0) );
					}
					break;
				case T__2:
					{
					setState(77);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80);
				match(T__3);
				setState(81);
				match(OBR);
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					cmd();
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(87);
				retr();
				setState(88);
				match(CBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(VOID);
				setState(91);
				match(VAR);
				setState(92);
				match(T__1);
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
					{
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(93);
						type_();
						setState(94);
						match(VAR);
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOL) {
							{
							setState(96);
							match(EOL);
							}
						}

						}
						}
						setState(101); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL))) != 0) );
					}
					break;
				case T__2:
					{
					setState(103);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106);
				match(T__3);
				setState(107);
				match(OBR);
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					cmd();
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(113);
				match(CBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==VOID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(MAIN);
				setState(117);
				match(T__1);
				setState(118);
				match(T__2);
				setState(119);
				match(T__3);
				setState(120);
				match(OBR);
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(121);
					cmd();
					}
					}
					setState(124); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(126);
				match(RET);
				setState(127);
				match(T__2);
				setState(128);
				match(EOL);
				setState(129);
				match(CBR);
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

	public static class CmdContext extends ParserRuleContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public TerminalNode EOL() { return getToken(myGramParser.EOL, 0); }
		public Init_Context init_() {
			return getRuleContext(Init_Context.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				atr();
				setState(134);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				init_();
				setState(137);
				match(EOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				print();
				setState(140);
				match(EOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				read();
				setState(143);
				match(EOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				ifstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				while_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				for_();
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(myGramParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode OBR() { return getToken(myGramParser.OBR, 0); }
		public TerminalNode CBR() { return getToken(myGramParser.CBR, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(WHILE);
			setState(151);
			match(T__1);
			setState(152);
			cond(0);
			setState(153);
			match(T__3);
			setState(154);
			match(OBR);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				cmd();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
			setState(160);
			match(CBR);
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

	public static class For_Context extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(myGramParser.FOR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<AtrContext> atr() {
			return getRuleContexts(AtrContext.class);
		}
		public AtrContext atr(int i) {
			return getRuleContext(AtrContext.class,i);
		}
		public TerminalNode OBR() { return getToken(myGramParser.OBR, 0); }
		public TerminalNode CBR() { return getToken(myGramParser.CBR, 0); }
		public Init_Context init_() {
			return getRuleContext(Init_Context.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(FOR);
			setState(163);
			match(T__1);
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(164);
				atr();
				}
				break;
			case 2:
				{
				setState(165);
				init_();
				}
				break;
			}
			setState(168);
			match(EOL);
			setState(169);
			cond(0);
			setState(170);
			match(EOL);
			setState(171);
			atr();
			setState(172);
			match(T__3);
			setState(173);
			match(OBR);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				cmd();
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
			setState(179);
			match(CBR);
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(myGramParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> OBR() { return getTokens(myGramParser.OBR); }
		public TerminalNode OBR(int i) {
			return getToken(myGramParser.OBR, i);
		}
		public List<TerminalNode> CBR() { return getTokens(myGramParser.CBR); }
		public TerminalNode CBR(int i) {
			return getToken(myGramParser.CBR, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode VAR() { return getToken(myGramParser.VAR, 0); }
		public TerminalNode ELSE() { return getToken(myGramParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifstmt);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(IF);
				setState(182);
				match(T__1);
				setState(183);
				cond(0);
				setState(184);
				match(T__3);
				setState(185);
				match(OBR);
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					cmd();
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(191);
				match(CBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(IF);
				setState(194);
				match(T__1);
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(195);
					match(VAR);
					}
					break;
				case T__4:
					{
					setState(196);
					match(T__4);
					setState(197);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200);
				match(T__3);
				setState(201);
				match(OBR);
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					cmd();
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(207);
				match(CBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(IF);
				setState(210);
				match(T__1);
				setState(211);
				cond(0);
				setState(212);
				match(T__3);
				setState(213);
				match(OBR);
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					cmd();
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(219);
				match(CBR);
				setState(220);
				match(ELSE);
				setState(221);
				match(OBR);
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					cmd();
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(227);
				match(CBR);
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

	public static class CondContext extends ParserRuleContext {
		public CdandContext cdand() {
			return getRuleContext(CdandContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode OR() { return getToken(myGramParser.OR, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			cdand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(234);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(235);
					match(OR);
					setState(236);
					cdand(0);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class CdandContext extends ParserRuleContext {
		public CndtsContext cndts() {
			return getRuleContext(CndtsContext.class,0);
		}
		public CdandContext cdand() {
			return getRuleContext(CdandContext.class,0);
		}
		public TerminalNode AND() { return getToken(myGramParser.AND, 0); }
		public CdandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdand; }
	}

	public final CdandContext cdand() throws RecognitionException {
		return cdand(0);
	}

	private CdandContext cdand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CdandContext _localctx = new CdandContext(_ctx, _parentState);
		CdandContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cdand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			cndts();
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CdandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cdand);
					setState(245);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(246);
					match(AND);
					setState(247);
					cndts();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class CndtsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CndtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cndts; }
	}

	public final CndtsContext cndts() throws RecognitionException {
		CndtsContext _localctx = new CndtsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cndts);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				expr(0);
				setState(254);
				relop();
				setState(255);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__1);
				setState(258);
				cond(0);
				setState(259);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode GRT() { return getToken(myGramParser.GRT, 0); }
		public TerminalNode LESS() { return getToken(myGramParser.LESS, 0); }
		public TerminalNode GRTEQ() { return getToken(myGramParser.GRTEQ, 0); }
		public TerminalNode LESSEQ() { return getToken(myGramParser.LESSEQ, 0); }
		public TerminalNode EQ() { return getToken(myGramParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(myGramParser.NEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRT) | (1L << LESS) | (1L << GRTEQ) | (1L << LESSEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(myGramParser.READ, 0); }
		public TerminalNode VAR() { return getToken(myGramParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_read);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(READ);
				setState(266);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(READ);
				setState(268);
				type_();
				setState(269);
				match(VAR);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(myGramParser.PRINT, 0); }
		public List<TerminalNode> STRVALUE() { return getTokens(myGramParser.STRVALUE); }
		public TerminalNode STRVALUE(int i) {
			return getToken(myGramParser.STRVALUE, i);
		}
		public List<TerminalNode> VAR() { return getTokens(myGramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(myGramParser.VAR, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(PRINT);
				setState(274);
				match(T__1);
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(275);
						match(T__5);
						}
					}

					setState(278);
					match(STRVALUE);
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(279);
						match(T__5);
						}
						break;
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(282);
						match(VAR);
						}
					}

					}
					}
					setState(287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__5 || _la==STRVALUE );
				setState(289);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(PRINT);
				setState(291);
				match(T__1);
				setState(292);
				match(VAR);
				setState(293);
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

	public static class Init_Context extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VAR() { return getToken(myGramParser.VAR, 0); }
		public Init_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_; }
	}

	public final Init_Context init_() throws RecognitionException {
		Init_Context _localctx = new Init_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_init_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			type_();
			setState(297);
			match(VAR);
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

	public static class RetrContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(myGramParser.RET, 0); }
		public TerminalNode VAR() { return getToken(myGramParser.VAR, 0); }
		public TerminalNode EOL() { return getToken(myGramParser.EOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retr; }
	}

	public final RetrContext retr() throws RecognitionException {
		RetrContext _localctx = new RetrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retr);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(RET);
				setState(300);
				match(VAR);
				setState(301);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(RET);
				setState(303);
				expr(0);
				setState(304);
				match(EOL);
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

	public static class AtrContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(myGramParser.INT, 0); }
		public TerminalNode VAR() { return getToken(myGramParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(myGramParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(myGramParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(myGramParser.STRING, 0); }
		public TerminalNode STRVALUE() { return getToken(myGramParser.STRVALUE, 0); }
		public TerminalNode BOOL() { return getToken(myGramParser.BOOL, 0); }
		public TerminalNode TRUE() { return getToken(myGramParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(myGramParser.FALSE, 0); }
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atr);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(INT);
				setState(309);
				match(VAR);
				setState(310);
				match(T__6);
				setState(311);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(DOUBLE);
				setState(313);
				match(VAR);
				setState(314);
				match(T__6);
				setState(315);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(FLOAT);
				setState(317);
				match(VAR);
				setState(318);
				match(T__6);
				setState(319);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(STRING);
				setState(321);
				match(VAR);
				setState(322);
				match(T__6);
				setState(323);
				match(STRVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				match(BOOL);
				setState(325);
				match(VAR);
				setState(326);
				match(T__6);
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				match(VAR);
				setState(329);
				match(T__6);
				setState(330);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(331);
				match(VAR);
				setState(332);
				match(T__6);
				setState(333);
				match(STRVALUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				match(VAR);
				setState(335);
				match(T__6);
				setState(336);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(343);
						match(T__5);
						setState(344);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(346);
						match(T__7);
						setState(347);
						term(0);
						}
						break;
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(354);
			fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(356);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(357);
						match(T__8);
						setState(358);
						fact();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(359);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(360);
						match(T__9);
						setState(361);
						fact();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(362);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(363);
						match(T__10);
						setState(364);
						fact();
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(myGramParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(myGramParser.NUM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fact);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(NUM);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				match(T__1);
				setState(373);
				expr(0);
				setState(374);
				match(T__3);
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

	public static class Type_Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(myGramParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(myGramParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(myGramParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(myGramParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(myGramParser.BOOL, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
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
		case 7:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 8:
			return cdand_sempred((CdandContext)_localctx, predIndex);
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 17:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cdand_sempred(CdandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u017f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\6\2/\n\2\r\2\16\2\60\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\3\3\3\5\3A\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\6\4L\n\4\r\4\16\4M\3\4\5\4Q\n\4\3\4\3"+
		"\4\3\4\6\4V\n\4\r\4\16\4W\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"d\n\4\6\4f\n\4\r\4\16\4g\3\4\5\4k\n\4\3\4\3\4\3\4\6\4p\n\4\r\4\16\4q\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4}\n\4\r\4\16\4~\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u0086\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0097\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u009f\n\6\r\6\16\6"+
		"\u00a0\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00a9\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\6\7\u00b2\n\7\r\7\16\7\u00b3\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00be"+
		"\n\b\r\b\16\b\u00bf\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c9\n\b\3\b\3\b"+
		"\3\b\6\b\u00ce\n\b\r\b\16\b\u00cf\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b"+
		"\u00da\n\b\r\b\16\b\u00db\3\b\3\b\3\b\3\b\6\b\u00e2\n\b\r\b\16\b\u00e3"+
		"\3\b\3\b\5\b\u00e8\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f0\n\t\f\t\16\t"+
		"\u00f3\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00fb\n\n\f\n\16\n\u00fe\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0108\n\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0112\n\r\3\16\3\16\3\16\5\16\u0117\n\16\3\16\3"+
		"\16\5\16\u011b\n\16\3\16\5\16\u011e\n\16\6\16\u0120\n\16\r\16\16\16\u0121"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0129\n\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0135\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0154\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u015f\n\22\f\22\16\22\u0162\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0170"+
		"\n\23\f\23\16\23\u0173\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u017b"+
		"\n\24\3\25\3\25\3\25\2\6\20\22\"$\26\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(\2\6\4\2  $$\3\2\24\31\3\2\20\21\4\2 #%%\u01a1\2<\3\2\2\2"+
		"\4@\3\2\2\2\6\u0085\3\2\2\2\b\u0096\3\2\2\2\n\u0098\3\2\2\2\f\u00a4\3"+
		"\2\2\2\16\u00e7\3\2\2\2\20\u00e9\3\2\2\2\22\u00f4\3\2\2\2\24\u0107\3\2"+
		"\2\2\26\u0109\3\2\2\2\30\u0111\3\2\2\2\32\u0128\3\2\2\2\34\u012a\3\2\2"+
		"\2\36\u0134\3\2\2\2 \u0153\3\2\2\2\"\u0155\3\2\2\2$\u0163\3\2\2\2&\u017a"+
		"\3\2\2\2(\u017c\3\2\2\2*+\5\4\3\2+,\7*\2\2,/\3\2\2\2-/\5\6\4\2.*\3\2\2"+
		"\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63"+
		"\7\2\2\3\63=\3\2\2\2\64\65\7\17\2\2\65\66\7\25\2\2\66\67\7-\2\2\678\7"+
		"\3\2\289\7\16\2\29:\7\24\2\2:;\7*\2\2;=\5\2\2\2<.\3\2\2\2<\64\3\2\2\2"+
		"=\3\3\2\2\2>A\5 \21\2?A\5\34\17\2@>\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BC\5("+
		"\25\2CD\7-\2\2DP\7\4\2\2EF\5(\25\2FG\7-\2\2GI\3\2\2\2HJ\7*\2\2IH\3\2\2"+
		"\2IJ\3\2\2\2JL\3\2\2\2KE\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2"+
		"\2OQ\7\5\2\2PK\3\2\2\2PO\3\2\2\2QR\3\2\2\2RS\7\6\2\2SU\7(\2\2TV\5\b\5"+
		"\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\36\20\2Z[\7)"+
		"\2\2[\u0086\3\2\2\2\\]\7$\2\2]^\7-\2\2^j\7\4\2\2_`\5(\25\2`a\7-\2\2ac"+
		"\3\2\2\2bd\7*\2\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2e_\3\2\2\2fg\3\2\2\2ge"+
		"\3\2\2\2gh\3\2\2\2hk\3\2\2\2ik\7\5\2\2je\3\2\2\2ji\3\2\2\2kl\3\2\2\2l"+
		"m\7\6\2\2mo\7(\2\2np\5\b\5\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r"+
		"s\3\2\2\2st\7)\2\2t\u0086\3\2\2\2uv\t\2\2\2vw\7\37\2\2wx\7\4\2\2xy\7\5"+
		"\2\2yz\7\6\2\2z|\7(\2\2{}\5\b\5\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\'\2\2\u0081\u0082\7\5\2\2\u0082"+
		"\u0083\7*\2\2\u0083\u0084\7)\2\2\u0084\u0086\3\2\2\2\u0085B\3\2\2\2\u0085"+
		"\\\3\2\2\2\u0085u\3\2\2\2\u0086\7\3\2\2\2\u0087\u0088\5 \21\2\u0088\u0089"+
		"\7*\2\2\u0089\u0097\3\2\2\2\u008a\u008b\5\34\17\2\u008b\u008c\7*\2\2\u008c"+
		"\u0097\3\2\2\2\u008d\u008e\5\32\16\2\u008e\u008f\7*\2\2\u008f\u0097\3"+
		"\2\2\2\u0090\u0091\5\30\r\2\u0091\u0092\7*\2\2\u0092\u0097\3\2\2\2\u0093"+
		"\u0097\5\16\b\2\u0094\u0097\5\n\6\2\u0095\u0097\5\f\7\2\u0096\u0087\3"+
		"\2\2\2\u0096\u008a\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u0090\3\2\2\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\t\3\2\2\2"+
		"\u0098\u0099\7\23\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5\20\t\2\u009b\u009c"+
		"\7\6\2\2\u009c\u009e\7(\2\2\u009d\u009f\5\b\5\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\7)\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a8"+
		"\7\4\2\2\u00a6\u00a9\5 \21\2\u00a7\u00a9\5\34\17\2\u00a8\u00a6\3\2\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\u00ac"+
		"\5\20\t\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\5 \21\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b1\7(\2\2\u00b0\u00b2\5\b\5\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7)\2\2\u00b6\r\3\2\2\2\u00b7\u00b8\7\33\2\2\u00b8\u00b9\7\4\2\2"+
		"\u00b9\u00ba\5\20\t\2\u00ba\u00bb\7\6\2\2\u00bb\u00bd\7(\2\2\u00bc\u00be"+
		"\5\b\5\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7)\2\2\u00c2\u00e8\3\2"+
		"\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00c8\7\4\2\2\u00c5\u00c9\7-\2\2\u00c6"+
		"\u00c7\7\7\2\2\u00c7\u00c9\7-\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cd\7(\2\2\u00cc"+
		"\u00ce\5\b\5\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7)\2\2\u00d2"+
		"\u00e8\3\2\2\2\u00d3\u00d4\7\33\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00d6\5"+
		"\20\t\2\u00d6\u00d7\7\6\2\2\u00d7\u00d9\7(\2\2\u00d8\u00da\5\b\5\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7)\2\2\u00de\u00df\7\35\2\2\u00df"+
		"\u00e1\7(\2\2\u00e0\u00e2\5\b\5\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\7)\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00b7\3\2\2\2\u00e7\u00c3\3\2"+
		"\2\2\u00e7\u00d3\3\2\2\2\u00e8\17\3\2\2\2\u00e9\u00ea\b\t\1\2\u00ea\u00eb"+
		"\5\22\n\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7\32\2\2"+
		"\u00ee\u00f0\5\22\n\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\21\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\b\n\1\2\u00f5\u00f6\5\24\13\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\f"+
		"\4\2\2\u00f8\u00f9\7\34\2\2\u00f9\u00fb\5\24\13\2\u00fa\u00f7\3\2\2\2"+
		"\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\23"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\5\"\22\2\u0100\u0101\5\26\f\2"+
		"\u0101\u0102\5\"\22\2\u0102\u0108\3\2\2\2\u0103\u0104\7\4\2\2\u0104\u0105"+
		"\5\20\t\2\u0105\u0106\7\6\2\2\u0106\u0108\3\2\2\2\u0107\u00ff\3\2\2\2"+
		"\u0107\u0103\3\2\2\2\u0108\25\3\2\2\2\u0109\u010a\t\3\2\2\u010a\27\3\2"+
		"\2\2\u010b\u010c\7&\2\2\u010c\u0112\7-\2\2\u010d\u010e\7&\2\2\u010e\u010f"+
		"\5(\25\2\u010f\u0110\7-\2\2\u0110\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0111"+
		"\u010d\3\2\2\2\u0112\31\3\2\2\2\u0113\u0114\7\36\2\2\u0114\u011f\7\4\2"+
		"\2\u0115\u0117\7\b\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u011a\7,\2\2\u0119\u011b\7\b\2\2\u011a\u0119\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\7-\2\2\u011d\u011c\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0116\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0129\7\6\2\2\u0124\u0125\7\36\2\2\u0125\u0126\7\4\2\2\u0126"+
		"\u0127\7-\2\2\u0127\u0129\7\6\2\2\u0128\u0113\3\2\2\2\u0128\u0124\3\2"+
		"\2\2\u0129\33\3\2\2\2\u012a\u012b\5(\25\2\u012b\u012c\7-\2\2\u012c\35"+
		"\3\2\2\2\u012d\u012e\7\'\2\2\u012e\u012f\7-\2\2\u012f\u0135\7*\2\2\u0130"+
		"\u0131\7\'\2\2\u0131\u0132\5\"\22\2\u0132\u0133\7*\2\2\u0133\u0135\3\2"+
		"\2\2\u0134\u012d\3\2\2\2\u0134\u0130\3\2\2\2\u0135\37\3\2\2\2\u0136\u0137"+
		"\7 \2\2\u0137\u0138\7-\2\2\u0138\u0139\7\t\2\2\u0139\u0154\5\"\22\2\u013a"+
		"\u013b\7\"\2\2\u013b\u013c\7-\2\2\u013c\u013d\7\t\2\2\u013d\u0154\5\""+
		"\22\2\u013e\u013f\7!\2\2\u013f\u0140\7-\2\2\u0140\u0141\7\t\2\2\u0141"+
		"\u0154\5\"\22\2\u0142\u0143\7#\2\2\u0143\u0144\7-\2\2\u0144\u0145\7\t"+
		"\2\2\u0145\u0154\7,\2\2\u0146\u0147\7%\2\2\u0147\u0148\7-\2\2\u0148\u0149"+
		"\7\t\2\2\u0149\u0154\t\4\2\2\u014a\u014b\7-\2\2\u014b\u014c\7\t\2\2\u014c"+
		"\u0154\5\"\22\2\u014d\u014e\7-\2\2\u014e\u014f\7\t\2\2\u014f\u0154\7,"+
		"\2\2\u0150\u0151\7-\2\2\u0151\u0152\7\t\2\2\u0152\u0154\t\4\2\2\u0153"+
		"\u0136\3\2\2\2\u0153\u013a\3\2\2\2\u0153\u013e\3\2\2\2\u0153\u0142\3\2"+
		"\2\2\u0153\u0146\3\2\2\2\u0153\u014a\3\2\2\2\u0153\u014d\3\2\2\2\u0153"+
		"\u0150\3\2\2\2\u0154!\3\2\2\2\u0155\u0156\b\22\1\2\u0156\u0157\5$\23\2"+
		"\u0157\u0160\3\2\2\2\u0158\u0159\f\4\2\2\u0159\u015a\7\b\2\2\u015a\u015f"+
		"\5$\23\2\u015b\u015c\f\3\2\2\u015c\u015d\7\n\2\2\u015d\u015f\5$\23\2\u015e"+
		"\u0158\3\2\2\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161#\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164"+
		"\b\23\1\2\u0164\u0165\5&\24\2\u0165\u0171\3\2\2\2\u0166\u0167\f\5\2\2"+
		"\u0167\u0168\7\13\2\2\u0168\u0170\5&\24\2\u0169\u016a\f\4\2\2\u016a\u016b"+
		"\7\f\2\2\u016b\u0170\5&\24\2\u016c\u016d\f\3\2\2\u016d\u016e\7\r\2\2\u016e"+
		"\u0170\5&\24\2\u016f\u0166\3\2\2\2\u016f\u0169\3\2\2\2\u016f\u016c\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"%\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u017b\7-\2\2\u0175\u017b\7/\2\2\u0176"+
		"\u0177\7\4\2\2\u0177\u0178\5\"\22\2\u0178\u0179\7\6\2\2\u0179\u017b\3"+
		"\2\2\2\u017a\u0174\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u0176\3\2\2\2\u017b"+
		"\'\3\2\2\2\u017c\u017d\t\5\2\2\u017d)\3\2\2\2*.\60<@IMPWcgjq~\u0085\u0096"+
		"\u00a0\u00a8\u00b3\u00bf\u00c8\u00cf\u00db\u00e3\u00e7\u00f1\u00fc\u0107"+
		"\u0111\u0116\u011a\u011d\u0121\u0128\u0134\u0153\u015e\u0160\u016f\u0171"+
		"\u017a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}