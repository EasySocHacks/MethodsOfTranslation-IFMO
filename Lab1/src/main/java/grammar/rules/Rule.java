package grammar.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import grammar.objects.GrammarObject;
import grammar.objects.nonterminals.NonTerminal;

import java.util.List;

public class Rule {
    @JsonProperty
    private final NonTerminal fromNonTerminal;
    private final List<GrammarObject> toGrammarObjectsList;

    public Rule(NonTerminal fromNonTerminal, List<GrammarObject> toGrammarObjectsList) {
        this.fromNonTerminal = fromNonTerminal;
        this.toGrammarObjectsList = toGrammarObjectsList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(fromNonTerminal.toString()).append(" ");
        stringBuilder.append("->").append(" ");

        for (GrammarObject grammarObject : toGrammarObjectsList) {
            stringBuilder.append(grammarObject).append(" ");
        }

        return stringBuilder.toString();
    }

    public NonTerminal getFromNonTerminal() {
        return fromNonTerminal;
    }

    public List<GrammarObject> getToGrammarObjectsList() {
        return toGrammarObjectsList;
    }
}
