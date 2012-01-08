package se.fredsberg.euler.sequence;

import java.util.Stack;


public class FibonacciSequence implements Sequence<Long> {

    // To hold the two last numbers to add
    private Stack<Long> latestPair;

    public FibonacciSequence() {
        latestPair = new Stack<Long>();
    }

    @Override
    public Long next() {
        long next = calculateNext();
        latestPair.add(next); // The new second
        return next;
    }

    private long calculateNext() {
        if (latestPair.size() < 2) {
            // The first two values are special
            return latestPair.size() + 1;
        }
        long second = latestPair.pop();
        long first = latestPair.pop();
        latestPair.add(second); // The new first
        return first + second;
    }
}
