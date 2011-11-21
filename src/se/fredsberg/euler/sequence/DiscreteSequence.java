package se.fredsberg.euler.sequence;

public class DiscreteSequence implements Sequence<Long> {

    private long x = 0;
    
    @Override
    public Long next() {
        return x++;
    }

}
