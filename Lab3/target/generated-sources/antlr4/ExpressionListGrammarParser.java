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
		T__9=10, T__10=11, Number=12, Whitespace=13, Variable=14;
	public static final int
		RULE_parse = 0, RULE_expressionList = 1, RULE_expression = 2, RULE_calculatedExpression = 3, 
		RULE_plusAndMinus = 4, RULE_multiplyAndDivide = 5, RULE_pow = 6, RULE_unaryMinus = 7, 
		RULE_bracketsOrNumberOrVariable = 8, RULE_maybeWhitespaces = 9, RULE_lineSeparator = 10;
	public static final String[] ruleNames = {
		"parse", "expressionList", "expression", "calculatedExpression", "plusAndMinus", 
		"multiplyAndDivide", "pow", "unaryMinus", "bracketsOrNumberOrVariable", 
		"maybeWhitespaces", "lineSeparator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'**'", "'('", "')'", 
		"'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Number", "Whitespace", "Variable"
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
			setState(22);
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
			setState(25);
			((ExpressionListContext)_localctx).firstExpression = expression(new ExpressionResultList());

			            ((ExpressionListContext)_localctx).list =  new ExpressionResultList();
			            _localctx.list.insert(((ExpressionListContext)_localctx).firstExpression.expressionResult);
			        
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				{
				setState(27);
				lineSeparator();
				setState(28);
				((ExpressionListContext)_localctx).secondExpression = expression(_localctx.list);
				 _localctx.list.insert(((ExpressionListContext)_localctx).secondExpression.expressionResult); 
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
			setState(38);
			maybeWhitespaces();
			setState(39);
			((ExpressionContext)_localctx).variableName = match(Variable);
			setState(40);
			maybeWhitespaces();
			setState(41);
			match(T__0);
			setState(42);
			maybeWhitespaces();
			setState(43);
			((ExpressionContext)_localctx).calculatedExpressionValue = calculatedExpression(_localctx.list);
			setState(44);
			maybeWhitespaces();
			setState(45);
			match(T__1);
			setState(46);
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
			setState(49);
			maybeWhitespaces();
			setState(50);
			((CalculatedExpressionContext)_localctx).calculatedExpressionValue = plusAndMinus(_localctx.list);
			setState(51);
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
			setState(54);
			((PlusAndMinusContext)_localctx).firstExpression = multiplyAndDivide(_localctx.list);
			 ((PlusAndMinusContext)_localctx).value =  ((PlusAndMinusContext)_localctx).firstExpression.value; 
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(56);
						maybeWhitespaces();
						setState(57);
						match(T__2);
						setState(58);
						maybeWhitespaces();
						setState(59);
						((PlusAndMinusContext)_localctx).secondExpression = multiplyAndDivide(_localctx.list);
						 _localctx.value += ((PlusAndMinusContext)_localctx).secondExpression.value; 
						}
						break;
					case 2:
						{
						setState(62);
						maybeWhitespaces();
						setState(63);
						match(T__3);
						setState(64);
						maybeWhitespaces();
						setState(65);
						((PlusAndMinusContext)_localctx).secondExpression = multiplyAndDivide(_localctx.list);
						 _localctx.value -= ((PlusAndMinusContext)_localctx).secondExpression.value; 
						}
						break;
					}
					} 
				}
				setState(72);
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
		public PowContext firstExpression;
		public PowContext secondExpression;
		public List<PowContext> pow() {
			return getRuleContexts(PowContext.class);
		}
		public PowContext pow(int i) {
			return getRuleContext(PowContext.class,i);
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
			setState(73);
			((MultiplyAndDivideContext)_localctx).firstExpression = pow(_localctx.list);
			 ((MultiplyAndDivideContext)_localctx).value =  ((MultiplyAndDivideContext)_localctx).firstExpression.value; 
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(75);
						maybeWhitespaces();
						setState(76);
						match(T__4);
						setState(77);
						maybeWhitespaces();
						setState(78);
						((MultiplyAndDivideContext)_localctx).secondExpression = pow(_localctx.list);
						 _localctx.value *= ((MultiplyAndDivideContext)_localctx).secondExpression.value; 
						}
						break;
					case 2:
						{
						setState(81);
						maybeWhitespaces();
						setState(82);
						match(T__5);
						setState(83);
						maybeWhitespaces();
						setState(84);
						((MultiplyAndDivideContext)_localctx).secondExpression = pow(_localctx.list);
						 _localctx.value /= ((MultiplyAndDivideContext)_localctx).secondExpression.value; 
						}
						break;
					}
					} 
				}
				setState(91);
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

	public static class PowContext extends ParserRuleContext {
		public ExpressionResultList list;
		public int value;
		public UnaryMinusContext base;
		public PowContext power;
		public UnaryMinusContext brackets;
		public UnaryMinusContext expr;
		public List<MaybeWhitespacesContext> maybeWhitespaces() {
			return getRuleContexts(MaybeWhitespacesContext.class);
		}
		public MaybeWhitespacesContext maybeWhitespaces(int i) {
			return getRuleContext(MaybeWhitespacesContext.class,i);
		}
		public List<UnaryMinusContext> unaryMinus() {
			return getRuleContexts(UnaryMinusContext.class);
		}
		public UnaryMinusContext unaryMinus(int i) {
			return getRuleContext(UnaryMinusContext.class,i);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public PowContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PowContext(ParserRuleContext parent, int invokingState, ExpressionResultList list) {
			super(parent, invokingState);
			this.list = list;
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitPow(this);
		}
	}

	public final PowContext pow(ExpressionResultList list) throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState(), list);
		enterRule(_localctx, 12, RULE_pow);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(92);
				((PowContext)_localctx).base = unaryMinus(_localctx.list);
				 ((PowContext)_localctx).value =  ((PowContext)_localctx).base.value; 
				setState(94);
				maybeWhitespaces();
				setState(95);
				match(T__6);
				setState(96);
				maybeWhitespaces();
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(97);
					((PowContext)_localctx).power = pow(_localctx.list);
					 ((PowContext)_localctx).value =  (int) Math.pow(_localctx.value, ((PowContext)_localctx).power.value); 
					}
					break;
				case 2:
					{
					setState(100);
					((PowContext)_localctx).brackets = unaryMinus(_localctx.list);
					 ((PowContext)_localctx).value =  (int) Math.pow(_localctx.value, ((PowContext)_localctx).brackets.value); 
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				((PowContext)_localctx).expr = unaryMinus(_localctx.list);
				 ((PowContext)_localctx).value =  ((PowContext)_localctx).expr.value; 
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

	public static class UnaryMinusContext extends ParserRuleContext {
		public ExpressionResultList list;
		public int value;
		public BracketsOrNumberOrVariableContext expr;
		public BracketsOrNumberOrVariableContext bracketsOrNumberOrVariable() {
			return getRuleContext(BracketsOrNumberOrVariableContext.class,0);
		}
		public UnaryMinusContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public UnaryMinusContext(ParserRuleContext parent, int invokingState, ExpressionResultList list) {
			super(parent, invokingState);
			this.list = list;
		}
		@Override public int getRuleIndex() { return RULE_unaryMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListGrammarListener ) ((ExpressionListGrammarListener)listener).exitUnaryMinus(this);
		}
	}

	public final UnaryMinusContext unaryMinus(ExpressionResultList list) throws RecognitionException {
		UnaryMinusContext _localctx = new UnaryMinusContext(_ctx, getState(), list);
		enterRule(_localctx, 14, RULE_unaryMinus);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__3);
				setState(111);
				((UnaryMinusContext)_localctx).expr = bracketsOrNumberOrVariable(_localctx.list);
				 ((UnaryMinusContext)_localctx).value =  -((UnaryMinusContext)_localctx).expr.value; 
				}
				break;
			case T__7:
			case Number:
			case Variable:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((UnaryMinusContext)_localctx).expr = bracketsOrNumberOrVariable(_localctx.list);
				 ((UnaryMinusContext)_localctx).value =  ((UnaryMinusContext)_localctx).expr.value; 
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
		enterRule(_localctx, 16, RULE_bracketsOrNumberOrVariable);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__7);
				setState(120);
				((BracketsOrNumberOrVariableContext)_localctx).innerExpression = calculatedExpression(_localctx.list);
				setState(121);
				match(T__8);
				 ((BracketsOrNumberOrVariableContext)_localctx).value =  ((BracketsOrNumberOrVariableContext)_localctx).innerExpression.value; 
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((BracketsOrNumberOrVariableContext)_localctx).number = match(Number);
				 ((BracketsOrNumberOrVariableContext)_localctx).value =  Integer.parseInt((((BracketsOrNumberOrVariableContext)_localctx).number!=null?((BracketsOrNumberOrVariableContext)_localctx).number.getText():null)); 
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
		enterRule(_localctx, 18, RULE_maybeWhitespaces);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(Whitespace);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 20, RULE_lineSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(136);
				match(T__9);
				}
			}

			setState(139);
			match(T__10);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6G"+
		"\n\6\f\6\16\6J\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bj\n\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tx\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\13\7\13\u0086\n"+
		"\13\f\13\16\13\u0089\13\13\3\f\5\f\u008c\n\f\3\f\3\f\3\f\2\2\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\2\2\u0090\2\30\3\2\2\2\4\33\3\2\2\2\6(\3\2\2\2\b"+
		"\63\3\2\2\2\n8\3\2\2\2\fK\3\2\2\2\16n\3\2\2\2\20w\3\2\2\2\22\u0082\3\2"+
		"\2\2\24\u0087\3\2\2\2\26\u008b\3\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32"+
		"\3\3\2\2\2\33\34\5\6\4\2\34#\b\3\1\2\35\36\5\26\f\2\36\37\5\6\4\2\37 "+
		"\b\3\1\2 \"\3\2\2\2!\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2"+
		"\2%#\3\2\2\2&\'\7\2\2\3\'\5\3\2\2\2()\5\24\13\2)*\7\20\2\2*+\5\24\13\2"+
		"+,\7\3\2\2,-\5\24\13\2-.\5\b\5\2./\5\24\13\2/\60\7\4\2\2\60\61\5\24\13"+
		"\2\61\62\b\4\1\2\62\7\3\2\2\2\63\64\5\24\13\2\64\65\5\n\6\2\65\66\5\24"+
		"\13\2\66\67\b\5\1\2\67\t\3\2\2\289\5\f\7\29H\b\6\1\2:;\5\24\13\2;<\7\5"+
		"\2\2<=\5\24\13\2=>\5\f\7\2>?\b\6\1\2?G\3\2\2\2@A\5\24\13\2AB\7\6\2\2B"+
		"C\5\24\13\2CD\5\f\7\2DE\b\6\1\2EG\3\2\2\2F:\3\2\2\2F@\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2I\13\3\2\2\2JH\3\2\2\2KL\5\16\b\2L[\b\7\1\2MN\5"+
		"\24\13\2NO\7\7\2\2OP\5\24\13\2PQ\5\16\b\2QR\b\7\1\2RZ\3\2\2\2ST\5\24\13"+
		"\2TU\7\b\2\2UV\5\24\13\2VW\5\16\b\2WX\b\7\1\2XZ\3\2\2\2YM\3\2\2\2YS\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2\2\2^_\5\20\t\2"+
		"_`\b\b\1\2`a\5\24\13\2ab\7\t\2\2bi\5\24\13\2cd\5\16\b\2de\b\b\1\2ej\3"+
		"\2\2\2fg\5\20\t\2gh\b\b\1\2hj\3\2\2\2ic\3\2\2\2if\3\2\2\2jo\3\2\2\2kl"+
		"\5\20\t\2lm\b\b\1\2mo\3\2\2\2n^\3\2\2\2nk\3\2\2\2o\17\3\2\2\2pq\7\6\2"+
		"\2qr\5\22\n\2rs\b\t\1\2sx\3\2\2\2tu\5\22\n\2uv\b\t\1\2vx\3\2\2\2wp\3\2"+
		"\2\2wt\3\2\2\2x\21\3\2\2\2yz\7\n\2\2z{\5\b\5\2{|\7\13\2\2|}\b\n\1\2}\u0083"+
		"\3\2\2\2~\177\7\16\2\2\177\u0083\b\n\1\2\u0080\u0081\7\20\2\2\u0081\u0083"+
		"\b\n\1\2\u0082y\3\2\2\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2\u0083\23\3"+
		"\2\2\2\u0084\u0086\7\17\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\25\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008c\7\f\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\7\r\2\2\u008e\27\3\2\2\2\r#FHY[inw\u0082\u0087\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}