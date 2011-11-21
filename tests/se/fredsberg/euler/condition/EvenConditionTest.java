package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.condition.EvenCondition;

public class EvenConditionTest {

    private EvenCondition condition;

    @BeforeMethod
    public void setUp() {
        condition = new EvenCondition();
    }

    @Test
    public void forfilledByEvenNumbers() {
        assertThat(condition.forfilledBy(2L)).isTrue();
        assertThat(condition.forfilledBy(4L)).isTrue();
        assertThat(condition.forfilledBy(0L)).isTrue();
        assertThat(condition.forfilledBy(-2L)).isTrue();
    }

    @Test
    public void doesNotMatchUnevenNumbers() {
        assertThat(condition.forfilledBy(1L)).isFalse();
        assertThat(condition.forfilledBy(3L)).isFalse();
        assertThat(condition.forfilledBy(-1L)).isFalse();
    }

}
