package core;

import java.io.Serializable;

public class BasicInformation implements Cloneable, Serializable {
    private String stringInfo;


    public BasicInformation(String stringInfo) {
        this.stringInfo = stringInfo;
    }
}
