import grammar.objects.nonterminals.NonTerminal;
import grammar.objects.attributes.Attribute;
import java.util.Map;
import java.util.List;

public class Translator3 { 
   public static void run(List<Map<String, Attribute>> args) { 
       args.get(0).get("ans").setValue((int)1); 
   }
}