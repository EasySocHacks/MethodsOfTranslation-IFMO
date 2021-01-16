package grammar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GrammarParser {
    public GrammarParser(File grammarFile) {
        StringBuilder grammarStringBuilder = new StringBuilder();

        try {
            Scanner scanner = new Scanner(grammarFile);

            while (scanner.hasNextLine()) {
                grammarStringBuilder.append(scanner.nextLine());

                if (scanner.hasNextLine()) {
                    grammarStringBuilder.append(System.lineSeparator());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
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
     */
}
