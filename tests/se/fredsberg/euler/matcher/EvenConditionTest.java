package se.fredsberg.euler.matcher;

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
        assertThat(condition.forfilledBy(2)).isTrue();
        assertThat(condition.forfilledBy(4)).isTrue();
        assertThat(condition.forfilledBy(0)).isTrue();
        assertThat(condition.forfilledBy(-2)).isTrue();
    }

    @Test
    public void doesNotMatchUnevenNumbers() {
        assertThat(condition.forfilledBy(1)).isFalse();
        assertThat(condition.forfilledBy(3)).isFalse();
        assertThat(condition.forfilledBy(-1)).isFalse();
    }

}
