// Generated from ExpressionListGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionListGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Number=11, Whitespace=12, Variable=13;
	public static final int
		RULE_parse = 0, RULE_expressionList = 1, RULE_expression = 2, RULE_calculatedExpression = 3, 
		RULE_plusAndMinus = 4, RULE_multiplyAndDivide = 5, RULE_bracketsOrNumberOrVariable = 6, 
		RULE_maybeWhitespaces = 7, RULE_lineSeparator = 8;
	public static final String[] ruleNames = {
		"parse", "expressionList", "expression", "calculatedExpression", "plusAndMinus", 
		"multiplyAndDivide", "bracketsOrNumberOrVariable", "maybeWhitespaces", 
		"lineSeparator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'\r'", 
		"'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Number", 
		"Whitespace", "Variable"
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
	public String getGrammarFileName() { return "ExpressionListGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionListGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public String answer;
		public ExpressionListContext expressionListValue;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((ParseContext)_localctx).expressionListValue = expressionList();
			 ((ParseContext)_localctx).answer =  ((ParseContext)_localctx).expressionListValue.list.toString(); 
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionResultList list;
		public ExpressionContext firstExpression;
		public ExpressionContext secondExpression;
		public TerminalNode EOF() { return getToken(ExpressionListGrammarParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LineSeparatorContext> lineSeparator() {
			return getRuleContexts(LineSeparatorContext.class);
		}
		public LineSeparatorContext lineSeparator(int i) {
			return getRuleContext(LineSeparatorContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			((ExpressionListContext)_localctx).firstExpression = expression(new ExpressionResultList());

			            ((ExpressionListContext)_localctx).list =  new ExpressionResultList();
			            _localctx.list.insert(((ExpressionListContext)_localctx).firstExpression.expressionResult);
			        
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(23);
				lineSeparator();
				setState(24);
				((ExpressionListContext)_localctx).secondExpression = expression(_localctx.list);
				 _localctx.list.insert(((ExpressionListContext)_localctx).secondExpression.expressionResult); 
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionResultList list;
		public ExpressionResult expressionResult;
		public Token variableName;
		public CalculatedExpressionContext calculatedExpressionValue;
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public TerminalNode Variable() { return getToken(ExpressionListGrammarParser.Variable, 0); }
		public CalculatedExpressionContext calculatedExpression() {
			return getRuleContext(CalculatedExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, ExpressionResultList list) {
			super(parent, invokingState);
			this.list = list;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(ExpressionResultList list) throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState(), list);
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			maybeWhitespaces();
			setState(35);
			((ExpressionContext)_localctx).variableName = match(Variable);
			setState(36);
			maybeWhitespaces();
			setState(37);
			match(T__0);
			setState(38);
			maybeWhitespaces();
			setState(39);
			((ExpressionContext)_localctx).calculatedExpressionValue = calculatedExpression(_localctx.list);
			setState(40);
			maybeWhitespaces();
			setState(41);
			match(T__1);
			setState(42);
			maybeWhitespaces();

			            ((ExpressionContext)_localctx).expressionResult =  new ExpressionResult((((ExpressionContext)_localctx).variableName!=null?((ExpressionContext)_localctx).variableName.getText():null), ((ExpressionContext)_localctx).calculatedExpressionValue.value);
			        
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

	public static class CalculatedExpressionContext extends ParserRuleContext {
		public ExpressionResultList list;
		public int value;
		public PlusAndMinusContext calculatedExpressionValue;
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public PlusAndMinusContext plusAndMinus() {
			return getRuleContext(PlusAndMinusContext.class,0);
		}
		public CalculatedExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CalculatedExpressionContext(ParserRuleContext parent, int invokingState, ExpressionResultList list) {
			super(parent, invokingState);
			this.list = list;
		}
		@Override public int getRuleIndex() { return RULE_calculatedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterCalculatedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitCalculatedExpression(this);
		}
	}

	public final CalculatedExpressionContext calculatedExpression(ExpressionResultList list) throws RecognitionException {
		CalculatedExpressionContext _localctx = new CalculatedExpressionContext(_ctx, getState(), list);
		enterRule(_localctx, 6, RULE_calculatedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			maybeWhitespaces();
			setState(46);
			((CalculatedExpressionContext)_localctx).calculatedExpressionValue = plusAndMinus(_localctx.list);
			setState(47);
			maybeWhitespaces();
			 ((CalculatedExpressionContext)_localctx).value =  ((CalculatedExpressionContext)_localctx).calculatedExpressionValue.value; 
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

	public static class PlusAndMinusContext extends ParserRuleContext {
		public ExpressionResultList list;
		public int value;
		public MultiplyAndDivideContext firstExpression;
		public MultiplyAndDivideContext secondExpression;
		public List<MultiplyAndDivideContext> multiplyAndDivide() {
			return getRuleContexts(MultiplyAndDivideContext.class);
		}
		public MultiplyAndDivideContext multiplyAndDivide(int i) {
			return getRuleContext(MultiplyAndDivideContext.class,i);
		}
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public PlusAndMinusContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PlusAndMinusContext(ParserRuleContext parent, int invokingState, ExpressionResultList list) {
			super(parent, invokingState);
			this.list = list;
		}
		@Override public int getRuleIndex() { return RULE_plusAndMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterPlusAndMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitPlusAndMinus(this);
		}
	}

	public final PlusAndMinusContext plusAndMinus(ExpressionResultList list) throws RecognitionException {
		PlusAndMinusContext _localctx = new PlusAndMinusContext(_ctx, getState(), list);
		enterRule(_localctx, 8, RULE_plusAndMinus);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((PlusAndMinusContext)_localctx).firstExpression = multiplyAndDivide(_localctx.list);
			 ((PlusAndMinusContext)_localctx).value =  ((PlusAndMinusContext)_localctx).firstExpression.value; 
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(52);
						maybeWhitespaces();
						setState(53);
						match(T__2);
						setState(54);
						maybeWhitespaces();
						setState(55);
						((PlusAndMinusContext)_localctx).secondExpression = multiplyAndDivide(_localctx.list);
						 _localctx.value += ((PlusAndMinusContext)_localctx).secondExpression.value; 
						}
						break;
					case 2:
						{
						setState(58);
						maybeWhitespaces();
						setState(59);
						match(T__3);
						setState(60);
						maybeWhitespaces();
						setState(61);
						((PlusAndMinusContext)_localctx).secondExpression = multiplyAndDivide(_localctx.list);
						 _localctx.value -= ((PlusAndMinusContext)_localctx).secondExpression.value; 
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class MultiplyAndDivideContext extends ParserRuleContext {
		public ExpressionResultList list;
		public int value;
		public BracketsOrNumberOrVariableContext firstExpression;
		public BracketsOrNumberOrVariableContext secondExpression;
		public List<BracketsOrNumberOrVariableContext> bracketsOrNumberOrVariable() {
			return getRuleContexts(BracketsOrNumberOrVariableContext.class);
		}
		public BracketsOrNumberOrVariableContext bracketsOrNumberOrVariable(int i) {
			return getRuleContext(BracketsOrNumberOrVariableContext.class,i);
		}
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public MultiplyAndDivideContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultiplyAndDivideContext(ParserRuleContext parent, int invokingState, ExpressionResultList list) {
			super(parent, invokingState);
			this.list = list;
		}
		@Override public int getRuleIndex() { return RULE_multiplyAndDivide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterMultiplyAndDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitMultiplyAndDivide(this);
		}
	}

	public final MultiplyAndDivideContext multiplyAndDivide(ExpressionResultList list) throws RecognitionException {
		MultiplyAndDivideContext _localctx = new MultiplyAndDivideContext(_ctx, getState(), list);
		enterRule(_localctx, 10, RULE_multiplyAndDivide);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((MultiplyAndDivideContext)_localctx).firstExpression = bracketsOrNumberOrVariable(_localctx.list);
			 ((MultiplyAndDivideContext)_localctx).value =  ((MultiplyAndDivideContext)_localctx).firstExpression.value; 
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(71);
						maybeWhitespaces();
						setState(72);
						match(T__4);
						setState(73);
						maybeWhitespaces();
						setState(74);
						((MultiplyAndDivideContext)_localctx).secondExpression = bracketsOrNumberOrVariable(_localctx.list);
						 _localctx.value *= ((MultiplyAndDivideContext)_localctx).secondExpression.value; 
						}
						break;
					case 2:
						{
						setState(77);
						maybeWhitespaces();
						setState(78);
						match(T__5);
						setState(79);
						maybeWhitespaces();
						setState(80);
						((MultiplyAndDivideContext)_localctx).secondExpression = bracketsOrNumberOrVariable(_localctx.list);
						 _localctx.value /= ((MultiplyAndDivideContext)_localctx).secondExpression.value; 
						}
						break;
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class BracketsOrNumberOrVariableContext extends ParserRuleContext {
		public ExpressionResultList list;
		public int value;
		public CalculatedExpressionContext innerExpression;
		public Token number;
		public Token variable;
		public CalculatedExpressionContext calculatedExpression() {
			return getRuleContext(CalculatedExpressionContext.class,0);
		}
		public TerminalNode Number() { return getToken(ExpressionListGrammarParser.Number, 0); }
		public TerminalNode Variable() { return getToken(ExpressionListGrammarParser.Variable, 0); }
		public BracketsOrNumberOrVariableContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BracketsOrNumberOrVariableContext(ParserRuleContext parent, int invokingState, ExpressionResultList list) {
			super(parent, invokingState);
			this.list = list;
		}
		@Override public int getRuleIndex() { return RULE_bracketsOrNumberOrVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterBracketsOrNumberOrVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitBracketsOrNumberOrVariable(this);
		}
	}

	public final BracketsOrNumberOrVariableContext bracketsOrNumberOrVariable(ExpressionResultList list) throws RecognitionException {
		BracketsOrNumberOrVariableContext _localctx = new BracketsOrNumberOrVariableContext(_ctx, getState(), list);
		enterRule(_localctx, 12, RULE_bracketsOrNumberOrVariable);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__6);
				setState(89);
				((BracketsOrNumberOrVariableContext)_localctx).innerExpression = calculatedExpression(_localctx.list);
				setState(90);
				match(T__7);
				 ((BracketsOrNumberOrVariableContext)_localctx).value =  ((BracketsOrNumberOrVariableContext)_localctx).innerExpression.value; 
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				((BracketsOrNumberOrVariableContext)_localctx).number = match(Number);
				 ((BracketsOrNumberOrVariableContext)_localctx).value =  Integer.parseInt((((BracketsOrNumberOrVariableContext)_localctx).number!=null?((BracketsOrNumberOrVariableContext)_localctx).number.getText():null)); 
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				((BracketsOrNumberOrVariableContext)_localctx).variable = match(Variable);
				 ((BracketsOrNumberOrVariableContext)_localctx).value =  _localctx.list.getValue((((BracketsOrNumberOrVariableContext)_localctx).variable!=null?((BracketsOrNumberOrVariableContext)_localctx).variable.getText():null)); 
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

	public static class MaybeWhitespacesContext extends ParserRuleContext {
		public List<TerminalNode> Whitespace() { return getTokens(ExpressionListGrammarParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(ExpressionListGrammarParser.Whitespace, i);
		}
		public MaybeWhitespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeWhitespaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterMaybeWhitespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitMaybeWhitespaces(this);
		}
	}

	public final MaybeWhitespacesContext maybeWhitespaces() throws RecognitionException {
		MaybeWhitespacesContext _localctx = new MaybeWhitespacesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_maybeWhitespaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					match(Whitespace);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class LineSeparatorContext extends ParserRuleContext {
		public LineSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterLineSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitLineSeparator(this);
		}
	}

	public final LineSeparatorContext lineSeparator() throws RecognitionException {
		LineSeparatorContext _localctx = new LineSeparatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lineSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(105);
				match(T__8);
				}
			}

			setState(108);
			match(T__9);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6C\n\6\f\6\16\6F\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7V\n\7\f\7\16\7Y\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\7\tg\n\t\f\t\16\t"+
		"j\13\t\3\n\5\nm\n\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2p\2\24"+
		"\3\2\2\2\4\27\3\2\2\2\6$\3\2\2\2\b/\3\2\2\2\n\64\3\2\2\2\fG\3\2\2\2\16"+
		"c\3\2\2\2\20h\3\2\2\2\22l\3\2\2\2\24\25\5\4\3\2\25\26\b\2\1\2\26\3\3\2"+
		"\2\2\27\30\5\6\4\2\30\37\b\3\1\2\31\32\5\22\n\2\32\33\5\6\4\2\33\34\b"+
		"\3\1\2\34\36\3\2\2\2\35\31\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2"+
		"\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\5\3\2\2\2$%\5\20\t\2%&\7\17\2\2"+
		"&\'\5\20\t\2\'(\7\3\2\2()\5\20\t\2)*\5\b\5\2*+\5\20\t\2+,\7\4\2\2,-\5"+
		"\20\t\2-.\b\4\1\2.\7\3\2\2\2/\60\5\20\t\2\60\61\5\n\6\2\61\62\5\20\t\2"+
		"\62\63\b\5\1\2\63\t\3\2\2\2\64\65\5\f\7\2\65D\b\6\1\2\66\67\5\20\t\2\67"+
		"8\7\5\2\289\5\20\t\29:\5\f\7\2:;\b\6\1\2;C\3\2\2\2<=\5\20\t\2=>\7\6\2"+
		"\2>?\5\20\t\2?@\5\f\7\2@A\b\6\1\2AC\3\2\2\2B\66\3\2\2\2B<\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2E\13\3\2\2\2FD\3\2\2\2GH\5\16\b\2HW\b\7\1\2"+
		"IJ\5\20\t\2JK\7\7\2\2KL\5\20\t\2LM\5\16\b\2MN\b\7\1\2NV\3\2\2\2OP\5\20"+
		"\t\2PQ\7\b\2\2QR\5\20\t\2RS\5\16\b\2ST\b\7\1\2TV\3\2\2\2UI\3\2\2\2UO\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YW\3\2\2\2Z[\7\t\2\2[\\"+
		"\5\b\5\2\\]\7\n\2\2]^\b\b\1\2^d\3\2\2\2_`\7\r\2\2`d\b\b\1\2ab\7\17\2\2"+
		"bd\b\b\1\2cZ\3\2\2\2c_\3\2\2\2ca\3\2\2\2d\17\3\2\2\2eg\7\16\2\2fe\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\21\3\2\2\2jh\3\2\2\2km\7\13\2\2lk"+
		"\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\f\2\2o\23\3\2\2\2\n\37BDUWchl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}