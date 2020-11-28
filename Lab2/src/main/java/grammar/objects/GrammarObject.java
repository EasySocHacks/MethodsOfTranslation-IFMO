package grammar.objects;

public interface GrammarObject {
    String getName();
    boolean equals(Object o);
    int hashCode();
    String toString();
}
