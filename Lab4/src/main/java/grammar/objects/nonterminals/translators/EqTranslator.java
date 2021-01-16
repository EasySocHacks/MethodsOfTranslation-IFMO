package grammar.objects.nonterminals.translators;

import grammar.objects.GrammarObject;

public class EqTranslator extends Translator {
    public EqTranslator(String name) {
        super(name);
    }

    @Override
    public void eval(Object... args) {
        GrammarObject obj0 = (GrammarObject) args[0];
        GrammarObject obj1 = (GrammarObject) args[1];

        obj0.getAttributes().get("value").setValue(obj1.getAttributes().get("value").getValue());
    }
}
