// Generated from C:\Users\TEMP.LABCCT\Documents\NetBeansProjects\Compelado\grammar\gramaticona\myGram.g4 by ANTLR 4.6

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MAIN=9, 
		INT=10, OBR=11, CBR=12, EOL=13, GLOBAL=14, VAR=15, NUM=16, COMMENT=17, 
		LINE_COMMENT=18, WS=19;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_func = 2, RULE_init_ = 3, RULE_atr = 4, 
		RULE_expr = 5, RULE_term = 6, RULE_fact = 7, RULE_type_ = 8;
	public static final String[] ruleNames = {
		"prog", "line", "func", "init_", "atr", "expr", "term", "fact", "type_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'main'", 
		"'int'", "'{'", "'}'", "';'", "'global'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "MAIN", "INT", "OBR", 
		"CBR", "EOL", "GLOBAL", "VAR", "NUM", "COMMENT", "LINE_COMMENT", "WS"
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
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
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
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT) {
					{
					{
					setState(18);
					line();
					setState(19);
					match(EOL);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				func();
				setState(28);
				prog();
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
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				atr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
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
		public TerminalNode CBR() { return getToken(myGramParser.CBR, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			type_();
			setState(37);
			match(VAR);
			setState(38);
			match(T__0);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(39);
						type_();
						setState(40);
						match(VAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(44); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(46);
					match(EOL);
					}
				}

				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(53);
			match(T__1);
			setState(54);
			match(OBR);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				line();
				setState(56);
				match(EOL);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(62);
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
		enterRule(_localctx, 6, RULE_init_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type_();
			setState(65);
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

	public static class AtrContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VAR() { return getToken(myGramParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type_();
			setState(68);
			match(VAR);
			setState(69);
			match(T__2);
			setState(70);
			expr(0);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(73);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(76);
						match(T__3);
						setState(77);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(79);
						match(T__4);
						setState(80);
						term(0);
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(87);
			fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(89);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(90);
						match(T__5);
						setState(91);
						fact();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(92);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(93);
						match(T__6);
						setState(94);
						fact();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(95);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(96);
						match(T__7);
						setState(97);
						fact();
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 14, RULE_fact);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(VAR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(NUM);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__0);
				setState(106);
				expr(0);
				setState(107);
				match(T__1);
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
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(INT);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25t\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\5\3%\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\5\4\62\n\4\6\4\64\n\4"+
		"\r\4\16\4\65\3\4\3\4\3\4\3\4\3\4\6\4=\n\4\r\4\16\4>\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7T\n\7\f"+
		"\7\16\7W\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\be\n\b"+
		"\f\b\16\bh\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\3\n\2\4\f\16"+
		"\13\2\4\6\b\n\f\16\20\22\2\2x\2 \3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\bB\3\2"+
		"\2\2\nE\3\2\2\2\fJ\3\2\2\2\16X\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24\25\5"+
		"\4\3\2\25\26\7\17\2\2\26\30\3\2\2\2\27\24\3\2\2\2\30\33\3\2\2\2\31\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34!\7\2\2\3\35\36\5"+
		"\6\4\2\36\37\5\2\2\2\37!\3\2\2\2 \31\3\2\2\2 \35\3\2\2\2!\3\3\2\2\2\""+
		"%\5\n\6\2#%\5\b\5\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\5\22\n\2\'(\7\21"+
		"\2\2(\63\7\3\2\2)*\5\22\n\2*+\7\21\2\2+-\3\2\2\2,)\3\2\2\2-.\3\2\2\2."+
		",\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\62\7\17\2\2\61\60\3\2\2\2\61\62\3\2"+
		"\2\2\62\64\3\2\2\2\63,\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\678\7\4\2\28<\7\r\2\29:\5\4\3\2:;\7\17\2\2;=\3\2\2\2"+
		"<9\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\16\2\2A\7\3\2\2"+
		"\2BC\5\22\n\2CD\7\21\2\2D\t\3\2\2\2EF\5\22\n\2FG\7\21\2\2GH\7\5\2\2HI"+
		"\5\f\7\2I\13\3\2\2\2JK\b\7\1\2KL\5\16\b\2LU\3\2\2\2MN\f\4\2\2NO\7\6\2"+
		"\2OT\5\16\b\2PQ\f\3\2\2QR\7\7\2\2RT\5\16\b\2SM\3\2\2\2SP\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2XY\b\b\1\2YZ\5\20\t\2Zf\3"+
		"\2\2\2[\\\f\5\2\2\\]\7\b\2\2]e\5\20\t\2^_\f\4\2\2_`\7\t\2\2`e\5\20\t\2"+
		"ab\f\3\2\2bc\7\n\2\2ce\5\20\t\2d[\3\2\2\2d^\3\2\2\2da\3\2\2\2eh\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2g\17\3\2\2\2hf\3\2\2\2ip\7\21\2\2jp\7\22\2\2kl\7"+
		"\3\2\2lm\5\f\7\2mn\7\4\2\2np\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2p\21"+
		"\3\2\2\2qr\7\f\2\2r\23\3\2\2\2\16\31 $.\61\65>SUdfo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}