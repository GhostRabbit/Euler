package se.fredberg.euler.prime;

import static org.junit.Assert.*;

import org.junit.Test;


public class FilteredGeneratorTest {

    @Test
    public void shouldForwardNumberFromGenerator() {
        Generator generator = new NumberGenerator(2);
        FilteredGenerator filter = new FilteredGenerator(3, generator);
        assertEquals(2, filter.next());
    }

    @Test
    public void shouldSkipNumberFromGeneratorOfDivisable() {
        Generator generator = new NumberGenerator(2);
        FilteredGenerator filter = new FilteredGenerator(2, generator);
        assertEquals(3, filter.next());
        assertEquals(5, filter.next());
    }

}
