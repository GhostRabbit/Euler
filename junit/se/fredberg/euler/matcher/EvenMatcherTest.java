package se.fredberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;


public class EvenMatcherTest {
    
    EvenMatcher matcher = new EvenMatcher();
    
    @Test
    public void matchesEvenNumbers() {
        assertThat(matcher.matches(2)).isTrue();
        assertThat(matcher.matches(4)).isTrue();
        assertThat(matcher.matches(0)).isTrue();
        assertThat(matcher.matches(-2)).isTrue();
    }
    
    @Test
    public void doesNotMatchUnevenNumbers() {
        assertThat(matcher.matches(1)).isFalse();
        assertThat(matcher.matches(3)).isFalse();
        assertThat(matcher.matches(-1)).isFalse();
    }

}
