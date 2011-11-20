package se.fredsberg.euler.sequence;

public class IntegerSequence implements Sequence<Integer> {

    private int x = 0;
    
    @Override
    public Integer next() {
        return x++;
    }

}
