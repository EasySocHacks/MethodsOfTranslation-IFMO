// Generated from AntlrGrammarParser.g4 by ANTLR 4.7.1

  import grammar.objects.terminals.Terminal;
  import grammar.objects.nonterminals.NonTerminal;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrGrammarParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LowName=6, HighName=7;
	public static final int
		RULE_parse = 0, RULE_terminalList = 1, RULE_terminal = 2, RULE_nonTerminalList = 3, 
		RULE_nonTerminal = 4, RULE_lineSeparator = 5;
	public static final String[] ruleNames = {
		"parse", "terminalList", "terminal", "nonTerminalList", "nonTerminal", 
		"lineSeparator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'terminals:'", "'- '", "'non-terminals:'", "'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "LowName", "HighName"
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
	public String getGrammarFileName() { return "AntlrGrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrGrammarParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public List<Terminal> termList;
		public List<NonTerminal> nonTermList;
		public TerminalListContext terminalListValue;
		public NonTerminalListContext nonTerminalListValue;
		public LineSeparatorContext lineSeparator() {
			return getRuleContext(LineSeparatorContext.class,0);
		}
		public TerminalListContext terminalList() {
			return getRuleContext(TerminalListContext.class,0);
		}
		public NonTerminalListContext nonTerminalList() {
			return getRuleContext(NonTerminalListContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((ParseContext)_localctx).terminalListValue = terminalList();
			 ((ParseContext)_localctx).termList =  ((ParseContext)_localctx).terminalListValue.list; 
			setState(14);
			lineSeparator();
			setState(15);
			((ParseContext)_localctx).nonTerminalListValue = nonTerminalList();
			 ((ParseContext)_localctx).nonTermList =  ((ParseContext)_localctx).nonTerminalListValue.list; 
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

	public static class TerminalListContext extends ParserRuleContext {
		public List<Terminal> list;
		public TerminalContext terminalValue;
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public TerminalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterTerminalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitTerminalList(this);
		}
	}

	public final TerminalListContext terminalList() throws RecognitionException {
		TerminalListContext _localctx = new TerminalListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_terminalList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			 ((TerminalListContext)_localctx).list =  new ArrayList(); 
			setState(23); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(20);
					((TerminalListContext)_localctx).terminalValue = terminal();
					 _localctx.list.add(((TerminalListContext)_localctx).terminalValue.term); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(25); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TerminalContext extends ParserRuleContext {
		public Terminal term;
		public Token name;
		public LineSeparatorContext lineSeparator() {
			return getRuleContext(LineSeparatorContext.class,0);
		}
		public TerminalNode LowName() { return getToken(AntlrGrammarParserParser.LowName, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_terminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			lineSeparator();
			setState(28);
			match(T__1);
			setState(29);
			((TerminalContext)_localctx).name = match(LowName);
			 ((TerminalContext)_localctx).term =  new Terminal((((TerminalContext)_localctx).name!=null?((TerminalContext)_localctx).name.getText():null)); 
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

	public static class NonTerminalListContext extends ParserRuleContext {
		public List<NonTerminal> list;
		public NonTerminalContext nonTerminalValue;
		public NonTerminalContext nonTerminal;
		public List<NonTerminalContext> nonTerminal() {
			return getRuleContexts(NonTerminalContext.class);
		}
		public NonTerminalContext nonTerminal(int i) {
			return getRuleContext(NonTerminalContext.class,i);
		}
		public NonTerminalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterNonTerminalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitNonTerminalList(this);
		}
	}

	public final NonTerminalListContext nonTerminalList() throws RecognitionException {
		NonTerminalListContext _localctx = new NonTerminalListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nonTerminalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__2);
			 ((NonTerminalListContext)_localctx).list =  new ArrayList(); 
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				((NonTerminalListContext)_localctx).nonTerminalValue = ((NonTerminalListContext)_localctx).nonTerminal = nonTerminal();
				 _localctx.list.add(((NonTerminalListContext)_localctx).nonTerminal.nonterm); 
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==T__4 );
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

	public static class NonTerminalContext extends ParserRuleContext {
		public NonTerminal nonterm;
		public Token name;
		public LineSeparatorContext lineSeparator() {
			return getRuleContext(LineSeparatorContext.class,0);
		}
		public TerminalNode HighName() { return getToken(AntlrGrammarParserParser.HighName, 0); }
		public NonTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitNonTerminal(this);
		}
	}

	public final NonTerminalContext nonTerminal() throws RecognitionException {
		NonTerminalContext _localctx = new NonTerminalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nonTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			lineSeparator();
			setState(42);
			match(T__1);
			setState(43);
			((NonTerminalContext)_localctx).name = match(HighName);
			 ((NonTerminalContext)_localctx).nonterm =  new NonTerminal((((NonTerminalContext)_localctx).name!=null?((NonTerminalContext)_localctx).name.getText():null)); 
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

	public static class LineSeparatorContext extends ParserRuleContext {
		public LineSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterLineSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitLineSeparator(this);
		}
	}

	public final LineSeparatorContext lineSeparator() throws RecognitionException {
		LineSeparatorContext _localctx = new LineSeparatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lineSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(46);
				match(T__3);
				}
			}

			setState(49);
			match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\6\5(\n\5\r\5\16\5)\3\6\3\6\3\6\3\6\3\6\3\7\5\7\62\n\7\3\7\3\7\3\7"+
		"\2\2\b\2\4\6\b\n\f\2\2\2\62\2\16\3\2\2\2\4\24\3\2\2\2\6\35\3\2\2\2\b\""+
		"\3\2\2\2\n+\3\2\2\2\f\61\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\21\5\f"+
		"\7\2\21\22\5\b\5\2\22\23\b\2\1\2\23\3\3\2\2\2\24\25\7\3\2\2\25\31\b\3"+
		"\1\2\26\27\5\6\4\2\27\30\b\3\1\2\30\32\3\2\2\2\31\26\3\2\2\2\32\33\3\2"+
		"\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\36\5\f\7\2\36\37\7\4"+
		"\2\2\37 \7\b\2\2 !\b\4\1\2!\7\3\2\2\2\"#\7\5\2\2#\'\b\5\1\2$%\5\n\6\2"+
		"%&\b\5\1\2&(\3\2\2\2\'$\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\t\3\2"+
		"\2\2+,\5\f\7\2,-\7\4\2\2-.\7\t\2\2./\b\6\1\2/\13\3\2\2\2\60\62\7\6\2\2"+
		"\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\7\2\2\64\r\3\2\2\2"+
		"\5\33)\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}