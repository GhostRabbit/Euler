package se.fredberg.euler.matcher;


import static org.fest.assertions.Assertions.*;

import org.junit.Test;


public class LessThenMatcherTest {

    @Test
    public void limitShouldBeStrict() {
        LessThenMatcher matcher = new LessThenMatcher(5);
        assertThat(matcher.matches(3)).isTrue();
        assertThat(matcher.matches(4)).isTrue();
        assertThat(matcher.matches(5)).isFalse();
        assertThat(matcher.matches(6)).isFalse();
    }
}
