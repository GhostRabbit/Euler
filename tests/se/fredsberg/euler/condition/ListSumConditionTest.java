package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import java.util.Arrays;

import org.junit.Test;

public class ListSumConditionTest {

    @Test
    public void testSum() {
        ListSumCondition condition = new ListSumCondition(3);
        assertThat(condition.forfilledBy(Arrays.asList(1, 1, 1))).isTrue();
        assertThat(condition.forfilledBy(Arrays.asList(1, 2, 1))).isFalse();
    }
}
