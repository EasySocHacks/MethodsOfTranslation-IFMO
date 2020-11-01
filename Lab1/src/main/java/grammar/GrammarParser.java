package grammar;

import yaml.YamlReader;

public class GrammarParser {
    private Grammar grammar;

    public GrammarParser() {
        YamlReader yamlReader = new YamlReader("grammar.yaml");

        try {
            grammar = yamlReader.readValue(Grammar.class);
            grammar.buildGrammar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Grammar getGrammar() {
        return grammar;
    }
}
