package se.fredsberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.matcher.PalindromeCondition;

public class PalindromeConditionTest {

    @Test
    public void matching() {
        PalindromeCondition condition = new PalindromeCondition();
        assertThat(condition.forfilledBy(1001)).isTrue();
        assertThat(condition.forfilledBy(101201)).isFalse();
        assertThat(condition.forfilledBy(123321)).isTrue();
    }
}
