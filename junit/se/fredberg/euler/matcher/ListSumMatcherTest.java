package se.fredberg.euler.matcher;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import se.fredberg.euler.matcher.ListSumMatcher;


public class ListSumMatcherTest {

    @Test
    public void testSum() {
        ListSumMatcher SUT = new ListSumMatcher(3);
        assertTrue(SUT.matches(Arrays.asList(1, 1, 1)));
    }
}
