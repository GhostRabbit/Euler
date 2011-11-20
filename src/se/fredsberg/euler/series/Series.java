package se.fredsberg.euler.series;

public interface Series<T> {
    void process(T arg);
    T getResult();
}
