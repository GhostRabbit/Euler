package se.fredsberg.euler.series;

public interface Series<T extends Number> {
    void process(T arg);
    Long getResult();
}
