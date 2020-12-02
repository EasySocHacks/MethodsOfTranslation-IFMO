// Generated from ExpressionListGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionListGrammarParser}.
 */
public interface ExpressionListGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ExpressionListGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ExpressionListGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ExpressionListGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ExpressionListGrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpressionListGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpressionListGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#calculatedExpression}.
	 * @param ctx the parse tree
	 */
	void enterCalculatedExpression(ExpressionListGrammarParser.CalculatedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#calculatedExpression}.
	 * @param ctx the parse tree
	 */
	void exitCalculatedExpression(ExpressionListGrammarParser.CalculatedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#plusAndMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusAndMinus(ExpressionListGrammarParser.PlusAndMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#plusAndMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusAndMinus(ExpressionListGrammarParser.PlusAndMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#multiplyAndDivide}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyAndDivide(ExpressionListGrammarParser.MultiplyAndDivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#multiplyAndDivide}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyAndDivide(ExpressionListGrammarParser.MultiplyAndDivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(ExpressionListGrammarParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(ExpressionListGrammarParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(ExpressionListGrammarParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(ExpressionListGrammarParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#bracketsOrNumberOrVariable}.
	 * @param ctx the parse tree
	 */
	void enterBracketsOrNumberOrVariable(ExpressionListGrammarParser.BracketsOrNumberOrVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#bracketsOrNumberOrVariable}.
	 * @param ctx the parse tree
	 */
	void exitBracketsOrNumberOrVariable(ExpressionListGrammarParser.BracketsOrNumberOrVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#maybeWhitespaces}.
	 * @param ctx the parse tree
	 */
	void enterMaybeWhitespaces(ExpressionListGrammarParser.MaybeWhitespacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#maybeWhitespaces}.
	 * @param ctx the parse tree
	 */
	void exitMaybeWhitespaces(ExpressionListGrammarParser.MaybeWhitespacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionListGrammarParser#lineSeparator}.
	 * @param ctx the parse tree
	 */
	void enterLineSeparator(ExpressionListGrammarParser.LineSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionListGrammarParser#lineSeparator}.
	 * @param ctx the parse tree
	 */
	void exitLineSeparator(ExpressionListGrammarParser.LineSeparatorContext ctx);
}