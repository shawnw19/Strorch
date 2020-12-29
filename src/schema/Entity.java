package schema;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Entity implements Cloneable, Serializable {
    private String name;
    private Enumeration<Type> types;
    private List attributes;
    private Category category;

    public Entity() {
        attributes = new LinkedList();
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enumeration<Type> getTypes() {
        return types;
    }

    public void setTypes(Enumeration<Type> types) {
        this.types = types;
    }

    public boolean addType(Type t) {
        return types.addSymbol(t);
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public boolean addAttribute(Object a) {
        return attributes.add(a);
    }

    public boolean removeAttribute(Attribute a) {
        return attributes.remove(a);
    }
}
