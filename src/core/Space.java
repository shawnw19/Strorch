package core;

import java.util.TreeSet;

/**
 * A space is a basic unit in the "worldz".
 */
public class Space extends Entity {

    //an abstract measure of size, complimentary to physical size
    NumericEntity semanticSize;

    TreeSet<Entity> entities = new TreeSet<Entity>();

    public Space(BasicInformation basicInfo) {
        super(basicInfo);
    }

    public NumericEntity getSemanticSize() {
        return semanticSize;
    }

    public TreeSet<Entity> getEntities() {
        return entities;
    }
}
