package se.fredberg.euler.matcher;

public class DivisorMatcher implements Matcher<Integer> {

    private final int divisor;

    public DivisorMatcher(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public boolean matches(Integer i) {
        return i % divisor == 0;
    }

}
