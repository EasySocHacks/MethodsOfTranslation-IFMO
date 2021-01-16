package grammar.objects.nonterminals.translators;

public enum TranslatorEnum {
    EQ(new EqTranslator("EQ"));

    Translator translator;

    TranslatorEnum(Translator translator) {
        this.translator = translator;
    }

    public Translator getTranslator() {
        return translator;
    }
}
