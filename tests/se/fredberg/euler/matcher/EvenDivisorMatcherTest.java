package se.fredberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

public class EvenDivisorMatcherTest {

    @Test
    public void aCheckedSumIgnoresCertainValues() {
        EvenDivisorMatcher matcher = new EvenDivisorMatcher(3);
        assertThat(matcher.matches(2)).isFalse();
        assertThat(matcher.matches(3)).isTrue();
        assertThat(matcher.matches(9)).isTrue();
    }
}
