import grammar.objects.nonterminals.NonTerminal;
import grammar.objects.attributes.Attribute;
import java.util.Map;
import java.util.List;

public class ReturnTranslator { 
   public static void run(List<Map<String, Attribute>> args) { 
       for (String attributeName : args.get(0).keySet()) {
   if (args.get(0).get(attributeName).getValue() != null && args.get(1).get(attributeName).getValue() == null) {
       args.get(1).get(attributeName).setValue(args.get(0).get(attributeName).getValue());
   }
} 
   }
}