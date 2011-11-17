package se.fredsberg.euler.matcher;

import java.util.LinkedList;

public class OrMatcher<T> implements Matcher<T> {

    private final LinkedList<Matcher<T>> matchers = new LinkedList<Matcher<T>>();
    
    public OrMatcher<T> add(Matcher<T> matcher) {
        matchers.add(matcher);
        return this;
    }

    @Override
    public boolean matches(T arg) {
        for (Matcher<T> m : matchers) {
            if (m.matches(arg)) {
                return true;
            }
        }
        return false;
    }

}
