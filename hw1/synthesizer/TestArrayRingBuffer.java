package synthesizer;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer arb = new ArrayRingBuffer(3);
        arb.enqueue(2);
        arb.enqueue(4);
        arb.enqueue(6);
        Object first = arb.peek();
        Object exp_1 = 2;
        assertSame(first,exp_1);
        int fillcount = arb.fillCount;
        int exp_2 = 3;
        assertEquals(fillcount,exp_2);
    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
} 
