package se.fredberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class DivisorMatcherTest {

    @Test
    public void aCheckedSumIgnoresCertainValues() {
        DivisorMatcher matcher = new DivisorMatcher(3);
        assertThat(matcher.matches(2)).isFalse();
        assertThat(matcher.matches(3)).isTrue();
        assertThat(matcher.matches(9)).isTrue();
    }
}
