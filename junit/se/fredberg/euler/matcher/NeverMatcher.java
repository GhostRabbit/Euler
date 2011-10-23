package se.fredberg.euler.matcher;

import se.fredberg.euler.matcher.Matcher;

public class NeverMatcher<T> implements Matcher<T> {

    @Override
    public boolean matches(T arg) {
        return false;
    }

}
