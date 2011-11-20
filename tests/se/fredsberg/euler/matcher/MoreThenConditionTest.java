package se.fredsberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.MoreThenCondition;


public class MoreThenConditionTest {

    @Test
    public void limitShouldBeStrict() {
        MoreThenCondition condition = new MoreThenCondition(5);
        assertThat(condition.forfilledBy(3)).isFalse();
        assertThat(condition.forfilledBy(4)).isFalse();
        assertThat(condition.forfilledBy(5)).isFalse();
        assertThat(condition.forfilledBy(6)).isTrue();
    }

}
