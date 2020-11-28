import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import org.junit.Test;

public class SyntaxAnalyzerTests extends BaseTests {

    @Test(expected = ExpressionParserException.class)
    public void lexicalAnalyzerTest_1() throws ExpressionParserException, TokenizerParseException {
        String expression = "";
        setUpExpressionParser(expression);
    }

    @Test(expected = ExpressionParserException.class)
    public void lexicalAnalyzerTest_2() throws ExpressionParserException, TokenizerParseException {
        String expression = "not";
        setUpExpressionParser(expression);
    }

    @Test(expected = ExpressionParserException.class)
    public void lexicalAnalyzerTest_3() throws ExpressionParserException, TokenizerParseException {
        String expression = ") a and b (";
        setUpExpressionParser(expression);
    }

    @Test(expected = ExpressionParserException.class)
    public void lexicalAnalyzerTest_4() throws ExpressionParserException, TokenizerParseException {
        String expression = "a and or b";
        setUpExpressionParser(expression);
    }

    @Test(expected = ExpressionParserException.class)
    public void lexicalAnalyzerTest_5() throws ExpressionParserException, TokenizerParseException {
        String expression = "not ()";
        setUpExpressionParser(expression);
    }

    @Test(expected = ExpressionParserException.class)
    public void lexicalAnalyzerTest_6() throws ExpressionParserException, TokenizerParseException {
        String expression = "not () a";
        setUpExpressionParser(expression);
    }

    @Test(expected = ExpressionParserException.class)
    public void lexicalAnalyzerTest_7() throws ExpressionParserException, TokenizerParseException {
        String expression = "     and ";
        setUpExpressionParser(expression);
    }

    @Test(expected = ExpressionParserException.class)
    public void lexicalAnalyzerTest_8() throws ExpressionParserException, TokenizerParseException {
        String expression = "a b xor c";
        setUpExpressionParser(expression);
    }
}
