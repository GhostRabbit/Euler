package se.fredsberg.euler.sequence.finite;

import java.util.NoSuchElementException;

public class IntFromStringSequence implements FiniteSequence<Integer> {

    int index = 0;
    private byte[] bytes;
    
    public IntFromStringSequence(String string) {
        bytes = string.getBytes();
    }

    @Override
    public Integer next() {
        if (! hasNext()) {
            throw new NoSuchElementException();
        }
        return bytes[index++] - '0';
    }

    @Override
    public boolean hasNext() {
        return index < bytes.length;
    }

}
