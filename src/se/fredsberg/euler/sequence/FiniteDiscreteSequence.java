package se.fredsberg.euler.sequence;

import java.util.NoSuchElementException;

public class FiniteDiscreteSequence implements FiniteSequence<Long> {
    
    private long current;
    private final int upperInclusive;

    public FiniteDiscreteSequence(int upperInclusiveLimit) {
        this.current = 1;
        this.upperInclusive = upperInclusiveLimit;
    }
     
    @Override
    public Long next() {
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
