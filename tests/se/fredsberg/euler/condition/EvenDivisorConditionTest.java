package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class EvenDivisorConditionTest {

    @Test
    public void aCheckedSumIgnoresCertainValues() {
        EvenDivisorCondition condition = new EvenDivisorCondition(3);
        assertThat(condition.forfilledBy(2L)).isFalse();
        assertThat(condition.forfilledBy(3L)).isTrue();
        assertThat(condition.forfilledBy(9L)).isTrue();
    }
}
