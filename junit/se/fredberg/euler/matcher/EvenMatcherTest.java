package se.fredberg.euler.matcher;

import static org.junit.Assert.*;

import org.junit.Test;


public class EvenMatcherTest {
    
    EvenMatcher matcher = new EvenMatcher();
    
    @Test
    public void matchesEvenNumbers() {
        assertTrue(matcher.matches(2));
        assertTrue(matcher.matches(4));
        assertTrue(matcher.matches(0));
        assertTrue(matcher.matches(-2));
    }
    
    @Test
    public void doesNotMatchUnevenNumbers() {
        assertFalse(matcher.matches(1));
        assertFalse(matcher.matches(3));
        assertFalse(matcher.matches(-1));
    }

}
