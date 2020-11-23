import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleUnitTests extends BaseTests {
    @Test
    public void unitTest_1() throws ExpressionParserException, TokenizerParseException {
        String expression = "    a xor     b   ";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void unitTest_2() throws ExpressionParserException, TokenizerParseException {
        String expression = "(a and b) or not (c xor (a or not b))";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void unitTest_3() throws ExpressionParserException, TokenizerParseException {
        String expression = "not not not (((not a)))";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void unitTest_4() throws ExpressionParserException, TokenizerParseException {
        String expression = "a xor a and a or a xor (not a) and not (a) or not a xor (a and (a or a))";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }
}
