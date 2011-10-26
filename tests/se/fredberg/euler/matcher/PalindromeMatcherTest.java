package se.fredberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

public class PalindromeMatcherTest {

    @Test
    public void matching() {
        PalindromeMatcher matcher = new PalindromeMatcher();
        assertThat(matcher.matches(1001)).isTrue();
        assertThat(matcher.matches(101201)).isFalse();
        assertThat(matcher.matches(123321)).isTrue();
    }
}
