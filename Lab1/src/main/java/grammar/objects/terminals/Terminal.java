package grammar.terminals;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Terminal {
    @JsonProperty
    private String name;

    public Terminal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
