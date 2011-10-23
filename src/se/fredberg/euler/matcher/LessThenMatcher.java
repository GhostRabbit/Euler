package se.fredberg.euler.matcher;

public class LessThenMatcher implements Matcher<Integer> {

    private final int limit;

    public LessThenMatcher(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean matches(Integer x) {
        return x < limit;
    }

}
