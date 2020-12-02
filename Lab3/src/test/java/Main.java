import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String expression = scanner.nextLine();
            ExpressionListGrammarLexer grammarLexer = new ExpressionListGrammarLexer(CharStreams.fromString(expression));

            CommonTokenStream commonTokenStream = new CommonTokenStream(grammarLexer);
            ExpressionListGrammarParser grammarParser = new ExpressionListGrammarParser(commonTokenStream);
            System.out.println(grammarParser.parse().answer);
        }
    }
}
