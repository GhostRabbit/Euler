package se.fredsberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.matcher.LessThenMatcher;

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
