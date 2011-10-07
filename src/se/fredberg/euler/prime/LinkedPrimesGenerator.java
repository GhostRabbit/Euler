package se.fredberg.euler.prime;

public class LinkedPrimesGenerator implements Generator {

    private Generator generator;
    private final FilterFactory factory;

    public LinkedPrimesGenerator(Generator generator) {
        this(generator, new FilterFactory());
    }
    
    LinkedPrimesGenerator(Generator generator, FilterFactory factory) {
        this.generator = generator;
        this.factory = factory;
    }

    @Override
    public int next() {
        int prime = generator.next();
        generator = factory.createFilter(prime, generator);
        return prime;
    }

}
