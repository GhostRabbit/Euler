package se.fredsberg.euler.util;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.sequence.Sequence;

public class SearchSequenceForMatch {

    private final Condition<Long> condition;
    private final Sequence<Long> sequence;

    public SearchSequenceForMatch(Sequence<Long> sequence, Condition<Long> condition) {
        this.sequence = sequence;
        this.condition = condition;
    }

    public Long finds() {
        while (true) {
            Long x = sequence.next();
            if (condition.forfilledBy(x)) {
                return x;
            }
        }
    }

}
