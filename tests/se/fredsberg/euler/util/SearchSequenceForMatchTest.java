package se.fredsberg.euler.util;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.condition.EvenDivisorCondition;
import se.fredsberg.euler.sequence.DiscreteSequence;
import se.fredsberg.euler.sequence.Sequence;
import se.fredsberg.euler.util.SearchSequenceForMatch;


public class SearchSequenceForMatchTest {

    @Test(invocationTimeOut = 100)
    public void find() {
        Condition<Long> matches3 = new EvenDivisorCondition(3);
        Sequence<Long> sequence = new DiscreteSequence();
        sequence.next(); // Bypass 0
        SearchSequenceForMatch finder = new SearchSequenceForMatch(sequence, matches3);
        assertThat(finder.finds()).isEqualTo(3);
    }
}
