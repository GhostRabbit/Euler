package se.fredberg.euler.processor;

public interface Processor<T> {
    void process(T arg);
    T getResult();
}
