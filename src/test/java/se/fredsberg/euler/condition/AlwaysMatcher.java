package se.fredsberg.euler.condition;

public class AlwaysMatcher<T> implements Condition<T> {

    @Override
    public boolean forfilledBy(T arg) {
        return true;
    }

}
