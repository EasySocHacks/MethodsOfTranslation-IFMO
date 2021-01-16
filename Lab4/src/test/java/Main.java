import grammar.Grammar;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        StringBuilder grammarStringBuilder = new StringBuilder();

        try {
            Scanner scanner = new Scanner(new File("src/main/java/resources/grammar"));

            while (scanner.hasNextLine()) {
                grammarStringBuilder.append(scanner.nextLine());

                if (scanner.hasNextLine()) {
                    grammarStringBuilder.append(System.lineSeparator());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        AntlrGrammarParserLexer lexer = new AntlrGrammarParserLexer(CharStreams.fromString(grammarStringBuilder.toString()));

        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        AntlrGrammarParserParser grammarParser = new AntlrGrammarParserParser(commonTokenStream);
        Grammar grammar = grammarParser.parse().grammar;
        System.out.println(grammar);
        System.out.println(grammar.getNonTerminals());
        System.out.println(grammar.getTerminals());
        System.out.println(grammar.getRuleList());
    }
}
