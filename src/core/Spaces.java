package core;

import java.util.TreeSet;

public class Spaces extends Entity {
    private static Spaces spaces;

    TreeSet<Space> spaceSet = new TreeSet<Space>();

    private Spaces() {
        super();
    }

    public static Spaces getInstance() {
        if (spaces == null) {
            spaces = new Spaces();
        }
        return spaces;
    }


}
