import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import syntax.ExpressionParser;

public abstract class BaseTests {
    private ExpressionParser expressionParser = new ExpressionParser();
    protected ExpressionParser.Node node;

    protected void setUpExpressionParser(String expression) throws ExpressionParserException, TokenizerParseException {
        node = expressionParser.parse(expression);
    }

    protected String formatExpression(String expression) {
        String newExpression = expression;

        newExpression = newExpression.replaceAll("( )+", " ");

        newExpression = newExpression.replaceAll(" $", "");
        newExpression = newExpression.replaceAll("^ ", "");

        newExpression = newExpression.replaceAll("\\(([^ ])", "( $1");
        newExpression = newExpression.replaceAll("([^ ])\\(", "$1 (");

        newExpression = newExpression.replaceAll("\\)([^ ])", ") $1");
        newExpression = newExpression.replaceAll("([^ ])\\)", "$1 )");

        return newExpression;
    }
}
