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
		T__9=10, WHILE=11, GRT=12, LESS=13, GRTEQ=14, LESSEQ=15, EQ=16, NEQ=17, 
		OR=18, IF=19, AND=20, ELSE=21, PRINT=22, MAIN=23, INT=24, FLOAT=25, DOUBLE=26, 
		STRING=27, VOID=28, READ=29, RET=30, OBR=31, CBR=32, EOL=33, GLOBAL=34, 
		STRVALUE=35, VAR=36, PRINTCONC=37, NUM=38, COMMENT=39, LINE_COMMENT=40, 
		WS=41, COM=42;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_func = 2, RULE_cmd = 3, RULE_while_ = 4, 
		RULE_ifstmt = 5, RULE_cond = 6, RULE_cdand = 7, RULE_cndts = 8, RULE_relop = 9, 
		RULE_read = 10, RULE_print = 11, RULE_init_ = 12, RULE_retr = 13, RULE_atr = 14, 
		RULE_expr = 15, RULE_term = 16, RULE_fact = 17, RULE_type_ = 18;
	public static final String[] ruleNames = {
		"prog", "line", "func", "cmd", "while_", "ifstmt", "cond", "cdand", "cndts", 
		"relop", "read", "print", "init_", "retr", "atr", "expr", "term", "fact", 
		"type_"
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
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << VOID) | (1L << VAR))) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					line();
					setState(39);
					match(EOL);
					}
					break;
				case 2:
					{
					setState(41);
					func();
					setState(42);
					prog();
					}
					break;
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(EOF);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				atr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				type_();
				setState(56);
				match(VAR);
				setState(57);
				match(T__0);
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case DOUBLE:
				case STRING:
					{
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(58);
						type_();
						setState(59);
						match(VAR);
						}
						setState(62);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOL) {
							{
							setState(61);
							match(EOL);
							}
						}

						}
						}
						setState(66); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0) );
					}
					break;
				case T__1:
					{
					setState(68);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71);
				match(T__2);
				setState(72);
				match(OBR);
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					cmd();
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << READ) | (1L << VAR))) != 0) );
				setState(78);
				retr();
				setState(79);
				match(CBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(VOID);
				setState(82);
				match(VAR);
				setState(83);
				match(T__0);
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case DOUBLE:
				case STRING:
					{
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(84);
						type_();
						setState(85);
						match(VAR);
						}
						setState(88);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOL) {
							{
							setState(87);
							match(EOL);
							}
						}

						}
						}
						setState(92); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0) );
					}
					break;
				case T__1:
					{
					setState(94);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97);
				match(T__2);
				setState(98);
				match(OBR);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					cmd();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << READ) | (1L << VAR))) != 0) );
				setState(104);
				match(CBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==VOID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				match(MAIN);
				setState(108);
				match(T__0);
				setState(109);
				match(T__1);
				setState(110);
				match(T__2);
				setState(111);
				match(OBR);
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(112);
					cmd();
					}
					}
					setState(115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << READ) | (1L << VAR))) != 0) );
				setState(117);
				match(RET);
				setState(118);
				match(T__1);
				setState(119);
				match(EOL);
				setState(120);
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
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				atr();
				setState(125);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				init_();
				setState(128);
				match(EOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				print();
				setState(131);
				match(EOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				read();
				setState(134);
				match(EOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				ifstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				while_();
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
			setState(140);
			match(WHILE);
			setState(141);
			match(T__0);
			setState(142);
			cond(0);
			setState(143);
			match(T__2);
			setState(144);
			match(OBR);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				cmd();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << READ) | (1L << VAR))) != 0) );
			setState(150);
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
		enterRule(_localctx, 10, RULE_ifstmt);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(IF);
				setState(153);
				match(T__0);
				setState(154);
				cond(0);
				setState(155);
				match(T__2);
				setState(156);
				match(OBR);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					cmd();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << READ) | (1L << VAR))) != 0) );
				setState(162);
				match(CBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(IF);
				setState(165);
				match(T__0);
				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(166);
					match(VAR);
					}
					break;
				case T__3:
					{
					setState(167);
					match(T__3);
					setState(168);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171);
				match(T__2);
				setState(172);
				match(OBR);
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					cmd();
					}
					}
					setState(176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << READ) | (1L << VAR))) != 0) );
				setState(178);
				match(CBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(IF);
				setState(181);
				match(T__0);
				setState(182);
				cond(0);
				setState(183);
				match(T__2);
				setState(184);
				match(OBR);
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(185);
					cmd();
					}
					}
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << READ) | (1L << VAR))) != 0) );
				setState(190);
				match(CBR);
				setState(191);
				match(ELSE);
				setState(192);
				match(OBR);
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					cmd();
					}
					}
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING) | (1L << READ) | (1L << VAR))) != 0) );
				setState(198);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(203);
			cdand(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(205);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(206);
					match(OR);
					setState(207);
					cdand(0);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cdand, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			cndts();
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CdandContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cdand);
					setState(216);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(217);
					match(AND);
					setState(218);
					cndts();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 16, RULE_cndts);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				expr(0);
				setState(225);
				relop();
				setState(226);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__0);
				setState(229);
				cond(0);
				setState(230);
				match(T__2);
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
		enterRule(_localctx, 18, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 20, RULE_read);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(READ);
				setState(237);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(READ);
				setState(239);
				type_();
				setState(240);
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
		enterRule(_localctx, 22, RULE_print);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(PRINT);
				setState(245);
				match(T__0);
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(246);
						match(T__4);
						}
					}

					setState(249);
					match(STRVALUE);
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(250);
						match(T__4);
						}
						break;
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(253);
						match(VAR);
						}
					}

					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 || _la==STRVALUE );
				setState(260);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(PRINT);
				setState(262);
				match(T__0);
				setState(263);
				match(VAR);
				setState(264);
				match(T__2);
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
		enterRule(_localctx, 24, RULE_init_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			type_();
			setState(268);
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
		enterRule(_localctx, 26, RULE_retr);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(RET);
				setState(271);
				match(VAR);
				setState(272);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(RET);
				setState(274);
				expr(0);
				setState(275);
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
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atr);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(INT);
				setState(280);
				match(VAR);
				setState(281);
				match(T__5);
				setState(282);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(DOUBLE);
				setState(284);
				match(VAR);
				setState(285);
				match(T__5);
				setState(286);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(FLOAT);
				setState(288);
				match(VAR);
				setState(289);
				match(T__5);
				setState(290);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				match(STRING);
				setState(292);
				match(VAR);
				setState(293);
				match(T__5);
				setState(294);
				match(STRVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(VAR);
				setState(296);
				match(T__5);
				setState(297);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				match(VAR);
				setState(299);
				match(T__5);
				setState(300);
				match(STRVALUE);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						match(T__4);
						setState(308);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(310);
						match(T__6);
						setState(311);
						term(0);
						}
						break;
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(318);
			fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(320);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(321);
						match(T__7);
						setState(322);
						fact();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(323);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(324);
						match(T__8);
						setState(325);
						fact();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(326);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(327);
						match(T__9);
						setState(328);
						fact();
						}
						break;
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 34, RULE_fact);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(NUM);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(T__0);
				setState(337);
				expr(0);
				setState(338);
				match(T__2);
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
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
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
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 7:
			return cdand_sempred((CdandContext)_localctx, predIndex);
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u015b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2"+
		"\3\2\3\2\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\6\4C\n"+
		"\4\r\4\16\4D\3\4\5\4H\n\4\3\4\3\4\3\4\6\4M\n\4\r\4\16\4N\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\6\4]\n\4\r\4\16\4^\3\4\5\4b\n\4\3"+
		"\4\3\4\3\4\6\4g\n\4\r\4\16\4h\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4"+
		"t\n\4\r\4\16\4u\3\4\3\4\3\4\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6"+
		"\6\u0095\n\6\r\6\16\6\u0096\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00a1"+
		"\n\7\r\7\16\7\u00a2\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\3\7"+
		"\3\7\6\7\u00b1\n\7\r\7\16\7\u00b2\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7"+
		"\u00bd\n\7\r\7\16\7\u00be\3\7\3\7\3\7\3\7\6\7\u00c5\n\7\r\7\16\7\u00c6"+
		"\3\7\3\7\5\7\u00cb\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d3\n\b\f\b\16\b"+
		"\u00d6\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00de\n\t\f\t\16\t\u00e1\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00eb\n\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00f5\n\f\3\r\3\r\3\r\5\r\u00fa\n\r\3\r\3\r\5\r\u00fe\n"+
		"\r\3\r\5\r\u0101\n\r\6\r\u0103\n\r\r\r\16\r\u0104\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u010c\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0118\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0130\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u013b\n\21\f\21\16\21\u013e"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u014c\n\22\f\22\16\22\u014f\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0157\n\23\3\24\3\24\3\24\2\6\16\20 \"\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\5\4\2\32\32\36\36\3\2\16\23\3\2\32\35\u0178\2\60\3"+
		"\2\2\2\4\67\3\2\2\2\6|\3\2\2\2\b\u008c\3\2\2\2\n\u008e\3\2\2\2\f\u00ca"+
		"\3\2\2\2\16\u00cc\3\2\2\2\20\u00d7\3\2\2\2\22\u00ea\3\2\2\2\24\u00ec\3"+
		"\2\2\2\26\u00f4\3\2\2\2\30\u010b\3\2\2\2\32\u010d\3\2\2\2\34\u0117\3\2"+
		"\2\2\36\u012f\3\2\2\2 \u0131\3\2\2\2\"\u013f\3\2\2\2$\u0156\3\2\2\2&\u0158"+
		"\3\2\2\2()\5\4\3\2)*\7#\2\2*/\3\2\2\2+,\5\6\4\2,-\5\2\2\2-/\3\2\2\2.("+
		"\3\2\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2"+
		"\62\60\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\658\5\36\20\2\668\5\32\16\2"+
		"\67\65\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\5&\24\2:;\7&\2\2;G\7\3\2\2<"+
		"=\5&\24\2=>\7&\2\2>@\3\2\2\2?A\7#\2\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2B<"+
		"\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FH\7\4\2\2GB\3\2\2\2G"+
		"F\3\2\2\2HI\3\2\2\2IJ\7\5\2\2JL\7!\2\2KM\5\b\5\2LK\3\2\2\2MN\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\5\34\17\2QR\7\"\2\2R}\3\2\2\2ST\7\36\2"+
		"\2TU\7&\2\2Ua\7\3\2\2VW\5&\24\2WX\7&\2\2XZ\3\2\2\2Y[\7#\2\2ZY\3\2\2\2"+
		"Z[\3\2\2\2[]\3\2\2\2\\V\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2"+
		"\2`b\7\4\2\2a\\\3\2\2\2a`\3\2\2\2bc\3\2\2\2cd\7\5\2\2df\7!\2\2eg\5\b\5"+
		"\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\"\2\2k}\3\2\2"+
		"\2lm\t\2\2\2mn\7\31\2\2no\7\3\2\2op\7\4\2\2pq\7\5\2\2qs\7!\2\2rt\5\b\5"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7 \2\2xy\7\4\2"+
		"\2yz\7#\2\2z{\7\"\2\2{}\3\2\2\2|9\3\2\2\2|S\3\2\2\2|l\3\2\2\2}\7\3\2\2"+
		"\2~\177\5\36\20\2\177\u0080\7#\2\2\u0080\u008d\3\2\2\2\u0081\u0082\5\32"+
		"\16\2\u0082\u0083\7#\2\2\u0083\u008d\3\2\2\2\u0084\u0085\5\30\r\2\u0085"+
		"\u0086\7#\2\2\u0086\u008d\3\2\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7#"+
		"\2\2\u0089\u008d\3\2\2\2\u008a\u008d\5\f\7\2\u008b\u008d\5\n\6\2\u008c"+
		"~\3\2\2\2\u008c\u0081\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0087\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\t\3\2\2\2\u008e\u008f\7"+
		"\r\2\2\u008f\u0090\7\3\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\5\2\2\u0092"+
		"\u0094\7!\2\2\u0093\u0095\5\b\5\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\7\"\2\2\u0099\13\3\2\2\2\u009a\u009b\7\25\2\2\u009b\u009c\7\3\2"+
		"\2\u009c\u009d\5\16\b\2\u009d\u009e\7\5\2\2\u009e\u00a0\7!\2\2\u009f\u00a1"+
		"\5\b\5\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00cb\3\2"+
		"\2\2\u00a6\u00a7\7\25\2\2\u00a7\u00ab\7\3\2\2\u00a8\u00ac\7&\2\2\u00a9"+
		"\u00aa\7\6\2\2\u00aa\u00ac\7&\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00b0\7!\2\2\u00af"+
		"\u00b1\5\b\5\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\"\2\2\u00b5"+
		"\u00cb\3\2\2\2\u00b6\u00b7\7\25\2\2\u00b7\u00b8\7\3\2\2\u00b8\u00b9\5"+
		"\16\b\2\u00b9\u00ba\7\5\2\2\u00ba\u00bc\7!\2\2\u00bb\u00bd\5\b\5\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\7\27\2\2\u00c2"+
		"\u00c4\7!\2\2\u00c3\u00c5\5\b\5\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\7\"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u009a\3\2\2\2\u00ca\u00a6\3\2"+
		"\2\2\u00ca\u00b6\3\2\2\2\u00cb\r\3\2\2\2\u00cc\u00cd\b\b\1\2\u00cd\u00ce"+
		"\5\20\t\2\u00ce\u00d4\3\2\2\2\u00cf\u00d0\f\4\2\2\u00d0\u00d1\7\24\2\2"+
		"\u00d1\u00d3\5\20\t\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\17\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d8\b\t\1\2\u00d8\u00d9\5\22\n\2\u00d9\u00df\3\2\2\2\u00da\u00db\f"+
		"\4\2\2\u00db\u00dc\7\26\2\2\u00dc\u00de\5\22\n\2\u00dd\u00da\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\21\3\2\2"+
		"\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5 \21\2\u00e3\u00e4\5\24\13\2\u00e4"+
		"\u00e5\5 \21\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\5\16"+
		"\b\2\u00e8\u00e9\7\5\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea"+
		"\u00e6\3\2\2\2\u00eb\23\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed\25\3\2\2\2\u00ee"+
		"\u00ef\7\37\2\2\u00ef\u00f5\7&\2\2\u00f0\u00f1\7\37\2\2\u00f1\u00f2\5"+
		"&\24\2\u00f2\u00f3\7&\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4"+
		"\u00f0\3\2\2\2\u00f5\27\3\2\2\2\u00f6\u00f7\7\30\2\2\u00f7\u0102\7\3\2"+
		"\2\u00f8\u00fa\7\7\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\7%\2\2\u00fc\u00fe\7\7\2\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u0101\7&\2\2\u0100\u00ff\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00f9\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u010c\7\5\2\2\u0107\u0108\7\30\2\2\u0108\u0109\7\3\2\2\u0109"+
		"\u010a\7&\2\2\u010a\u010c\7\5\2\2\u010b\u00f6\3\2\2\2\u010b\u0107\3\2"+
		"\2\2\u010c\31\3\2\2\2\u010d\u010e\5&\24\2\u010e\u010f\7&\2\2\u010f\33"+
		"\3\2\2\2\u0110\u0111\7 \2\2\u0111\u0112\7&\2\2\u0112\u0118\7#\2\2\u0113"+
		"\u0114\7 \2\2\u0114\u0115\5 \21\2\u0115\u0116\7#\2\2\u0116\u0118\3\2\2"+
		"\2\u0117\u0110\3\2\2\2\u0117\u0113\3\2\2\2\u0118\35\3\2\2\2\u0119\u011a"+
		"\7\32\2\2\u011a\u011b\7&\2\2\u011b\u011c\7\b\2\2\u011c\u0130\5 \21\2\u011d"+
		"\u011e\7\34\2\2\u011e\u011f\7&\2\2\u011f\u0120\7\b\2\2\u0120\u0130\5 "+
		"\21\2\u0121\u0122\7\33\2\2\u0122\u0123\7&\2\2\u0123\u0124\7\b\2\2\u0124"+
		"\u0130\5 \21\2\u0125\u0126\7\35\2\2\u0126\u0127\7&\2\2\u0127\u0128\7\b"+
		"\2\2\u0128\u0130\7%\2\2\u0129\u012a\7&\2\2\u012a\u012b\7\b\2\2\u012b\u0130"+
		"\5 \21\2\u012c\u012d\7&\2\2\u012d\u012e\7\b\2\2\u012e\u0130\7%\2\2\u012f"+
		"\u0119\3\2\2\2\u012f\u011d\3\2\2\2\u012f\u0121\3\2\2\2\u012f\u0125\3\2"+
		"\2\2\u012f\u0129\3\2\2\2\u012f\u012c\3\2\2\2\u0130\37\3\2\2\2\u0131\u0132"+
		"\b\21\1\2\u0132\u0133\5\"\22\2\u0133\u013c\3\2\2\2\u0134\u0135\f\4\2\2"+
		"\u0135\u0136\7\7\2\2\u0136\u013b\5\"\22\2\u0137\u0138\f\3\2\2\u0138\u0139"+
		"\7\t\2\2\u0139\u013b\5\"\22\2\u013a\u0134\3\2\2\2\u013a\u0137\3\2\2\2"+
		"\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d!\3"+
		"\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\b\22\1\2\u0140\u0141\5$\23\2\u0141"+
		"\u014d\3\2\2\2\u0142\u0143\f\5\2\2\u0143\u0144\7\n\2\2\u0144\u014c\5$"+
		"\23\2\u0145\u0146\f\4\2\2\u0146\u0147\7\13\2\2\u0147\u014c\5$\23\2\u0148"+
		"\u0149\f\3\2\2\u0149\u014a\7\f\2\2\u014a\u014c\5$\23\2\u014b\u0142\3\2"+
		"\2\2\u014b\u0145\3\2\2\2\u014b\u0148\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e#\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\u0150\u0157\7&\2\2\u0151\u0157\7(\2\2\u0152\u0153\7\3\2\2\u0153\u0154"+
		"\5 \21\2\u0154\u0155\7\5\2\2\u0155\u0157\3\2\2\2\u0156\u0150\3\2\2\2\u0156"+
		"\u0151\3\2\2\2\u0156\u0152\3\2\2\2\u0157%\3\2\2\2\u0158\u0159\t\4\2\2"+
		"\u0159\'\3\2\2\2\'.\60\67@DGNZ^ahu|\u008c\u0096\u00a2\u00ab\u00b2\u00be"+
		"\u00c6\u00ca\u00d4\u00df\u00ea\u00f4\u00f9\u00fd\u0100\u0104\u010b\u0117"+
		"\u012f\u013a\u013c\u014b\u014d\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}