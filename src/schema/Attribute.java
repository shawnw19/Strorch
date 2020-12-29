package schema;

import java.io.Serializable;

/**
 * This class is for servicing Entity as a field of it
 */
public class Attribute implements Cloneable, Serializable {
    Type type;
    private String name;
    private boolean optional;

    public Attribute(String name) {
        this.name = name;
    }
}
