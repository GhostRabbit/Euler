package se.fredberg.euler.util;

public interface Processor<T> {
    void process(T arg);
    T getResult();
}
