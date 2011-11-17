package se.fredsberg.euler.generator;

import java.util.Stack;


public class FibonacciGenerator implements Generator<Integer> {

    // To hold the two last numbers to add
    private Stack<Integer> latestPair;

    public FibonacciGenerator() {
        latestPair = new Stack<Integer>();
    }

    @Override
    public Integer next() {
        int next = calculateNext();
        latestPair.add(next); // The new second
        return next;
    }

    private int calculateNext() {
        if (latestPair.size() < 2) {
            // The first two values are special
            return latestPair.size() + 1;
        }
        int second = latestPair.pop();
        int first = latestPair.pop();
        latestPair.add(second); // The new first
        return first + second;
    }
}
