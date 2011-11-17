package se.fredsberg.euler.generator;

public class IncrementedNumberGenerator implements Generator<Integer> {

    private int x = 0;
    private final int increment;
    
    public IncrementedNumberGenerator(int increment) {
        this.increment = increment;
    }
    
    @Override
    public Integer next() {
        return x += increment;
    }

}
