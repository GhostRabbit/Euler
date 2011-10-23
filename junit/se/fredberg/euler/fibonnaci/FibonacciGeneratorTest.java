package se.fredberg.euler.fibonnaci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciGeneratorTest {

    @Test
    public void fibonacciSequence() {
        FibonacciGenerator generator = new FibonacciGenerator();
        assertEquals(1, (int) generator.next());
        assertEquals(2, (int) generator.next());
        assertEquals(3, (int) generator.next());
        assertEquals(5, (int) generator.next());
        assertEquals(8, (int) generator.next());
        assertEquals(13, (int) generator.next());
        assertEquals(21, (int) generator.next());
        assertEquals(34, (int) generator.next());
        assertEquals(55, (int) generator.next());
        assertEquals(89, (int) generator.next());
    }

    @Test
    public void performanceTest() {
        // Expect this to be @Ignored to not slow down the suite
        FibonacciGenerator generator = new FibonacciGenerator();
        for (int i = 0; i < 5000; i++) {
            generator.next();
        }
    }
}
