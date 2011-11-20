package se.fredsberg.euler.condition;

import se.fredsberg.euler.condition.Condition;

public class AlwaysMatcher<T> implements Condition<T> {

    @Override
    public boolean forfilledBy(T arg) {
        return true;
    }

}
