package grammar.objects.nonterminals.translators;

import grammar.objects.nonterminals.NonTerminal;

public abstract class Translator extends NonTerminal {
    public Translator(String name) {
        super("$" + name);
    }

    public abstract void eval(Object... args);
}
