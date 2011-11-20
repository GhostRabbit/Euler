package se.fredsberg.euler.sequence;

import java.util.Iterator;
import java.util.List;

public class ListSequence<T> implements FiniteSequence<T> {

    private Iterator<T> iterator;

    public ListSequence(List<T> list) {
        iterator = list.iterator();
    }

    @Override
    public T next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

}
