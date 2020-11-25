import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModificationTests extends BaseTests {
    @Test
    public void modificationTests_1() throws ExpressionParserException, TokenizerParseException {
        String expression = "a xor b xor c or d or e xor f or g xor h";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void modificationTests_2() throws ExpressionParserException, TokenizerParseException {
        String expression = "a xor b xor c and z or d or e and z xor f or g xor h";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void modificationTests_3() throws ExpressionParserException, TokenizerParseException {
        String expression = "a or b or c or d or e";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void modificationTests_4() throws ExpressionParserException, TokenizerParseException {
        String expression = "a xor b xor d xor e";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }

    @Test
    public void modificationTests_5() throws ExpressionParserException, TokenizerParseException {
        String expression = "A or (B xor C and Z) or D";
        setUpExpressionParser(expression);

        assertEquals(formatExpression(expression), node.toString());
    }
}
