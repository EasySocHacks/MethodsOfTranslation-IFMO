package grammar.objects.terminals;

import com.fasterxml.jackson.annotation.JsonProperty;
import grammar.objects.GrammarObject;

import java.util.Objects;

public class Terminal implements GrammarObject {
    public static final Terminal EPSILON = new Terminal("eps");

    @JsonProperty
    private String name;

    public Terminal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terminal terminal = (Terminal) o;
        return Objects.equals(name, terminal.name);
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
