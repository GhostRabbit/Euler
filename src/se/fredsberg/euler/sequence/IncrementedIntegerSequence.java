package se.fredsberg.euler.sequence;

public class IncrementedIntegerSequence implements Sequence<Integer> {

    private int x = 0;
    private final int increment;
    
    public IncrementedIntegerSequence(int increment) {
        this.increment = increment;
    }
    
    @Override
    public Integer next() {
        return x += increment;
    }

}
