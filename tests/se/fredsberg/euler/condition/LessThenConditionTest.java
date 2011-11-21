package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.LessThenCondition;

public class LessThenConditionTest {

    @Test
    public void limitShouldBeStrict() {
        LessThenCondition condition = new LessThenCondition(5);
        assertThat(condition.forfilledBy(3L)).isTrue();
        assertThat(condition.forfilledBy(4L)).isTrue();
        assertThat(condition.forfilledBy(5L)).isFalse();
        assertThat(condition.forfilledBy(6L)).isFalse();
    }
}
