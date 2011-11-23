package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.PalindromeCondition;

public class PalindromeConditionTest {

    @Test
    public void matching() {
        PalindromeCondition<Integer> condition = new PalindromeCondition<Integer>();
        assertThat(condition.forfilledBy(1001)).isTrue();
        assertThat(condition.forfilledBy(101201)).isFalse();
        assertThat(condition.forfilledBy(123321)).isTrue();
    }
}
