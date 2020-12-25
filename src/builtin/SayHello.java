package builtin;

public class SayHello {
    private String yourName;

    public SayHello() {
    }

    public SayHello(String yourName) {
        this.yourName = yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    //@Override
    public Object call() throws Exception {
        return this.execute();
    }

    //@Override
    public Object execute() {
        System.out.printf("Hello %.s!\n", yourName);
        return null;
    }
}
