package se.fredberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ListSumMatcherTest {

    @Test
    public void testSum() {
        ListSumMatcher SUT = new ListSumMatcher(3);
        assertThat(SUT.matches(Arrays.asList(1, 1, 1))).isTrue();
    }
}
