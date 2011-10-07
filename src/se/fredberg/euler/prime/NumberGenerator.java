package se.fredberg.euler.prime;

public class NumberGenerator implements Generator {

    private int count;

    public NumberGenerator(int start) {
        this.count = start;
    }

    @Override
    public int next() {
        return count++;
    }

}
