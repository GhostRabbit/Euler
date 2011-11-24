package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class EvenConditionTest {

    private EvenCondition condition;

    @Before
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
