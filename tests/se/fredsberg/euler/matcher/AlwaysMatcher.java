package se.fredsberg.euler.matcher;

import se.fredsberg.euler.condition.Condition;

public class AlwaysMatcher<T> implements Condition<T> {

    @Override
    public boolean forfilledBy(T arg) {
        return true;
    }

}
