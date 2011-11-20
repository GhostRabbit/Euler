package se.fredsberg.euler.util;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.matcher.EvenDivisorCondition;
import se.fredsberg.euler.matcher.Condition;
import se.fredsberg.euler.sequence.IntegerSequence;
import se.fredsberg.euler.util.FindLooper;


public class FindLooperTest {

    @Test(invocationTimeOut = 100)
    public void find() {
        Condition<Integer> matches3 = new EvenDivisorCondition(3);
        IntegerSequence generator = new IntegerSequence();
        generator.next(); // Bypass 0
        FindLooper finder = new FindLooper(matches3, generator);
        assertThat(finder.finds()).isEqualTo(3);
    }
}
