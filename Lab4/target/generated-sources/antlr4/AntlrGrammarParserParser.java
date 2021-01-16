// Generated from AntlrGrammarParser.g4 by ANTLR 4.7.1

    import grammar.Grammar;
    import grammar.objects.terminals.Terminal;
    import grammar.objects.terminals.Terminal.TerminalOption;
    import grammar.objects.nonterminals.NonTerminal;
    import grammar.rules.Rule;
    import grammar.objects.GrammarObject;
    import grammar.objects.nonterminals.translators.Translator;
    import grammar.objects.nonterminals.translators.TranslatorEnum;
    import grammar.objects.attributes.Attribute;
    import grammar.objects.attributes.Attribute.AttributeType;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, LowName=16, 
		HighName=17, Whitespace=18;
	public static final int
		RULE_parse = 0, RULE_terminalList = 1, RULE_terminal = 2, RULE_terminalOption = 3, 
		RULE_nonTerminalList = 4, RULE_nonTerminal = 5, RULE_startNonTerminal = 6, 
		RULE_ruleList = 7, RULE_ruleAttrs = 8, RULE_attribute = 9, RULE_translator = 10, 
		RULE_lineSeparator = 11, RULE_atLeastWhitespaces = 12, RULE_maybeWhitespaces = 13;
	public static final String[] ruleNames = {
		"parse", "terminalList", "terminal", "terminalOption", "nonTerminalList", 
		"nonTerminal", "startNonTerminal", "ruleList", "ruleAttrs", "attribute", 
		"translator", "lineSeparator", "atLeastWhitespaces", "maybeWhitespaces"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'terminals:'", "'-'", "':'", "'{'", "','", "'}'", "'non-terminals:'", 
		"'start-non-terminal:'", "'rules:'", "'->'", "'SYNTHESIZED'", "'INHERITED'", 
		"'$'", "'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "LowName", "HighName", "Whitespace"
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
			setState(28);
			((ParseContext)_localctx).terminalListValue = terminalList();
			setState(29);
			lineSeparator();
			setState(30);
			((ParseContext)_localctx).nonTerminalListValue = nonTerminalList();
			setState(31);
			lineSeparator();
			setState(32);
			((ParseContext)_localctx).startNonTerminalValue = startNonTerminal();
			setState(33);
			lineSeparator();
			setState(34);
			((ParseContext)_localctx).ruleListValue = ruleList();
			 ((ParseContext)_localctx).grammar =  new Grammar(((ParseContext)_localctx).terminalListValue.list, ((ParseContext)_localctx).nonTerminalListValue.list, ((ParseContext)_localctx).startNonTerminalValue.start, ((ParseContext)_localctx).ruleListValue.list); 
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			 ((TerminalListContext)_localctx).list =  new ArrayList(); 
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(39);
					lineSeparator();
					setState(40);
					maybeWhitespaces();
					setState(41);
					match(T__1);
					setState(42);
					atLeastWhitespaces();
					setState(43);
					((TerminalListContext)_localctx).terminalValue = terminal();
					setState(50);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(44);
						maybeWhitespaces();
						setState(45);
						match(T__2);
						setState(46);
						maybeWhitespaces();
						setState(47);
						((TerminalListContext)_localctx).optionValue = terminalOption();
						 ((TerminalListContext)_localctx).terminalValue.term = new Terminal(((TerminalListContext)_localctx).terminalValue.term.getName(), ((TerminalListContext)_localctx).optionValue.option); 
						}
						break;
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3 || _la==Whitespace) {
						{
						setState(52);
						maybeWhitespaces();
						setState(53);
						match(T__3);
						setState(54);
						maybeWhitespaces();
						setState(55);
						((TerminalListContext)_localctx).attributeFirstValue = attribute();
						 ((TerminalListContext)_localctx).terminalValue.term.getAttributes().put(((TerminalListContext)_localctx).attributeFirstValue.attr.getName(), ((TerminalListContext)_localctx).attributeFirstValue.attr); 
						setState(65);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(57);
								maybeWhitespaces();
								setState(58);
								match(T__4);
								setState(59);
								maybeWhitespaces();
								setState(60);
								((TerminalListContext)_localctx).attributeValue = attribute();
								 ((TerminalListContext)_localctx).terminalValue.term.getAttributes().put(((TerminalListContext)_localctx).attributeValue.attr.getName(), ((TerminalListContext)_localctx).attributeValue.attr); 
								}
								} 
							}
							setState(67);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						}
						setState(68);
						maybeWhitespaces();
						setState(69);
						match(T__5);
						}
					}

					 _localctx.list.add(((TerminalListContext)_localctx).terminalValue.term); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
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
			setState(79);
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
			setState(82);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__6);
			 ((NonTerminalListContext)_localctx).list =  new ArrayList(); 
			setState(115); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(87);
					lineSeparator();
					setState(88);
					maybeWhitespaces();
					setState(89);
					match(T__1);
					setState(90);
					atLeastWhitespaces();
					setState(91);
					((NonTerminalListContext)_localctx).nonTerminalValue = ((NonTerminalListContext)_localctx).nonTerminal = nonTerminal();
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3 || _la==Whitespace) {
						{
						setState(92);
						maybeWhitespaces();
						setState(93);
						match(T__3);
						setState(94);
						maybeWhitespaces();
						setState(95);
						((NonTerminalListContext)_localctx).attributeFirstValue = attribute();
						 ((NonTerminalListContext)_localctx).nonTerminal.nonterm.getAttributes().put(((NonTerminalListContext)_localctx).attributeFirstValue.attr.getName(), ((NonTerminalListContext)_localctx).attributeFirstValue.attr); 
						setState(105);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(97);
								maybeWhitespaces();
								setState(98);
								match(T__4);
								setState(99);
								maybeWhitespaces();
								setState(100);
								((NonTerminalListContext)_localctx).attributeValue = attribute();
								 ((NonTerminalListContext)_localctx).nonTerminal.nonterm.getAttributes().put(((NonTerminalListContext)_localctx).attributeValue.attr.getName(), ((NonTerminalListContext)_localctx).attributeValue.attr); 
								}
								} 
							}
							setState(107);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						}
						setState(108);
						maybeWhitespaces();
						setState(109);
						match(T__5);
						}
					}

					 _localctx.list.add(((NonTerminalListContext)_localctx).nonTerminal.nonterm); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117); 
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
			setState(119);
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
			setState(122);
			match(T__7);
			setState(123);
			atLeastWhitespaces();
			setState(124);
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
		public RuleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final RuleListContext ruleList() throws RecognitionException {
		RuleListContext _localctx = new RuleListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ruleList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__8);
			 ((RuleListContext)_localctx).list =  new ArrayList(); 
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				lineSeparator();
				setState(130);
				maybeWhitespaces();
				setState(131);
				match(T__1);
				setState(132);
				atLeastWhitespaces();
				setState(133);
				((RuleListContext)_localctx).ruleAttrsValue = ruleAttrs();
				 _localctx.list.add(new Rule(((RuleListContext)_localctx).ruleAttrsValue.fromNonTerminal, ((RuleListContext)_localctx).ruleAttrsValue.grammarObjectsList)); 
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 || _la==T__14 );
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
		public NonTerminal fromNonTerminal;
		public List<GrammarObject> grammarObjectsList;
		public NonTerminalContext nonTerminalValue;
		public TerminalContext terminalValue;
		public TranslatorContext translatorValue;
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
		public List<TranslatorContext> translator() {
			return getRuleContexts(TranslatorContext.class);
		}
		public TranslatorContext translator(int i) {
			return getRuleContext(TranslatorContext.class,i);
		}
		public RuleAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final RuleAttrsContext ruleAttrs() throws RecognitionException {
		RuleAttrsContext _localctx = new RuleAttrsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleAttrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((RuleAttrsContext)_localctx).grammarObjectsList =  new ArrayList(); 
			setState(141);
			((RuleAttrsContext)_localctx).nonTerminalValue = nonTerminal();
			 ((RuleAttrsContext)_localctx).fromNonTerminal =  ((RuleAttrsContext)_localctx).nonTerminalValue.nonterm; 
			setState(143);
			atLeastWhitespaces();
			setState(144);
			match(T__9);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				atLeastWhitespaces();
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LowName:
					{
					{
					setState(146);
					((RuleAttrsContext)_localctx).terminalValue = terminal();
					 _localctx.grammarObjectsList.add(((RuleAttrsContext)_localctx).terminalValue.term); 
					}
					}
					break;
				case HighName:
					{
					{
					setState(149);
					((RuleAttrsContext)_localctx).nonTerminalValue = nonTerminal();
					 _localctx.grammarObjectsList.add(((RuleAttrsContext)_localctx).nonTerminalValue.nonterm); 
					}
					}
					break;
				case T__12:
					{
					{
					setState(152);
					((RuleAttrsContext)_localctx).translatorValue = translator();
					 _localctx.grammarObjectsList.add(((RuleAttrsContext)_localctx).translatorValue.currentTranslator); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Whitespace );
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
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
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
			setState(161);
			((AttributeContext)_localctx).name = match(LowName);
			setState(162);
			maybeWhitespaces();
			setState(163);
			match(T__2);
			setState(164);
			maybeWhitespaces();
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(165);
				match(T__10);
				 ((AttributeContext)_localctx).attr =  new Attribute((((AttributeContext)_localctx).name!=null?((AttributeContext)_localctx).name.getText():null), AttributeType.SYNTHESIZED); 
				}
				break;
			case T__11:
				{
				setState(167);
				match(T__11);
				 ((AttributeContext)_localctx).attr =  new Attribute((((AttributeContext)_localctx).name!=null?((AttributeContext)_localctx).name.getText():null), AttributeType.INHERITED); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TranslatorContext extends ParserRuleContext {
		public Translator currentTranslator;
		public Token name;
		public TerminalNode HighName() { return getToken(AntlrGrammarParserParser.HighName, 0); }
		public TranslatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).enterTranslator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrGrammarParserListener ) ((AntlrGrammarParserListener)listener).exitTranslator(this);
		}
	}

	public final TranslatorContext translator() throws RecognitionException {
		TranslatorContext _localctx = new TranslatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_translator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__12);
			setState(172);
			((TranslatorContext)_localctx).name = match(HighName);
			 ((TranslatorContext)_localctx).currentTranslator =  (TranslatorEnum.valueOf((((TranslatorContext)_localctx).name!=null?((TranslatorContext)_localctx).name.getText():null))).getTranslator(); 
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
		enterRule(_localctx, 22, RULE_lineSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(175);
				match(T__13);
				}
			}

			setState(178);
			match(T__14);
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
		enterRule(_localctx, 24, RULE_atLeastWhitespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				match(Whitespace);
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Whitespace );
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
		enterRule(_localctx, 26, RULE_maybeWhitespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Whitespace) {
				{
				{
				setState(185);
				match(Whitespace);
				}
				}
				setState(190);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\65\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3B\n\3\f\3\16\3E\13\3"+
		"\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\6\3N\n\3\r\3\16\3O\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\6\5\6r\n\6\3\6\3\6\6\6v\n\6\r\6"+
		"\16\6w\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\6\t\u008b\n\t\r\t\16\t\u008c\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\6\n\u00a0\n\n\r\n\16\n\u00a1\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f\3\f"+
		"\3\r\5\r\u00b3\n\r\3\r\3\r\3\16\6\16\u00b8\n\16\r\16\16\16\u00b9\3\17"+
		"\7\17\u00bd\n\17\f\17\16\17\u00c0\13\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\2\2\u00c2\2\36\3\2\2\2\4\'\3\2\2\2\6Q\3\2\2\2\bT"+
		"\3\2\2\2\nW\3\2\2\2\fy\3\2\2\2\16|\3\2\2\2\20\u0081\3\2\2\2\22\u008e\3"+
		"\2\2\2\24\u00a3\3\2\2\2\26\u00ad\3\2\2\2\30\u00b2\3\2\2\2\32\u00b7\3\2"+
		"\2\2\34\u00be\3\2\2\2\36\37\5\4\3\2\37 \5\30\r\2 !\5\n\6\2!\"\5\30\r\2"+
		"\"#\5\16\b\2#$\5\30\r\2$%\5\20\t\2%&\b\2\1\2&\3\3\2\2\2\'(\7\3\2\2(M\b"+
		"\3\1\2)*\5\30\r\2*+\5\34\17\2+,\7\4\2\2,-\5\32\16\2-\64\5\6\4\2./\5\34"+
		"\17\2/\60\7\5\2\2\60\61\5\34\17\2\61\62\5\b\5\2\62\63\b\3\1\2\63\65\3"+
		"\2\2\2\64.\3\2\2\2\64\65\3\2\2\2\65I\3\2\2\2\66\67\5\34\17\2\678\7\6\2"+
		"\289\5\34\17\29:\5\24\13\2:C\b\3\1\2;<\5\34\17\2<=\7\7\2\2=>\5\34\17\2"+
		">?\5\24\13\2?@\b\3\1\2@B\3\2\2\2A;\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2DF\3\2\2\2EC\3\2\2\2FG\5\34\17\2GH\7\b\2\2HJ\3\2\2\2I\66\3\2\2\2IJ\3"+
		"\2\2\2JK\3\2\2\2KL\b\3\1\2LN\3\2\2\2M)\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2P\5\3\2\2\2QR\7\22\2\2RS\b\4\1\2S\7\3\2\2\2TU\7\23\2\2UV\b\5\1\2"+
		"V\t\3\2\2\2WX\7\t\2\2Xu\b\6\1\2YZ\5\30\r\2Z[\5\34\17\2[\\\7\4\2\2\\]\5"+
		"\32\16\2]q\5\f\7\2^_\5\34\17\2_`\7\6\2\2`a\5\34\17\2ab\5\24\13\2bk\b\6"+
		"\1\2cd\5\34\17\2de\7\7\2\2ef\5\34\17\2fg\5\24\13\2gh\b\6\1\2hj\3\2\2\2"+
		"ic\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\5\34\17"+
		"\2op\7\b\2\2pr\3\2\2\2q^\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\6\1\2tv\3\2\2"+
		"\2uY\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\13\3\2\2\2yz\7\23\2\2z{\b"+
		"\7\1\2{\r\3\2\2\2|}\7\n\2\2}~\5\32\16\2~\177\7\23\2\2\177\u0080\b\b\1"+
		"\2\u0080\17\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u008a\b\t\1\2\u0083\u0084"+
		"\5\30\r\2\u0084\u0085\5\34\17\2\u0085\u0086\7\4\2\2\u0086\u0087\5\32\16"+
		"\2\u0087\u0088\5\22\n\2\u0088\u0089\b\t\1\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\21\3\2\2\2\u008e\u008f\b\n\1\2\u008f\u0090\5\f\7\2\u0090\u0091"+
		"\b\n\1\2\u0091\u0092\5\32\16\2\u0092\u009f\7\f\2\2\u0093\u009d\5\32\16"+
		"\2\u0094\u0095\5\6\4\2\u0095\u0096\b\n\1\2\u0096\u009e\3\2\2\2\u0097\u0098"+
		"\5\f\7\2\u0098\u0099\b\n\1\2\u0099\u009e\3\2\2\2\u009a\u009b\5\26\f\2"+
		"\u009b\u009c\b\n\1\2\u009c\u009e\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0097"+
		"\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0093\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\23\3\2\2"+
		"\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7\5\2\2\u00a6"+
		"\u00ab\5\34\17\2\u00a7\u00a8\7\r\2\2\u00a8\u00ac\b\13\1\2\u00a9\u00aa"+
		"\7\16\2\2\u00aa\u00ac\b\13\1\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\25\3\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00af\7\23\2\2\u00af\u00b0"+
		"\b\f\1\2\u00b0\27\3\2\2\2\u00b1\u00b3\7\20\2\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\21\2\2\u00b5\31\3\2\2"+
		"\2\u00b6\u00b8\7\24\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bd\7\24\2"+
		"\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00be\3\2\2\2\20\64CIOkqw\u008c\u009d"+
		"\u00a1\u00ab\u00b2\u00b9\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}