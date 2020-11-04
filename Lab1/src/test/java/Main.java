import grammar.Grammar;
import grammar.GrammarParser;
import yaml.YamlReader;

public class Main {
    public static void main(String[] args) {
        GrammarParser grammarParser = new GrammarParser();
        Grammar grammar = grammarParser.getGrammar();

        System.out.println(grammar.getRuleList());
    }
}
