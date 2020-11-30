import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class BaseTests {
    protected ExpressionListGrammarParser grammarParser;

    protected void prepareParser(String expression) {
        ExpressionListGrammarLexer grammarLexer = new ExpressionListGrammarLexer(CharStreams.fromString(expression));

        CommonTokenStream commonTokenStream = new CommonTokenStream(grammarLexer);
        grammarParser = new ExpressionListGrammarParser(commonTokenStream);
    }
}
