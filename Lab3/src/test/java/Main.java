import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String expression = "a = 2;\n" +
                "b = a + 2;\n" +
                "c = a + b * (b - 3);\n" +
                "a = 3;\n" +
                "c = a + b * (b - 3);";
        ExpressionListGrammarLexer testGrammarLexer = new ExpressionListGrammarLexer(CharStreams.fromString(expression));

        CommonTokenStream commonTokenStream = new CommonTokenStream(testGrammarLexer);
        ExpressionListGrammarParser testGrammarParser = new ExpressionListGrammarParser(commonTokenStream);
        System.out.println(testGrammarParser.parse().answer);
    }
}
