package se.fredsberg.euler.util;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.sequence.Sequence;

public class SearchSequenceForMatch {

    private final Condition<Integer> condition;
    private final Sequence<Integer> sequence;

    public SearchSequenceForMatch(Sequence<Integer> sequence, Condition<Integer> condition) {
        this.condition = condition;
        this.sequence = sequence;
    }

    public Integer finds() {
        while (true) {
            Integer x = sequence.next();
            if (condition.forfilledBy(x)) {
                return x;
            }
        }
    }

}
