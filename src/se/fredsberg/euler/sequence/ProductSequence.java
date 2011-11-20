package se.fredsberg.euler.sequence;

import java.util.NoSuchElementException;

public class ProductSequence implements FiniteSequence<Integer> {

    private int upperIncusive;
    private boolean done = false;
    private int a;
    private int b;

    public ProductSequence(int lowerInclusive, int upperInclusive) {
        if (upperInclusive < lowerInclusive) {
            throw new IllegalArgumentException();
        }
        this.upperIncusive = upperInclusive;
        this.a = lowerInclusive;
        this.b = lowerInclusive;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int result = a * b;
        if (b++ == upperIncusive) {
            if (a++ == upperIncusive) {
                done = true;
            } else {
                b = a;
            }
        }
        return result;
    }

    public boolean hasNext() {
        return !done;
    }

}
