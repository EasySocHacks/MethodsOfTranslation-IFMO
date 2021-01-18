package grammar.objects.nonterminals.translators;

import exceptions.grammar.CreateTranslatorWithCurrentCodeException;
import grammar.objects.attributes.Attribute;

import java.util.HashMap;
import java.util.Map;

public class CopyTranslator extends Translator {
    private static String code =
            "for (String attributeName : args.get(0).keySet()) {" + System.lineSeparator() +
            "   if (args.get(0).get(attributeName).getValue() != null && args.get(1).get(attributeName).getValue() == null) {" + System.lineSeparator() +
            "       args.get(1).get(attributeName).setValue(args.get(0).get(attributeName).getValue());" + System.lineSeparator() +
            "   }" + System.lineSeparator() +
            "}";

    public CopyTranslator(String grammarName) throws CreateTranslatorWithCurrentCodeException {
        super(grammarName, new Code("", code), TranslatorType.COPY_TRANSLATOR);

        Map<String, Attribute> args0 = new HashMap<>();
        Map<String, Attribute> args1 = new HashMap<>();

        for (String attributeName : args0.keySet()) {
            if (args0.get(attributeName).getValue() != null && args1.get(attributeName).getValue() == null) {
                args1.get(attributeName).setValue(args0.get(attributeName).getValue());
            }
        }
    }
}
