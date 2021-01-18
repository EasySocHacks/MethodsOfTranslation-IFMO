// Generated from AntlrGrammarParser.g4 by ANTLR 4.7.1

    import grammar.Grammar;
    import grammar.objects.terminals.Terminal;
    import grammar.objects.terminals.Terminal.TerminalOption;
    import grammar.objects.nonterminals.NonTerminal;
    import grammar.rules.Rule;
    import grammar.objects.GrammarObject;
    import grammar.objects.nonterminals.translators.Translator;
    import grammar.objects.nonterminals.translators.Translator.Code;
    import grammar.objects.nonterminals.translators.Translator.TranslatorType;
    import grammar.objects.attributes.Attribute;
    import exceptions.grammar.CreateTranslatorWithCurrentCodeException;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, LowName=15, Whitespace=16, 
		HighName=17, ClassName=18, Code=19, Args=20;
	public static final int
		RULE_parse = 0, RULE_terminalList = 1, RULE_terminal = 2, RULE_terminalOption = 3, 
		RULE_nonTerminalList = 4, RULE_nonTerminal = 5, RULE_startNonTerminal = 6, 
		RULE_ruleList = 7, RULE_ruleAttrs = 8, RULE_attribute = 9, RULE_translatorReturn = 10, 
		RULE_translatorArgs = 11, RULE_lineSeparator = 12, RULE_atLeastWhitespaces = 13, 
		RULE_maybeWhitespaces = 14;
	public static final String[] ruleNames = {
		"parse", "terminalList", "terminal", "terminalOption", "nonTerminalList", 
		"nonTerminal", "startNonTerminal", "ruleList", "ruleAttrs", "attribute", 
		"translatorReturn", "translatorArgs", "lineSeparator", "atLeastWhitespaces", 
		"maybeWhitespaces"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'terminals:'", "'-'", "':'", "'{'", "','", "'}'", "'non-terminals:'", 
		"'start-non-terminal:'", "'rules:'", "'->'", "'['", "']'", "'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "LowName", "Whitespace", "HighName", "ClassName", "Code", 
		"Args"
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
		public String grammarName;
		public Grammar grammar;
		public TerminalListContext terminalListValue;
		public NonTerminalListContext nonTerminalListValue;
		public StartNonTerminalContext startNonTerminalValue;
		public RuleListContext ruleListValue;
		public List<LineSeparatorContext> lineSeparator() {
			return getRuleContexts(LineSeparatorContext.class);
		}
		public LineSeparatorContext lineSeparator(int i) {
			return getRuleContext(LineSeparatorContext.class,i);
		}
		public TerminalListContext terminalList() {
			return getRuleContext(TerminalListContext.class,0);
		}
		public NonTerminalListContext nonTerminalList() {
			return getRuleContext(NonTerminalListContext.class,0);
		}
		public StartNonTerminalContext startNonTerminal() {
			return getRuleContext(StartNonTerminalContext.class,0);
		}
		public RuleListContext ruleList() {
			return getRuleContext(RuleListContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParseContext(ParserRuleContext parent, int invokingState, String grammarName) {
			super(parent, invokingState);
			this.grammarName = grammarName;
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

	public final ParseContext parse(String grammarName) throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState(), grammarName);
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ParseContext)_localctx).terminalListValue = terminalList();
			setState(31);
			lineSeparator();
			setState(32);
			((ParseContext)_localctx).nonTerminalListValue = nonTerminalList();
			setState(33);
			lineSeparator();
			setState(34);
			((ParseContext)_localctx).startNonTerminalValue = startNonTerminal();
			setState(35);
			lineSeparator();
			setState(36);
			((ParseContext)_localctx).ruleListValue = ruleList(_localctx.grammarName);
			 ((ParseContext)_localctx).grammar =  new Grammar(_localctx.grammarName, ((ParseContext)_localctx).terminalListValue.list, ((ParseContext)_localctx).nonTerminalListValue.list, ((ParseContext)_localctx).startNonTerminalValue.start, ((ParseContext)_localctx).ruleListValue.list); 
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
		public TerminalOptionContext optionValue;
		public AttributeContext attributeFirstValue;
		public AttributeContext attributeValue;
		public List<LineSeparatorContext> lineSeparator() {
			return getRuleContexts(LineSeparatorContext.class);
		}
		public LineSeparatorContext lineSeparator(int i) {
			return getRuleContext(LineSeparatorContext.class,i);
		}
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public List<AtLeastWhitespacesContext> atLeastWhitespaces() {
			return getRuleContexts(AtLeastWhitespacesContext.class);
		}
		public AtLeastWhitespacesContext atLeastWhitespaces(int i) {
			return getRuleContext(AtLeastWhitespacesContext.class,i);
		}
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public List<TerminalOptionContext> terminalOption() {
			return getRuleContexts(TerminalOptionContext.class);
		}
		public TerminalOptionContext terminalOption(int i) {
			return getRuleContext(TerminalOptionContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
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
			setState(39);
			match(T__0);
			 ((TerminalListContext)_localctx).list =  new ArrayList(); 
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(41);
					lineSeparator();
					setState(42);
					maybeWhitespaces();
					setState(43);
					match(T__1);
					setState(44);
					atLeastWhitespaces();
					setState(45);
					((TerminalListContext)_localctx).terminalValue = terminal();
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(46);
						maybeWhitespaces();
						setState(47);
						match(T__2);
						setState(48);
						maybeWhitespaces();
						setState(49);
						((TerminalListContext)_localctx).optionValue = terminalOption();
						 ((TerminalListContext)_localctx).terminalValue.term = new Terminal(((TerminalListContext)_localctx).terminalValue.term.getName(), ((TerminalListContext)_localctx).optionValue.option); 
						}
						break;
					}
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(54);
						maybeWhitespaces();
						setState(55);
						match(T__3);
						setState(56);
						maybeWhitespaces();
						setState(57);
						((TerminalListContext)_localctx).attributeFirstValue = attribute();
						 ((TerminalListContext)_localctx).terminalValue.term.getAttributes().put(((TerminalListContext)_localctx).attributeFirstValue.attr.getName(), ((TerminalListContext)_localctx).attributeFirstValue.attr); 
						setState(67);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(59);
								maybeWhitespaces();
								setState(60);
								match(T__4);
								setState(61);
								maybeWhitespaces();
								setState(62);
								((TerminalListContext)_localctx).attributeValue = attribute();
								 ((TerminalListContext)_localctx).terminalValue.term.getAttributes().put(((TerminalListContext)_localctx).attributeValue.attr.getName(), ((TerminalListContext)_localctx).attributeValue.attr); 
								}
								} 
							}
							setState(69);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						}
						setState(70);
						maybeWhitespaces();
						setState(71);
						match(T__5);
						}
						break;
					}
					 _localctx.list.add(((TerminalListContext)_localctx).terminalValue.term); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(81);
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

	public static class TerminalOptionContext extends ParserRuleContext {
		public TerminalOption option;
		public Token name;
		public TerminalNode HighName() { return getToken(AntlrGrammarParserParser.HighName, 0); }
		public TerminalOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterTerminalOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitTerminalOption(this);
		}
	}

	public final TerminalOptionContext terminalOption() throws RecognitionException {
		TerminalOptionContext _localctx = new TerminalOptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_terminalOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((TerminalOptionContext)_localctx).name = match(HighName);
			 ((TerminalOptionContext)_localctx).option =  TerminalOption.valueOf((((TerminalOptionContext)_localctx).name!=null?((TerminalOptionContext)_localctx).name.getText():null)); 
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
		public AttributeContext attributeFirstValue;
		public AttributeContext attributeValue;
		public List<LineSeparatorContext> lineSeparator() {
			return getRuleContexts(LineSeparatorContext.class);
		}
		public LineSeparatorContext lineSeparator(int i) {
			return getRuleContext(LineSeparatorContext.class,i);
		}
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public List<AtLeastWhitespacesContext> atLeastWhitespaces() {
			return getRuleContexts(AtLeastWhitespacesContext.class);
		}
		public AtLeastWhitespacesContext atLeastWhitespaces(int i) {
			return getRuleContext(AtLeastWhitespacesContext.class,i);
		}
		public List<NonTerminalContext> nonTerminal() {
			return getRuleContexts(NonTerminalContext.class);
		}
		public NonTerminalContext nonTerminal(int i) {
			return getRuleContext(NonTerminalContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
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
		enterRule(_localctx, 8, RULE_nonTerminalList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__6);
			 ((NonTerminalListContext)_localctx).list =  new ArrayList(); 
			setState(117); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(89);
					lineSeparator();
					setState(90);
					maybeWhitespaces();
					setState(91);
					match(T__1);
					setState(92);
					atLeastWhitespaces();
					setState(93);
					((NonTerminalListContext)_localctx).nonTerminalValue = ((NonTerminalListContext)_localctx).nonTerminal = nonTerminal();
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(94);
						maybeWhitespaces();
						setState(95);
						match(T__3);
						setState(96);
						maybeWhitespaces();
						setState(97);
						((NonTerminalListContext)_localctx).attributeFirstValue = attribute();
						 ((NonTerminalListContext)_localctx).nonTerminal.nonterm.getAttributes().put(((NonTerminalListContext)_localctx).attributeFirstValue.attr.getName(), ((NonTerminalListContext)_localctx).attributeFirstValue.attr); 
						setState(107);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(99);
								maybeWhitespaces();
								setState(100);
								match(T__4);
								setState(101);
								maybeWhitespaces();
								setState(102);
								((NonTerminalListContext)_localctx).attributeValue = attribute();
								 ((NonTerminalListContext)_localctx).nonTerminal.nonterm.getAttributes().put(((NonTerminalListContext)_localctx).attributeValue.attr.getName(), ((NonTerminalListContext)_localctx).attributeValue.attr); 
								}
								} 
							}
							setState(109);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						}
						setState(110);
						maybeWhitespaces();
						setState(111);
						match(T__5);
						}
						break;
					}
					 _localctx.list.add(((NonTerminalListContext)_localctx).nonTerminal.nonterm); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(119); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class NonTerminalContext extends ParserRuleContext {
		public NonTerminal nonterm;
		public Token name;
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
		enterRule(_localctx, 10, RULE_nonTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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

	public static class StartNonTerminalContext extends ParserRuleContext {
		public NonTerminal start;
		public Token name;
		public AtLeastWhitespacesContext atLeastWhitespaces() {
			return getRuleContext(AtLeastWhitespacesContext.class,0);
		}
		public TerminalNode HighName() { return getToken(AntlrGrammarParserParser.HighName, 0); }
		public StartNonTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startNonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterStartNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitStartNonTerminal(this);
		}
	}

	public final StartNonTerminalContext startNonTerminal() throws RecognitionException {
		StartNonTerminalContext _localctx = new StartNonTerminalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startNonTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__7);
			setState(125);
			atLeastWhitespaces();
			setState(126);
			((StartNonTerminalContext)_localctx).name = match(HighName);
			 ((StartNonTerminalContext)_localctx).start =  new NonTerminal((((StartNonTerminalContext)_localctx).name!=null?((StartNonTerminalContext)_localctx).name.getText():null)); 
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

	public static class RuleListContext extends ParserRuleContext {
		public String grammarName;
		public List<Rule> list;
		public RuleAttrsContext ruleAttrsValue;
		public List<LineSeparatorContext> lineSeparator() {
			return getRuleContexts(LineSeparatorContext.class);
		}
		public LineSeparatorContext lineSeparator(int i) {
			return getRuleContext(LineSeparatorContext.class,i);
		}
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public List<AtLeastWhitespacesContext> atLeastWhitespaces() {
			return getRuleContexts(AtLeastWhitespacesContext.class);
		}
		public AtLeastWhitespacesContext atLeastWhitespaces(int i) {
			return getRuleContext(AtLeastWhitespacesContext.class,i);
		}
		public List<RuleAttrsContext> ruleAttrs() {
			return getRuleContexts(RuleAttrsContext.class);
		}
		public RuleAttrsContext ruleAttrs(int i) {
			return getRuleContext(RuleAttrsContext.class,i);
		}
		public RuleListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RuleListContext(ParserRuleContext parent, int invokingState, String grammarName) {
			super(parent, invokingState);
			this.grammarName = grammarName;
		}
		@Override public int getRuleIndex() { return RULE_ruleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterRuleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitRuleList(this);
		}
	}

	public final RuleListContext ruleList(String grammarName) throws RecognitionException {
		RuleListContext _localctx = new RuleListContext(_ctx, getState(), grammarName);
		enterRule(_localctx, 14, RULE_ruleList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__8);
			 ((RuleListContext)_localctx).list =  new ArrayList(); 
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				lineSeparator();
				setState(132);
				maybeWhitespaces();
				setState(133);
				match(T__1);
				setState(134);
				atLeastWhitespaces();
				setState(135);
				((RuleListContext)_localctx).ruleAttrsValue = ruleAttrs(_localctx.grammarName);
				 _localctx.list.add(new Rule(((RuleListContext)_localctx).ruleAttrsValue.fromNonTerminal, ((RuleListContext)_localctx).ruleAttrsValue.grammarObjectsList)); 
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 || _la==T__13 );
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

	public static class RuleAttrsContext extends ParserRuleContext {
		public String grammarName;
		public NonTerminal fromNonTerminal;
		public List<GrammarObject> grammarObjectsList;
		public NonTerminalContext nonTerminalValue;
		public TerminalContext terminalValue;
		public TranslatorArgsContext translatorArgsValue;
		public TranslatorReturnContext translatorReturnValue;
		public List<AtLeastWhitespacesContext> atLeastWhitespaces() {
			return getRuleContexts(AtLeastWhitespacesContext.class);
		}
		public AtLeastWhitespacesContext atLeastWhitespaces(int i) {
			return getRuleContext(AtLeastWhitespacesContext.class,i);
		}
		public List<NonTerminalContext> nonTerminal() {
			return getRuleContexts(NonTerminalContext.class);
		}
		public NonTerminalContext nonTerminal(int i) {
			return getRuleContext(NonTerminalContext.class,i);
		}
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public List<TranslatorArgsContext> translatorArgs() {
			return getRuleContexts(TranslatorArgsContext.class);
		}
		public TranslatorArgsContext translatorArgs(int i) {
			return getRuleContext(TranslatorArgsContext.class,i);
		}
		public List<TranslatorReturnContext> translatorReturn() {
			return getRuleContexts(TranslatorReturnContext.class);
		}
		public TranslatorReturnContext translatorReturn(int i) {
			return getRuleContext(TranslatorReturnContext.class,i);
		}
		public RuleAttrsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RuleAttrsContext(ParserRuleContext parent, int invokingState, String grammarName) {
			super(parent, invokingState);
			this.grammarName = grammarName;
		}
		@Override public int getRuleIndex() { return RULE_ruleAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterRuleAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitRuleAttrs(this);
		}
	}

	public final RuleAttrsContext ruleAttrs(String grammarName) throws RecognitionException {
		RuleAttrsContext _localctx = new RuleAttrsContext(_ctx, getState(), grammarName);
		enterRule(_localctx, 16, RULE_ruleAttrs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((RuleAttrsContext)_localctx).grammarObjectsList =  new ArrayList(); 
			setState(143);
			((RuleAttrsContext)_localctx).nonTerminalValue = nonTerminal();
			 ((RuleAttrsContext)_localctx).fromNonTerminal =  ((RuleAttrsContext)_localctx).nonTerminalValue.nonterm; 
			setState(145);
			atLeastWhitespaces();
			setState(146);
			match(T__9);
			setState(163); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(147);
					atLeastWhitespaces();
					setState(161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LowName:
						{
						{
						setState(148);
						((RuleAttrsContext)_localctx).terminalValue = terminal();
						setState(149);
						((RuleAttrsContext)_localctx).translatorArgsValue = translatorArgs(_localctx.grammarName);
						 _localctx.grammarObjectsList.addAll(((RuleAttrsContext)_localctx).translatorArgsValue.translatorList); 
						 _localctx.grammarObjectsList.add(((RuleAttrsContext)_localctx).terminalValue.term); 
						}
						}
						break;
					case HighName:
						{
						{
						setState(153);
						((RuleAttrsContext)_localctx).nonTerminalValue = nonTerminal();
						setState(154);
						((RuleAttrsContext)_localctx).translatorArgsValue = translatorArgs(_localctx.grammarName);
						 _localctx.grammarObjectsList.addAll(((RuleAttrsContext)_localctx).translatorArgsValue.translatorList); 
						 _localctx.grammarObjectsList.add(((RuleAttrsContext)_localctx).nonTerminalValue.nonterm); 
						}
						}
						break;
					case EOF:
					case T__3:
					case T__12:
					case T__13:
					case Whitespace:
						{
						{
						setState(158);
						((RuleAttrsContext)_localctx).translatorReturnValue = translatorReturn(_localctx.grammarName);
						 _localctx.grammarObjectsList.addAll(((RuleAttrsContext)_localctx).translatorReturnValue.translatorList); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(165); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public Attribute attr;
		public Token name;
		public MaybeWhitespacesContext maybeWhitespaces() {
			return getRuleContext(MaybeWhitespacesContext.class,0);
		}
		public TerminalNode LowName() { return getToken(AntlrGrammarParserParser.LowName, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((AttributeContext)_localctx).name = match(LowName);
			setState(168);
			maybeWhitespaces();
			 ((AttributeContext)_localctx).attr =  new Attribute((((AttributeContext)_localctx).name!=null?((AttributeContext)_localctx).name.getText():null)); 
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

	public static class TranslatorReturnContext extends ParserRuleContext {
		public String grammarName;
		public List<Translator> translatorList;
		public Token argsValue;
		public Token codeValue;
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public List<TerminalNode> Args() { return getTokens(AntlrGrammarParserParser.Args); }
		public TerminalNode Args(int i) {
			return getToken(AntlrGrammarParserParser.Args, i);
		}
		public List<TerminalNode> Code() { return getTokens(AntlrGrammarParserParser.Code); }
		public TerminalNode Code(int i) {
			return getToken(AntlrGrammarParserParser.Code, i);
		}
		public TranslatorReturnContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TranslatorReturnContext(ParserRuleContext parent, int invokingState, String grammarName) {
			super(parent, invokingState);
			this.grammarName = grammarName;
		}
		@Override public int getRuleIndex() { return RULE_translatorReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterTranslatorReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitTranslatorReturn(this);
		}
	}

	public final TranslatorReturnContext translatorReturn(String grammarName) throws RecognitionException {
		TranslatorReturnContext _localctx = new TranslatorReturnContext(_ctx, getState(), grammarName);
		enterRule(_localctx, 20, RULE_translatorReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TranslatorReturnContext)_localctx).translatorList =  new ArrayList(); 
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(172);
				match(T__3);
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					maybeWhitespaces();
					setState(174);
					((TranslatorReturnContext)_localctx).argsValue = match(Args);
					setState(175);
					maybeWhitespaces();
					setState(176);
					match(T__9);
					setState(177);
					maybeWhitespaces();
					setState(178);
					((TranslatorReturnContext)_localctx).codeValue = match(Code);
					setState(179);
					maybeWhitespaces();
					 _localctx.translatorList.add(new Translator(_localctx.grammarName, new Code((((TranslatorReturnContext)_localctx).argsValue!=null?((TranslatorReturnContext)_localctx).argsValue.getText():null), (((TranslatorReturnContext)_localctx).codeValue!=null?((TranslatorReturnContext)_localctx).codeValue.getText():null)), TranslatorType.RETURN)); 
					}
					}
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << Whitespace) | (1L << Args))) != 0) );
				setState(186);
				match(T__5);
				}
			}

			}
		}
		catch (CreateTranslatorWithCurrentCodeException e) {

			        e.printStackTrace();
			    
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslatorArgsContext extends ParserRuleContext {
		public String grammarName;
		public List<Translator> translatorList;
		public Token argsValue;
		public Token codeValue;
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public List<TerminalNode> Args() { return getTokens(AntlrGrammarParserParser.Args); }
		public TerminalNode Args(int i) {
			return getToken(AntlrGrammarParserParser.Args, i);
		}
		public List<TerminalNode> Code() { return getTokens(AntlrGrammarParserParser.Code); }
		public TerminalNode Code(int i) {
			return getToken(AntlrGrammarParserParser.Code, i);
		}
		public TranslatorArgsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TranslatorArgsContext(ParserRuleContext parent, int invokingState, String grammarName) {
			super(parent, invokingState);
			this.grammarName = grammarName;
		}
		@Override public int getRuleIndex() { return RULE_translatorArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterTranslatorArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitTranslatorArgs(this);
		}
	}

	public final TranslatorArgsContext translatorArgs(String grammarName) throws RecognitionException {
		TranslatorArgsContext _localctx = new TranslatorArgsContext(_ctx, getState(), grammarName);
		enterRule(_localctx, 22, RULE_translatorArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TranslatorArgsContext)_localctx).translatorList =  new ArrayList(); 
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(191);
				match(T__10);
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192);
					maybeWhitespaces();
					setState(193);
					((TranslatorArgsContext)_localctx).argsValue = match(Args);
					setState(194);
					maybeWhitespaces();
					setState(195);
					match(T__9);
					setState(196);
					maybeWhitespaces();
					setState(197);
					((TranslatorArgsContext)_localctx).codeValue = match(Code);
					setState(198);
					maybeWhitespaces();
					 _localctx.translatorList.add(new Translator(_localctx.grammarName, new Code((((TranslatorArgsContext)_localctx).argsValue!=null?((TranslatorArgsContext)_localctx).argsValue.getText():null), (((TranslatorArgsContext)_localctx).codeValue!=null?((TranslatorArgsContext)_localctx).codeValue.getText():null)), TranslatorType.ARGS)); 
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << Whitespace) | (1L << Args))) != 0) );
				setState(205);
				match(T__11);
				}
			}

			}
		}
		catch (CreateTranslatorWithCurrentCodeException e) {

			        e.printStackTrace();
			    
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
		enterRule(_localctx, 24, RULE_lineSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(209);
				match(T__12);
				}
			}

			setState(212);
			match(T__13);
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

	public static class AtLeastWhitespacesContext extends ParserRuleContext {
		public List<LineSeparatorContext> lineSeparator() {
			return getRuleContexts(LineSeparatorContext.class);
		}
		public LineSeparatorContext lineSeparator(int i) {
			return getRuleContext(LineSeparatorContext.class,i);
		}
		public List<TerminalNode> Whitespace() { return getTokens(AntlrGrammarParserParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AntlrGrammarParserParser.Whitespace, i);
		}
		public AtLeastWhitespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atLeastWhitespaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterAtLeastWhitespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitAtLeastWhitespaces(this);
		}
	}

	public final AtLeastWhitespacesContext atLeastWhitespaces() throws RecognitionException {
		AtLeastWhitespacesContext _localctx = new AtLeastWhitespacesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atLeastWhitespaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(216);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__12:
					case T__13:
						{
						setState(214);
						lineSeparator();
						}
						break;
					case Whitespace:
						{
						setState(215);
						match(Whitespace);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class MaybeWhitespacesContext extends ParserRuleContext {
		public List<LineSeparatorContext> lineSeparator() {
			return getRuleContexts(LineSeparatorContext.class);
		}
		public LineSeparatorContext lineSeparator(int i) {
			return getRuleContext(LineSeparatorContext.class,i);
		}
		public List<TerminalNode> Whitespace() { return getTokens(AntlrGrammarParserParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(AntlrGrammarParserParser.Whitespace, i);
		}
		public MaybeWhitespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeWhitespaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterMaybeWhitespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitMaybeWhitespaces(this);
		}
	}

	public final MaybeWhitespacesContext maybeWhitespaces() throws RecognitionException {
		MaybeWhitespacesContext _localctx = new MaybeWhitespacesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_maybeWhitespaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(222);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__12:
					case T__13:
						{
						setState(220);
						lineSeparator();
						}
						break;
					case Whitespace:
						{
						setState(221);
						match(Whitespace);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\67\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3D\n\3\f\3\16"+
		"\3G\13\3\3\3\3\3\3\3\5\3L\n\3\3\3\3\3\6\3P\n\3\r\3\16\3Q\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\6\5\6t\n\6\3\6\3\6\6\6"+
		"x\n\6\r\6\16\6y\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\6\t\u008d\n\t\r\t\16\t\u008e\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a4\n\n\6\n\u00a6"+
		"\n\n\r\n\16\n\u00a7\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\6\f\u00b9\n\f\r\f\16\f\u00ba\3\f\3\f\5\f\u00bf\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00cc\n\r\r\r\16\r\u00cd"+
		"\3\r\3\r\5\r\u00d2\n\r\3\16\5\16\u00d5\n\16\3\16\3\16\3\17\3\17\6\17\u00db"+
		"\n\17\r\17\16\17\u00dc\3\20\3\20\7\20\u00e1\n\20\f\20\16\20\u00e4\13\20"+
		"\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00ea\2 \3\2"+
		"\2\2\4)\3\2\2\2\6S\3\2\2\2\bV\3\2\2\2\nY\3\2\2\2\f{\3\2\2\2\16~\3\2\2"+
		"\2\20\u0083\3\2\2\2\22\u0090\3\2\2\2\24\u00a9\3\2\2\2\26\u00ad\3\2\2\2"+
		"\30\u00c0\3\2\2\2\32\u00d4\3\2\2\2\34\u00da\3\2\2\2\36\u00e2\3\2\2\2 "+
		"!\5\4\3\2!\"\5\32\16\2\"#\5\n\6\2#$\5\32\16\2$%\5\16\b\2%&\5\32\16\2&"+
		"\'\5\20\t\2\'(\b\2\1\2(\3\3\2\2\2)*\7\3\2\2*O\b\3\1\2+,\5\32\16\2,-\5"+
		"\36\20\2-.\7\4\2\2./\5\34\17\2/\66\5\6\4\2\60\61\5\36\20\2\61\62\7\5\2"+
		"\2\62\63\5\36\20\2\63\64\5\b\5\2\64\65\b\3\1\2\65\67\3\2\2\2\66\60\3\2"+
		"\2\2\66\67\3\2\2\2\67K\3\2\2\289\5\36\20\29:\7\6\2\2:;\5\36\20\2;<\5\24"+
		"\13\2<E\b\3\1\2=>\5\36\20\2>?\7\7\2\2?@\5\36\20\2@A\5\24\13\2AB\b\3\1"+
		"\2BD\3\2\2\2C=\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2"+
		"\2HI\5\36\20\2IJ\7\b\2\2JL\3\2\2\2K8\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\3"+
		"\1\2NP\3\2\2\2O+\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\5\3\2\2\2ST\7"+
		"\21\2\2TU\b\4\1\2U\7\3\2\2\2VW\7\23\2\2WX\b\5\1\2X\t\3\2\2\2YZ\7\t\2\2"+
		"Zw\b\6\1\2[\\\5\32\16\2\\]\5\36\20\2]^\7\4\2\2^_\5\34\17\2_s\5\f\7\2`"+
		"a\5\36\20\2ab\7\6\2\2bc\5\36\20\2cd\5\24\13\2dm\b\6\1\2ef\5\36\20\2fg"+
		"\7\7\2\2gh\5\36\20\2hi\5\24\13\2ij\b\6\1\2jl\3\2\2\2ke\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\5\36\20\2qr\7\b\2\2rt\3\2"+
		"\2\2s`\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\6\1\2vx\3\2\2\2w[\3\2\2\2xy\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z\13\3\2\2\2{|\7\23\2\2|}\b\7\1\2}\r\3\2\2\2~"+
		"\177\7\n\2\2\177\u0080\5\34\17\2\u0080\u0081\7\23\2\2\u0081\u0082\b\b"+
		"\1\2\u0082\17\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u008c\b\t\1\2\u0085\u0086"+
		"\5\32\16\2\u0086\u0087\5\36\20\2\u0087\u0088\7\4\2\2\u0088\u0089\5\34"+
		"\17\2\u0089\u008a\5\22\n\2\u008a\u008b\b\t\1\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\21\3\2\2\2\u0090\u0091\b\n\1\2\u0091\u0092\5\f\7\2\u0092\u0093"+
		"\b\n\1\2\u0093\u0094\5\34\17\2\u0094\u00a5\7\f\2\2\u0095\u00a3\5\34\17"+
		"\2\u0096\u0097\5\6\4\2\u0097\u0098\5\30\r\2\u0098\u0099\b\n\1\2\u0099"+
		"\u009a\b\n\1\2\u009a\u00a4\3\2\2\2\u009b\u009c\5\f\7\2\u009c\u009d\5\30"+
		"\r\2\u009d\u009e\b\n\1\2\u009e\u009f\b\n\1\2\u009f\u00a4\3\2\2\2\u00a0"+
		"\u00a1\5\26\f\2\u00a1\u00a2\b\n\1\2\u00a2\u00a4\3\2\2\2\u00a3\u0096\3"+
		"\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u0095\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\23\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\5\36\20\2\u00ab"+
		"\u00ac\b\13\1\2\u00ac\25\3\2\2\2\u00ad\u00be\b\f\1\2\u00ae\u00b8\7\6\2"+
		"\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\5\36\20\2\u00b2"+
		"\u00b3\7\f\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6"+
		"\5\36\20\2\u00b6\u00b7\b\f\1\2\u00b7\u00b9\3\2\2\2\u00b8\u00af\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00bf\3\2\2\2\u00be\u00ae\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00d1\b\r\1\2\u00c1\u00cb\7\r\2"+
		"\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5\36\20\2\u00c5"+
		"\u00c6\7\f\2\2\u00c6\u00c7\5\36\20\2\u00c7\u00c8\7\25\2\2\u00c8\u00c9"+
		"\5\36\20\2\u00c9\u00ca\b\r\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00c2\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\7\16\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c1\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\20\2\2"+
		"\u00d7\33\3\2\2\2\u00d8\u00db\5\32\16\2\u00d9\u00db\7\22\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\35\3\2\2\2\u00de\u00e1\5\32\16\2\u00df\u00e1\7\22"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\37\3\2\2\2\u00e4\u00e2\3\2\2"+
		"\2\25\66EKQmsy\u008e\u00a3\u00a7\u00ba\u00be\u00cd\u00d1\u00d4\u00da\u00dc"+
		"\u00e0\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}