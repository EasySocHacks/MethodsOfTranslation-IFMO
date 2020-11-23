import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import org.junit.Test;

public class LexicalAnalyzerTests extends BaseTests {

    @Test(expected = TokenizerParseException.class)
    public void lexicalAnalyzerTest_1() throws ExpressionParserException, TokenizerParseException {
        String expression = "abacaba";
        setUpExpressionParser(expression);
    }

    @Test(expected = TokenizerParseException.class)
    public void lexicalAnalyzerTest_2() throws ExpressionParserException, TokenizerParseException {
        String expression = "a xorb";
        setUpExpressionParser(expression);
    }
}
