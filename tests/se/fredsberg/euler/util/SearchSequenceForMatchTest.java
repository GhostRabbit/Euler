package se.fredsberg.euler.util;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.condition.EvenDivisorCondition;
import se.fredsberg.euler.sequence.IntegerSequence;
import se.fredsberg.euler.util.SearchSequenceForMatch;


public class SearchSequenceForMatchTest {

    @Test(invocationTimeOut = 100)
    public void find() {
        Condition<Integer> matches3 = new EvenDivisorCondition(3);
        IntegerSequence generator = new IntegerSequence();
        generator.next(); // Bypass 0
        SearchSequenceForMatch finder = new SearchSequenceForMatch(generator, matches3);
        assertThat(finder.finds()).isEqualTo(3);
    }
}
