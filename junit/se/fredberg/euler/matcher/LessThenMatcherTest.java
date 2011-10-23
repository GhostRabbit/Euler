package se.fredberg.euler.matcher;

import static org.junit.Assert.*;

import org.junit.Test;


public class LessThenMatcherTest {

    @Test
    public void limitShouldBeStrict() {
        LessThenMatcher matcher = new LessThenMatcher(5);
        assertTrue(matcher.matches(3));
        assertTrue(matcher.matches(4));
        assertFalse(matcher.matches(5));
        assertFalse(matcher.matches(6));
    }
}
