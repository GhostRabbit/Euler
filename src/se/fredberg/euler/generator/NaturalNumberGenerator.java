package se.fredberg.euler.generator;

public class NaturalNumberGenerator implements Generator<Integer> {

    private int x = 0;
    
    @Override
    public Integer next() {
        return x++;
    }

}
