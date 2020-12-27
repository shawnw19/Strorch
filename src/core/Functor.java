package core;

import schema.Attribute;
import schema.Entity;
import schema.Type;

import java.util.concurrent.Callable;

public class Functor extends Entity implements Callable {


    public Functor(Attribute basicInfo) {
        super();
    }

    public Functor() {
    }

    @Override
    public Object call() throws Exception {
        return null;
    }

    public Object execute() {
        return null;
    }
}
