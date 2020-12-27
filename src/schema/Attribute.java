package schema;

import java.io.Serializable;

/**
 * This class is for servicing Entity as a field of it
 */
public class Attribute implements Cloneable, Serializable {
    private String stringInfo;


    public Attribute(String stringInfo) {
        this.stringInfo = stringInfo;
    }
}
