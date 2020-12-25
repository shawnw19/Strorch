package core;

import java.util.concurrent.Callable;

public class Functor extends Entity implements Callable {
    private final EntityType type = EntityType.FUNCTOR;

    public Functor(BasicInformation basicInfo) {
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
