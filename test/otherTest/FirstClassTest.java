package otherTest;

import org.junit.Test;
import other.FirstClass;

import static org.junit.Assert.*;

public class FirstClassTest {

    @Test
    public void test(){
        FirstClass test = new FirstClass();
        int result = test.getNum(1);

        assertEquals(5,result);
    }

}