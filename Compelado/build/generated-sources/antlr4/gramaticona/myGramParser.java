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
		T__9=10, T__10=11, T__11=12, GRAMATICA=13, IMPORT=14, TRUE=15, FALSE=16, 
		FOR=17, WHILE=18, GRT=19, LESS=20, GRTEQ=21, LESSEQ=22, EQ=23, NEQ=24, 
		OR=25, IF=26, AND=27, ELSE=28, PRINT=29, MAIN=30, INT=31, FLOAT=32, DOUBLE=33, 
		STRING=34, VOID=35, BOOL=36, READ=37, RET=38, OBR=39, CBR=40, EOL=41, 
		GLOBAL=42, STRVALUE=43, VAR=44, PRINTCONC=45, NUM=46, COMMENT=47, LINE_COMMENT=48, 
		WS=49, COM=50;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_func = 2, RULE_cmd = 3, RULE_callfunc = 4, 
		RULE_while_ = 5, RULE_for_ = 6, RULE_ifstmt = 7, RULE_cond = 8, RULE_cdand = 9, 
		RULE_cndts = 10, RULE_relop = 11, RULE_read = 12, RULE_print = 13, RULE_init_ = 14, 
		RULE_retr = 15, RULE_atr = 16, RULE_expr = 17, RULE_term = 18, RULE_fact = 19, 
		RULE_type_ = 20;
	public static final String[] ruleNames = {
		"prog", "line", "func", "cmd", "callfunc", "while_", "for_", "ifstmt", 
		"cond", "cdand", "cndts", "relop", "read", "print", "init_", "retr", "atr", 
		"expr", "term", "fact", "type_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "'0'", "')'", "','", "'!'", "'+'", "'='", "'-'", "'*'", 
		"'/'", "'%'", "'gramaticaextensao'", "'import'", "'true'", "'false'", 
		"'for'", "'while'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'||'", 
		"'if'", "'&&'", "'else'", "'print'", "'main'", "'int'", "'float'", "'double'", 
		"'string'", "'void'", "'boolean'", "'read'", "'return'", "'{'", "'}'", 
		"';'", "'global'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "GRAMATICA", "IMPORT", "TRUE", "FALSE", "FOR", "WHILE", "GRT", "LESS", 
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
			setState(60);
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
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(42);
						line();
						setState(43);
						match(EOL);
						}
						break;
					case 2:
						{
						setState(45);
						func();
						}
						break;
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << BOOL) | (1L << VAR))) != 0) );
				setState(50);
				match(EOF);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(IMPORT);
				setState(53);
				match(LESS);
				setState(54);
				match(VAR);
				setState(55);
				match(T__0);
				setState(56);
				match(GRAMATICA);
				setState(57);
				match(GRT);
				setState(58);
				match(EOL);
				setState(59);
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
		public CallfuncContext callfunc() {
			return getRuleContext(CallfuncContext.class,0);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				atr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				init_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				callfunc();
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				type_();
				setState(68);
				match(VAR);
				setState(69);
				match(T__1);
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
					{
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(70);
						type_();
						setState(71);
						match(VAR);
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOL) {
							{
							setState(73);
							match(EOL);
							}
						}

						}
						}
						setState(78); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL))) != 0) );
					}
					break;
				case T__2:
					{
					setState(80);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83);
				match(T__3);
				setState(84);
				match(OBR);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					cmd();
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(90);
				retr();
				setState(91);
				match(CBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(VOID);
				setState(94);
				match(VAR);
				setState(95);
				match(T__1);
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
					{
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(96);
						type_();
						setState(97);
						match(VAR);
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOL) {
							{
							setState(99);
							match(EOL);
							}
						}

						}
						}
						setState(104); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL))) != 0) );
					}
					break;
				case T__2:
					{
					setState(106);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109);
				match(T__3);
				setState(110);
				match(OBR);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					cmd();
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(116);
				match(CBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==VOID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				match(MAIN);
				setState(120);
				match(T__1);
				setState(121);
				match(T__2);
				setState(122);
				match(T__3);
				setState(123);
				match(OBR);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					cmd();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(129);
				match(RET);
				setState(130);
				match(T__2);
				setState(131);
				match(EOL);
				setState(132);
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
		public CallfuncContext callfunc() {
			return getRuleContext(CallfuncContext.class,0);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				atr();
				setState(137);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				init_();
				setState(140);
				match(EOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				print();
				setState(143);
				match(EOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				read();
				setState(146);
				match(EOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				ifstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				while_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				for_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				callfunc();
				setState(152);
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

	public static class CallfuncContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(myGramParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(myGramParser.VAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(myGramParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(myGramParser.NUM, i);
		}
		public CallfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunc; }
	}

	public final CallfuncContext callfunc() throws RecognitionException {
		CallfuncContext _localctx = new CallfuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_callfunc);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(VAR);
				setState(157);
				match(T__1);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158);
					_la = _input.LA(1);
					if ( !(_la==VAR || _la==NUM) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(159);
						match(T__4);
						}
					}

					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VAR || _la==NUM );
				setState(166);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(VAR);
				setState(168);
				match(T__1);
				setState(169);
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
		enterRule(_localctx, 10, RULE_while_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WHILE);
			setState(173);
			match(T__1);
			setState(174);
			cond(0);
			setState(175);
			match(T__3);
			setState(176);
			match(OBR);
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				cmd();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
			setState(182);
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
		enterRule(_localctx, 12, RULE_for_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FOR);
			setState(185);
			match(T__1);
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(186);
				atr();
				}
				break;
			case 2:
				{
				setState(187);
				init_();
				}
				break;
			}
			setState(190);
			match(EOL);
			setState(191);
			cond(0);
			setState(192);
			match(EOL);
			setState(193);
			atr();
			setState(194);
			match(T__3);
			setState(195);
			match(OBR);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				cmd();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
			setState(201);
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
		enterRule(_localctx, 14, RULE_ifstmt);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IF);
				setState(204);
				match(T__1);
				setState(205);
				cond(0);
				setState(206);
				match(T__3);
				setState(207);
				match(OBR);
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208);
					cmd();
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(213);
				match(CBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(IF);
				setState(216);
				match(T__1);
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(217);
					match(VAR);
					}
					break;
				case T__5:
					{
					setState(218);
					match(T__5);
					setState(219);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222);
				match(T__3);
				setState(223);
				match(OBR);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					cmd();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(229);
				match(CBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(IF);
				setState(232);
				match(T__1);
				setState(233);
				cond(0);
				setState(234);
				match(T__3);
				setState(235);
				match(OBR);
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					cmd();
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(241);
				match(CBR);
				setState(242);
				match(ELSE);
				setState(243);
				match(OBR);
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(244);
					cmd();
					}
					}
					setState(247); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOL) | (1L << READ) | (1L << VAR))) != 0) );
				setState(249);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(254);
			cdand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(256);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(257);
					match(OR);
					setState(258);
					cdand(0);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_cdand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(265);
			cndts();
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CdandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cdand);
					setState(267);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(268);
					match(AND);
					setState(269);
					cndts();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 20, RULE_cndts);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				expr(0);
				setState(276);
				relop();
				setState(277);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__1);
				setState(280);
				cond(0);
				setState(281);
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
		enterRule(_localctx, 22, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 24, RULE_read);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(READ);
				setState(288);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(READ);
				setState(290);
				type_();
				setState(291);
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
		enterRule(_localctx, 26, RULE_print);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(PRINT);
				setState(296);
				match(T__1);
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(297);
						match(T__6);
						}
					}

					setState(300);
					match(STRVALUE);
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(301);
						match(T__6);
						}
						break;
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(304);
						match(VAR);
						}
					}

					}
					}
					setState(309); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 || _la==STRVALUE );
				setState(311);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(PRINT);
				setState(313);
				match(T__1);
				setState(314);
				match(VAR);
				setState(315);
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
		enterRule(_localctx, 28, RULE_init_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			type_();
			setState(319);
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
		enterRule(_localctx, 30, RULE_retr);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(RET);
				setState(322);
				match(VAR);
				setState(323);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(RET);
				setState(325);
				expr(0);
				setState(326);
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
		public CallfuncContext callfunc() {
			return getRuleContext(CallfuncContext.class,0);
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
		enterRule(_localctx, 32, RULE_atr);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(INT);
				setState(331);
				match(VAR);
				setState(332);
				match(T__7);
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(333);
					expr(0);
					}
					break;
				case 2:
					{
					setState(334);
					callfunc();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(DOUBLE);
				setState(338);
				match(VAR);
				setState(339);
				match(T__7);
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(340);
					expr(0);
					}
					break;
				case 2:
					{
					setState(341);
					callfunc();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(FLOAT);
				setState(345);
				match(VAR);
				setState(346);
				match(T__7);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(347);
					expr(0);
					}
					break;
				case 2:
					{
					setState(348);
					callfunc();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(STRING);
				setState(352);
				match(VAR);
				setState(353);
				match(T__7);
				setState(356);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRVALUE:
					{
					setState(354);
					match(STRVALUE);
					}
					break;
				case VAR:
					{
					setState(355);
					callfunc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(BOOL);
				setState(359);
				match(VAR);
				setState(360);
				match(T__7);
				setState(361);
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
				setState(362);
				match(VAR);
				setState(363);
				match(T__7);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(364);
					expr(0);
					}
					break;
				case 2:
					{
					setState(365);
					callfunc();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(368);
				match(VAR);
				setState(369);
				match(T__7);
				setState(372);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRVALUE:
					{
					setState(370);
					match(STRVALUE);
					}
					break;
				case VAR:
					{
					setState(371);
					callfunc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(374);
				match(VAR);
				setState(375);
				match(T__7);
				setState(376);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(380);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(388);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(382);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(383);
						match(T__6);
						setState(384);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(385);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(386);
						match(T__8);
						setState(387);
						term(0);
						}
						break;
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394);
			fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(396);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(397);
						match(T__9);
						setState(398);
						fact();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(399);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(400);
						match(T__10);
						setState(401);
						fact();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(402);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(403);
						match(T__11);
						setState(404);
						fact();
						}
						break;
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 38, RULE_fact);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(NUM);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(T__1);
				setState(413);
				expr(0);
				setState(414);
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
		enterRule(_localctx, 40, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
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
		case 8:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 9:
			return cdand_sempred((CdandContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 18:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\6\2\61\n\2\r"+
		"\2\16\2\62\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2?\n\2\3\3\3\3\3"+
		"\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\6\4O\n\4\r\4\16\4P\3"+
		"\4\5\4T\n\4\3\4\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4g\n\4\6\4i\n\4\r\4\16\4j\3\4\5\4n\n\4\3\4\3\4\3\4\6\4"+
		"s\n\4\r\4\16\4t\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u0080\n\4\r\4"+
		"\16\4\u0081\3\4\3\4\3\4\3\4\3\4\5\4\u0089\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009d\n\5\3\6\3\6"+
		"\3\6\3\6\5\6\u00a3\n\6\6\6\u00a5\n\6\r\6\16\6\u00a6\3\6\3\6\3\6\3\6\5"+
		"\6\u00ad\n\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00b5\n\7\r\7\16\7\u00b6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\5\b\u00bf\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00c8"+
		"\n\b\r\b\16\b\u00c9\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00d4\n\t\r\t"+
		"\16\t\u00d5\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00df\n\t\3\t\3\t\3\t\6\t"+
		"\u00e4\n\t\r\t\16\t\u00e5\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00f0\n"+
		"\t\r\t\16\t\u00f1\3\t\3\t\3\t\3\t\6\t\u00f8\n\t\r\t\16\t\u00f9\3\t\3\t"+
		"\5\t\u00fe\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0106\n\n\f\n\16\n\u0109\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0111\n\13\f\13\16\13\u0114\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u011e\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0128\n\16\3\17\3\17\3\17\5\17\u012d\n\17\3\17\3"+
		"\17\5\17\u0131\n\17\3\17\5\17\u0134\n\17\6\17\u0136\n\17\r\17\16\17\u0137"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u013f\n\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u014b\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0152"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0159\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0160\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0167\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u0171\n\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0177\n\22\3\22\3\22\3\22\5\22\u017c\n\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u0187\n\23\f\23\16\23\u018a\13\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0198\n\24\f\24"+
		"\16\24\u019b\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01a3\n\25\3\26"+
		"\3\26\3\26\2\6\22\24$&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*\2\7\4\2!!%%\4\2..\60\60\3\2\25\32\3\2\21\22\4\2!$&&\u01d3\2>\3\2\2"+
		"\2\4C\3\2\2\2\6\u0088\3\2\2\2\b\u009c\3\2\2\2\n\u00ac\3\2\2\2\f\u00ae"+
		"\3\2\2\2\16\u00ba\3\2\2\2\20\u00fd\3\2\2\2\22\u00ff\3\2\2\2\24\u010a\3"+
		"\2\2\2\26\u011d\3\2\2\2\30\u011f\3\2\2\2\32\u0127\3\2\2\2\34\u013e\3\2"+
		"\2\2\36\u0140\3\2\2\2 \u014a\3\2\2\2\"\u017b\3\2\2\2$\u017d\3\2\2\2&\u018b"+
		"\3\2\2\2(\u01a2\3\2\2\2*\u01a4\3\2\2\2,-\5\4\3\2-.\7+\2\2.\61\3\2\2\2"+
		"/\61\5\6\4\2\60,\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\7\2\2\3\65?\3\2\2\2\66\67\7\20\2\2\678\7"+
		"\26\2\289\7.\2\29:\7\3\2\2:;\7\17\2\2;<\7\25\2\2<=\7+\2\2=?\5\2\2\2>\60"+
		"\3\2\2\2>\66\3\2\2\2?\3\3\2\2\2@D\5\"\22\2AD\5\36\20\2BD\5\n\6\2C@\3\2"+
		"\2\2CA\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EF\5*\26\2FG\7.\2\2GS\7\4\2\2HI\5*"+
		"\26\2IJ\7.\2\2JL\3\2\2\2KM\7+\2\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2NH\3\2"+
		"\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RT\7\5\2\2SN\3\2\2\2SR\3\2"+
		"\2\2TU\3\2\2\2UV\7\6\2\2VX\7)\2\2WY\5\b\5\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\5 \21\2]^\7*\2\2^\u0089\3\2\2\2_`\7%\2\2"+
		"`a\7.\2\2am\7\4\2\2bc\5*\26\2cd\7.\2\2df\3\2\2\2eg\7+\2\2fe\3\2\2\2fg"+
		"\3\2\2\2gi\3\2\2\2hb\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2l"+
		"n\7\5\2\2mh\3\2\2\2ml\3\2\2\2no\3\2\2\2op\7\6\2\2pr\7)\2\2qs\5\b\5\2r"+
		"q\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7*\2\2w\u0089\3\2"+
		"\2\2xy\t\2\2\2yz\7 \2\2z{\7\4\2\2{|\7\5\2\2|}\7\6\2\2}\177\7)\2\2~\u0080"+
		"\5\b\5\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7(\2\2\u0084\u0085\7\5\2\2\u0085"+
		"\u0086\7+\2\2\u0086\u0087\7*\2\2\u0087\u0089\3\2\2\2\u0088E\3\2\2\2\u0088"+
		"_\3\2\2\2\u0088x\3\2\2\2\u0089\7\3\2\2\2\u008a\u008b\5\"\22\2\u008b\u008c"+
		"\7+\2\2\u008c\u009d\3\2\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7+\2\2\u008f"+
		"\u009d\3\2\2\2\u0090\u0091\5\34\17\2\u0091\u0092\7+\2\2\u0092\u009d\3"+
		"\2\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7+\2\2\u0095\u009d\3\2\2\2\u0096"+
		"\u009d\5\20\t\2\u0097\u009d\5\f\7\2\u0098\u009d\5\16\b\2\u0099\u009a\5"+
		"\n\6\2\u009a\u009b\7+\2\2\u009b\u009d\3\2\2\2\u009c\u008a\3\2\2\2\u009c"+
		"\u008d\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0096\3\2"+
		"\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009d"+
		"\t\3\2\2\2\u009e\u009f\7.\2\2\u009f\u00a4\7\4\2\2\u00a0\u00a2\t\3\2\2"+
		"\u00a1\u00a3\7\7\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ad\7\6\2\2\u00a9\u00aa\7."+
		"\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00ad\7\6\2\2\u00ac\u009e\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ad\13\3\2\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0\7\4\2"+
		"\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\7\6\2\2\u00b2\u00b4\7)\2\2\u00b3\u00b5"+
		"\5\b\5\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7*\2\2\u00b9\r\3\2\2\2"+
		"\u00ba\u00bb\7\23\2\2\u00bb\u00be\7\4\2\2\u00bc\u00bf\5\"\22\2\u00bd\u00bf"+
		"\5\36\20\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2"+
		"\u00c0\u00c1\7+\2\2\u00c1\u00c2\5\22\n\2\u00c2\u00c3\7+\2\2\u00c3\u00c4"+
		"\5\"\22\2\u00c4\u00c5\7\6\2\2\u00c5\u00c7\7)\2\2\u00c6\u00c8\5\b\5\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc\17\3\2\2\2\u00cd\u00ce"+
		"\7\34\2\2\u00ce\u00cf\7\4\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\7\6\2\2"+
		"\u00d1\u00d3\7)\2\2\u00d2\u00d4\5\b\5\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\7*\2\2\u00d8\u00fe\3\2\2\2\u00d9\u00da\7\34\2\2\u00da\u00de\7\4"+
		"\2\2\u00db\u00df\7.\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00df\7.\2\2\u00de\u00db"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\6\2\2\u00e1"+
		"\u00e3\7)\2\2\u00e2\u00e4\5\b\5\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\7*\2\2\u00e8\u00fe\3\2\2\2\u00e9\u00ea\7\34\2\2\u00ea\u00eb\7\4"+
		"\2\2\u00eb\u00ec\5\22\n\2\u00ec\u00ed\7\6\2\2\u00ed\u00ef\7)\2\2\u00ee"+
		"\u00f0\5\b\5\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4"+
		"\u00f5\7\36\2\2\u00f5\u00f7\7)\2\2\u00f6\u00f8\5\b\5\2\u00f7\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\7*\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00cd\3\2"+
		"\2\2\u00fd\u00d9\3\2\2\2\u00fd\u00e9\3\2\2\2\u00fe\21\3\2\2\2\u00ff\u0100"+
		"\b\n\1\2\u0100\u0101\5\24\13\2\u0101\u0107\3\2\2\2\u0102\u0103\f\4\2\2"+
		"\u0103\u0104\7\33\2\2\u0104\u0106\5\24\13\2\u0105\u0102\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\23\3\2\2"+
		"\2\u0109\u0107\3\2\2\2\u010a\u010b\b\13\1\2\u010b\u010c\5\26\f\2\u010c"+
		"\u0112\3\2\2\2\u010d\u010e\f\4\2\2\u010e\u010f\7\35\2\2\u010f\u0111\5"+
		"\26\f\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\25\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\5$\23"+
		"\2\u0116\u0117\5\30\r\2\u0117\u0118\5$\23\2\u0118\u011e\3\2\2\2\u0119"+
		"\u011a\7\4\2\2\u011a\u011b\5\22\n\2\u011b\u011c\7\6\2\2\u011c\u011e\3"+
		"\2\2\2\u011d\u0115\3\2\2\2\u011d\u0119\3\2\2\2\u011e\27\3\2\2\2\u011f"+
		"\u0120\t\4\2\2\u0120\31\3\2\2\2\u0121\u0122\7\'\2\2\u0122\u0128\7.\2\2"+
		"\u0123\u0124\7\'\2\2\u0124\u0125\5*\26\2\u0125\u0126\7.\2\2\u0126\u0128"+
		"\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0123\3\2\2\2\u0128\33\3\2\2\2\u0129"+
		"\u012a\7\37\2\2\u012a\u0135\7\4\2\2\u012b\u012d\7\t\2\2\u012c\u012b\3"+
		"\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\7-\2\2\u012f"+
		"\u0131\7\t\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2"+
		"\2\2\u0132\u0134\7.\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u012c\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013f\7\6\2\2\u013a"+
		"\u013b\7\37\2\2\u013b\u013c\7\4\2\2\u013c\u013d\7.\2\2\u013d\u013f\7\6"+
		"\2\2\u013e\u0129\3\2\2\2\u013e\u013a\3\2\2\2\u013f\35\3\2\2\2\u0140\u0141"+
		"\5*\26\2\u0141\u0142\7.\2\2\u0142\37\3\2\2\2\u0143\u0144\7(\2\2\u0144"+
		"\u0145\7.\2\2\u0145\u014b\7+\2\2\u0146\u0147\7(\2\2\u0147\u0148\5$\23"+
		"\2\u0148\u0149\7+\2\2\u0149\u014b\3\2\2\2\u014a\u0143\3\2\2\2\u014a\u0146"+
		"\3\2\2\2\u014b!\3\2\2\2\u014c\u014d\7!\2\2\u014d\u014e\7.\2\2\u014e\u0151"+
		"\7\n\2\2\u014f\u0152\5$\23\2\u0150\u0152\5\n\6\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u017c\3\2\2\2\u0153\u0154\7#\2\2\u0154\u0155\7.\2"+
		"\2\u0155\u0158\7\n\2\2\u0156\u0159\5$\23\2\u0157\u0159\5\n\6\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u017c\3\2\2\2\u015a\u015b\7\"\2\2\u015b"+
		"\u015c\7.\2\2\u015c\u015f\7\n\2\2\u015d\u0160\5$\23\2\u015e\u0160\5\n"+
		"\6\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u017c\3\2\2\2\u0161"+
		"\u0162\7$\2\2\u0162\u0163\7.\2\2\u0163\u0166\7\n\2\2\u0164\u0167\7-\2"+
		"\2\u0165\u0167\5\n\6\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u017c"+
		"\3\2\2\2\u0168\u0169\7&\2\2\u0169\u016a\7.\2\2\u016a\u016b\7\n\2\2\u016b"+
		"\u017c\t\5\2\2\u016c\u016d\7.\2\2\u016d\u0170\7\n\2\2\u016e\u0171\5$\23"+
		"\2\u016f\u0171\5\n\6\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u017c"+
		"\3\2\2\2\u0172\u0173\7.\2\2\u0173\u0176\7\n\2\2\u0174\u0177\7-\2\2\u0175"+
		"\u0177\5\n\6\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u017c\3\2"+
		"\2\2\u0178\u0179\7.\2\2\u0179\u017a\7\n\2\2\u017a\u017c\t\5\2\2\u017b"+
		"\u014c\3\2\2\2\u017b\u0153\3\2\2\2\u017b\u015a\3\2\2\2\u017b\u0161\3\2"+
		"\2\2\u017b\u0168\3\2\2\2\u017b\u016c\3\2\2\2\u017b\u0172\3\2\2\2\u017b"+
		"\u0178\3\2\2\2\u017c#\3\2\2\2\u017d\u017e\b\23\1\2\u017e\u017f\5&\24\2"+
		"\u017f\u0188\3\2\2\2\u0180\u0181\f\4\2\2\u0181\u0182\7\t\2\2\u0182\u0187"+
		"\5&\24\2\u0183\u0184\f\3\2\2\u0184\u0185\7\13\2\2\u0185\u0187\5&\24\2"+
		"\u0186\u0180\3\2\2\2\u0186\u0183\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189%\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\u018c\b\24\1\2\u018c\u018d\5(\25\2\u018d\u0199\3\2\2\2\u018e\u018f\f"+
		"\5\2\2\u018f\u0190\7\f\2\2\u0190\u0198\5(\25\2\u0191\u0192\f\4\2\2\u0192"+
		"\u0193\7\r\2\2\u0193\u0198\5(\25\2\u0194\u0195\f\3\2\2\u0195\u0196\7\16"+
		"\2\2\u0196\u0198\5(\25\2\u0197\u018e\3\2\2\2\u0197\u0191\3\2\2\2\u0197"+
		"\u0194\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\'\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a3\7.\2\2\u019d\u01a3"+
		"\7\60\2\2\u019e\u019f\7\4\2\2\u019f\u01a0\5$\23\2\u01a0\u01a1\7\6\2\2"+
		"\u01a1\u01a3\3\2\2\2\u01a2\u019c\3\2\2\2\u01a2\u019d\3\2\2\2\u01a2\u019e"+
		"\3\2\2\2\u01a3)\3\2\2\2\u01a4\u01a5\t\6\2\2\u01a5+\3\2\2\2\63\60\62>C"+
		"LPSZfjmt\u0081\u0088\u009c\u00a2\u00a6\u00ac\u00b6\u00be\u00c9\u00d5\u00de"+
		"\u00e5\u00f1\u00f9\u00fd\u0107\u0112\u011d\u0127\u012c\u0130\u0133\u0137"+
		"\u013e\u014a\u0151\u0158\u015f\u0166\u0170\u0176\u017b\u0186\u0188\u0197"+
		"\u0199\u01a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}