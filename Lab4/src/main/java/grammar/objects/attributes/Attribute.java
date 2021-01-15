package grammar.objects.attributes;

import java.util.Objects;

public class Attribute<T> {
    public enum AttributeType {
        SYNTHESIZED,
        INHERITED
    }

    private final String name;
    private final AttributeType type;

    private T value;

    public Attribute(String name, AttributeType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public AttributeType getType() {
        return type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attribute<?> attribute = (Attribute<?>) o;
        return name.equals(attribute.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
