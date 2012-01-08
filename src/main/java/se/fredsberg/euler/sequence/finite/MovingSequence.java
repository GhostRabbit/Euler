package se.fredsberg.euler.sequence.finite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import se.fredsberg.euler.sequence.Sequence;

public class MovingSequence<T> implements FiniteSequence<Sequence<T>> {

    private final FiniteSequence<T> source;
    private final int length;
    private LinkedList<T> sequence = new LinkedList<T>();
    
    public MovingSequence(FiniteSequence<T> sequence, int length) {
        this.source = sequence;
        this.length = length;
        firstFill();
    }

    private void firstFill() {
        for (int i = 0; i < length; i++) {
            if (!source.hasNext()) {
                sequence = null;
                break;
            }
            sequence.add(source.next());
        }
    }

    @Override
    public boolean hasNext() {
        return sequence != null;
    }

    public FiniteSequence<T> next() { 
        List<T> toReturn = new ArrayList<T>(sequence);
        updateSequence();
        return new ListSequence<T>(toReturn);
    }

    private void updateSequence() {
        if (source.hasNext()) {
            sequence.removeFirst();
            sequence.add(source.next());
        } else {
            sequence = null;
        }
    }
    
}
