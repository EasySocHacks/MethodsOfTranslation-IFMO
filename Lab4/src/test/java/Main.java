import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String args[]) {
        AntlrGrammarParserLexer lexer = new AntlrGrammarParserLexer(CharStreams.fromString("terminals:\n- abc\nnon-terminals:\n- ABC"));

        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        AntlrGrammarParserParser grammarParser = new AntlrGrammarParserParser(commonTokenStream);
        System.out.println(grammarParser.parse().nonTermList);
    }
}
