package se.fredberg.euler.util;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class ListSumMatcherTest {

    @Test
    public void testSum() {
        ListSumMatcher SUT = new ListSumMatcher(3);
        assertTrue(SUT.matches(Arrays.asList(1, 1, 1)));
    }
}
