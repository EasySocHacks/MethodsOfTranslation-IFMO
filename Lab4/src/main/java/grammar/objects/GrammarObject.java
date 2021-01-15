package grammar.objects;

import grammar.objects.attributes.Attribute;

import java.util.ArrayList;
import java.util.List;

public interface GrammarObject {
    List<Attribute<?>> attributes = new ArrayList();

    String getName();
    boolean equals(Object o);
    int hashCode();
    String toString();
}
