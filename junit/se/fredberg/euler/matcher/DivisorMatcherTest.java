package se.fredberg.euler.matcher;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisorMatcherTest {

    @Test
    public void aCheckedSumIgnoresCertainValues() {
        DivisorMatcher matcher = new DivisorMatcher(3);
        assertFalse(matcher.matches(2));
        assertTrue(matcher.matches(3));
        assertTrue(matcher.matches(9));
    }
}
