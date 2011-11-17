package se.fredsberg.euler.matcher;

import se.fredsberg.euler.matcher.Matcher;

public class NeverMatcher<T> implements Matcher<T> {

    @Override
    public boolean matches(T arg) {
        return false;
    }

}
