package se.fredsberg.euler.util;

import se.fredsberg.euler.matcher.Condition;
import se.fredsberg.euler.sequence.Sequence;

public class FindLooper {

    private final Condition<Integer> condition;
    private final Sequence<Integer> sequence;

    public FindLooper(Condition<Integer> condition, Sequence<Integer> sequence) {
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
