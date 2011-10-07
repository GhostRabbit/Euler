package se.fredberg.euler.prime;

public class FilteredGenerator implements Generator {

    private final int divisor;
    private final Generator generator;

    public FilteredGenerator(int divisor, Generator generator) {
        this.divisor = divisor;
        this.generator = generator;
    }

    @Override
    public int next() {
        int next = generator.next();
//        return next % divisor == 0 ? generator.next() : next;
        if (next % divisor == 0) {
            return generator.next();
        }
        return next;
    }

}
