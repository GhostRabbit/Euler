package se.fredsberg.euler.matcher;

import se.fredsberg.euler.matcher.Condition;

public class NeverMatcher<T> implements Condition<T> {

    @Override
    public boolean forfilledBy(T arg) {
        return false;
    }

}
