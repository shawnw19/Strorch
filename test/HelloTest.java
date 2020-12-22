import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class HelloTest {

    Hello hello = new Hello();

    @Test
    public void name() {

        assertNotNull(hello);
    }
}