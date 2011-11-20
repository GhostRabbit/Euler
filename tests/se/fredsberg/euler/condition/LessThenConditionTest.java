package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.LessThenCondition;

public class LessThenConditionTest {

    @Test
    public void limitShouldBeStrict() {
        LessThenCondition condition = new LessThenCondition(5);
        assertThat(condition.forfilledBy(3)).isTrue();
        assertThat(condition.forfilledBy(4)).isTrue();
        assertThat(condition.forfilledBy(5)).isFalse();
        assertThat(condition.forfilledBy(6)).isFalse();
    }
}
