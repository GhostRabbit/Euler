package se.fredsberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.EvenDivisorCondition;

public class EvenDivisorConditionTest {

    @Test
    public void aCheckedSumIgnoresCertainValues() {
        EvenDivisorCondition condition = new EvenDivisorCondition(3);
        assertThat(condition.forfilledBy(2)).isFalse();
        assertThat(condition.forfilledBy(3)).isTrue();
        assertThat(condition.forfilledBy(9)).isTrue();
    }
}
