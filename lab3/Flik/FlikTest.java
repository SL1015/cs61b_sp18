import org.junit.Test;

import static org.junit.Assert.*;

public class FlikTest {
    @Test
    public void testFlik(){
        int a = 500;
        int b = 600;
        assertFalse(Flik.isSameNumber(a,b));
        assertTrue(Flik.isSameNumber(a,a));
    }
}
