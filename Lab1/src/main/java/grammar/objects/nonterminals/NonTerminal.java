package grammar.nonterminals;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NonTerminal {
    @JsonProperty
    private String name;

    public NonTerminal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
