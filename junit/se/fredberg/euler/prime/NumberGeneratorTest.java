package se.fredberg.euler.prime;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberGeneratorTest {

    @Test
    public void firstNumberShouldBeStart() {
        assertEquals(42, new NumberGenerator(42).next());
    }

    @Test
    public void subsequencalNumbersShouldBeIncremetnsOfOne() {
        NumberGenerator numbers = new NumberGenerator(2);
        assertEquals(2, numbers.next());
        assertEquals(3, numbers.next());
        assertEquals(4, numbers.next());
    }

}
