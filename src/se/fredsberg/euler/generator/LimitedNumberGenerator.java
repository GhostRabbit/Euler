package se.fredsberg.euler.generator;

import java.util.NoSuchElementException;

public class LimitedNumberGenerator implements LimitedGenerator<Integer> {
    
    private int i;
    private final int upperInclusive;

    public LimitedNumberGenerator(int start, int upperInclusiveLimit) {
        if (start > upperInclusiveLimit) {
            throw new IllegalArgumentException();
        }
        this.i = start;
        this.upperInclusive = upperInclusiveLimit;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return i++;
    }

    @Override
    public boolean hasNext() {
        return i <= upperInclusive;
    }

}
