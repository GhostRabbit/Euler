package se.fredsberg.euler.matcher;

import se.fredsberg.euler.matcher.Condition;

public class AlwaysMatcher<T> implements Condition<T> {

    @Override
    public boolean forfilledBy(T arg) {
        return true;
    }

}
