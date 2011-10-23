package se.fredberg.euler.generator;

import static org.junit.Assert.*;

import org.junit.Test;


public class NaturalNumberGeneratorTest {

    @Test
    public void testNaturalNumberSequence() {
        NaturalNumberGenerator generator = new NaturalNumberGenerator();
        assertEquals(0, (int) generator.next());
        assertEquals(1, (int) generator.next());
        assertEquals(2, (int) generator.next());
    }
}
