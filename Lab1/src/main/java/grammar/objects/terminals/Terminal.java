package grammar.objects.terminals;

import com.fasterxml.jackson.annotation.JsonProperty;
import grammar.objects.GrammarObject;

import java.util.Objects;

public class Terminal<T> implements GrammarObject {
    public static final Terminal EPSILON = new Terminal("eps");
    public static final Terminal EOS = new Terminal("$");

    public enum TerminalOption {
        WHITESPACELESS,
        VARIABLE(true, "[a-z]"),
        INTEGER(true, "[0-9]+");

        private boolean containsExtraValue = false;
        private String regex = "";

        TerminalOption() {}

        TerminalOption(boolean containsExtraValue) {
            this.containsExtraValue = containsExtraValue;
        }

        TerminalOption(boolean containsExtraValue, String regex) {
            this.containsExtraValue = containsExtraValue;
            this.regex = regex;
        }

        public boolean isContainsExtraValue() {
            return containsExtraValue;
        }

        public String getRegex() {
            return regex;
        }
    }

    @JsonProperty("name")
    private String name;
    private TerminalOption terminalOption = null;

    private T extraValue;

    public Terminal(String name) {
        this.name = name;
    }

    public Terminal(@JsonProperty("name") String name, @JsonProperty("option") TerminalOption terminalOption) {
        this.name = name;
        this.terminalOption = terminalOption;
    }

    public Terminal(String name, TerminalOption terminalOption, T extraValue) {
        this.name = name;
        this.terminalOption = terminalOption;
        this.extraValue = extraValue;
    }

    public String getName() {
        return name;
    }

    public TerminalOption getTerminalOption() {
        return terminalOption;
    }

    public T getExtraValue() {
        return extraValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terminal<?> terminal = (Terminal<?>) o;
        return Objects.equals(name, terminal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, terminalOption, extraValue);
    }

    @Override
    public String toString() {
        if (terminalOption != null && terminalOption.containsExtraValue) {
            return String.format("{%s: %s}", getName(), extraValue);
        }

        return getName();
    }
}
