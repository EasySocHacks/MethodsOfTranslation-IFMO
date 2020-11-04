import grammar.Grammar;
import grammar.GrammarParser;
import lexic.LexicalAnalyzer;
import yaml.YamlReader;

public class Main {
    public static void main(String[] args) {
        GrammarParser grammarParser = new GrammarParser();
        Grammar grammar = grammarParser.getGrammar();

        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer("   and(xor a or)or   and xor   ", grammar.getTerminals());
        try {
            System.out.println(lexicalAnalyzer.nextToken());
            System.out.println(lexicalAnalyzer.nextToken());
            System.out.println(lexicalAnalyzer.nextToken());
            System.out.println(lexicalAnalyzer.nextToken());
            System.out.println(lexicalAnalyzer.nextToken());
            System.out.println(lexicalAnalyzer.nextToken());
            System.out.println(lexicalAnalyzer.nextToken());
            System.out.println(lexicalAnalyzer.nextToken());
            System.out.println(lexicalAnalyzer.nextToken());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
