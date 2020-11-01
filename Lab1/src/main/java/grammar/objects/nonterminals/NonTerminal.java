package grammar.objects.nonterminals;

import com.fasterxml.jackson.annotation.JsonProperty;
import grammar.objects.GrammarObject;

import java.util.Objects;

public class NonTerminal implements GrammarObject {
    @JsonProperty
    private String name;

    public NonTerminal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonTerminal that = (NonTerminal) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
