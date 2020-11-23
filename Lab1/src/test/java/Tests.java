import org.junit.Test;
import syntax.ExpressionParser;

import static org.junit.Assert.assertEquals;

public class Tests {
    private ExpressionParser expressionParser = new ExpressionParser();
    private ExpressionParser.Node node;

    public void setUpExpressionParser(String expression) {
        node = expressionParser.parse(expression);
    }

    private String formatExpression(String expression) {
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

    @Test
    public void test1() {
        String expression = "    a xor     b   ";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void test2() {
        String expression = "(a and b) or not (c xor (a or not b))";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void test3() {
        String expression = "    a and     b   ";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void test4() {
        String expression = "  not( a or     b )  ";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }
}
