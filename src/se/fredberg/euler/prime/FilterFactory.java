package se.fredberg.euler.prime;

public class FilterFactory {
    public Generator createFilter(int prime, Generator generator) {
        return new FilteredGenerator(prime, generator);
    }
}
