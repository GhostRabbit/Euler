package se.fredberg.euler.generator;

public interface LimitedGenerator<T> extends Generator<T> {

    T next();

    boolean hasNext();

}
