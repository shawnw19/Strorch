package core;

import java.io.Serializable;

public class Entity implements Cloneable, Serializable {
    BasicInformation basicInfo;


    public Entity(BasicInformation basicInfo) {
        this.basicInfo = basicInfo;
    }

    public Entity() {

    }
}
