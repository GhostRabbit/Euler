package se.fredberg.euler.processor;

import static org.junit.Assert.*;

import org.junit.Test;


public class MaxProcessorTest {

    @Test
    public void extractMax() {
        MaxProcessor max = new MaxProcessor();
        assertEquals(Integer.MIN_VALUE, (int) max.getResult());
        max.process(-5);
        assertEquals(-5, (int) max.getResult());
        max.process(5);
        assertEquals(5, (int) max.getResult());
        max.process(0);
        assertEquals(5, (int) max.getResult());
    }
}
