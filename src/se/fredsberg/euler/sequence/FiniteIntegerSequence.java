package se.fredsberg.euler.sequence;

import java.util.NoSuchElementException;

public class FiniteIntegerSequence implements FiniteSequence<Integer> {
    
    private int current;
    private final int upperInclusive;

    public FiniteIntegerSequence(int upperInclusiveLimit) {
        this.current = 1;
        this.upperInclusive = upperInclusiveLimit;
    }
     
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return current++;
    }

    @Override
    public boolean hasNext() {
        return current <= upperInclusive;
    }

}
