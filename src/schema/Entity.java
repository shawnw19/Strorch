package schema;

import java.io.Serializable;

public class Entity implements Cloneable, Serializable {
    Attribute basicInfo;


    public Entity(Attribute basicInfo) {
        this.basicInfo = basicInfo;
    }

    public Entity() {

    }
}
