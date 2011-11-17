package se.fredsberg.euler.processor;

public interface Processor<T> {
    void process(T arg);
    T getResult();
}
