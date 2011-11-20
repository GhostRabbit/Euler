package se.fredsberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import java.util.Arrays;

import org.testng.annotations.Test;

import se.fredsberg.euler.matcher.ListSumCondition;

public class ListSumConditionTest {

    @Test
    public void testSum() {
        ListSumCondition condition = new ListSumCondition(3);
        assertThat(condition.forfilledBy(Arrays.asList(1, 1, 1))).isTrue();
    }
}