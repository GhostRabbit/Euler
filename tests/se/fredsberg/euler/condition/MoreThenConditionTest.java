package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.MoreThenCondition;


public class MoreThenConditionTest {

    @Test
    public void limitShouldBeStrict() {
        MoreThenCondition condition = new MoreThenCondition(5);
        assertThat(condition.forfilledBy(3L)).isFalse();
        assertThat(condition.forfilledBy(4L)).isFalse();
        assertThat(condition.forfilledBy(5L)).isFalse();
        assertThat(condition.forfilledBy(6L)).isTrue();
    }

}
