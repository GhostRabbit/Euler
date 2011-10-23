package se.fredberg.euler.matcher;

public class OrMatcher<T> implements Matcher<T> {

    private final Matcher<T> left;
    private final Matcher<T> right;

    public OrMatcher(Matcher<T> left, Matcher<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean matches(T arg) {
        return left.matches(arg) || right.matches(arg);
    }

}
