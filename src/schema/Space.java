package schema;

import excluded.NumericEntity;

/**
 * A space is a basic unit in the "worldz".
 *
 * It is based on "Schema" concept in STEP,
 * but is simplified to a handler for overall control.
 */
public class Space extends Entity {

    //an abstract measure of size, complimentary to physical size
    NumericEntity semanticSize;

    Enumeration<Entity> entities;

    public Space() {
    }

    public NumericEntity getSemanticSize() {
        return semanticSize;
    }

    public Enumeration<Entity> getEntities() {
        return entities;
    }
}
