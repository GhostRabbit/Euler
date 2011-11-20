package se.fredsberg.euler.matcher;

public interface Condition<T> {

    boolean forfilledBy(T arg);
}
