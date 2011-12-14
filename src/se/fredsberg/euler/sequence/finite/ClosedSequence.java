package se.fredsberg.euler.sequence.finite;

import java.util.NoSuchElementException;

import se.fredsberg.euler.sequence.Sequence;

public class ClosedSequence<T> implements FiniteSequence<T> {

    private int count;
    private final int limit;
    private final Sequence<T> wrappedSequence;

    public ClosedSequence(int limit, Sequence<T> wrappedSequence) {
        this.count = 0;
        this.limit = limit;
        this.wrappedSequence = wrappedSequence;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        count++;
        return wrappedSequence.next();
    }

    @Override
    public boolean hasNext() {
        return count < limit;
    }

}
