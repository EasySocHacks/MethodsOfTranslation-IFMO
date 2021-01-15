package grammar.objects.nonterminals;

public class Translator extends NonTerminal {
    private final String code;

    public Translator(String code) {
        super("{ " + code + " }");

        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
