package se.fredsberg.euler.matcher;

public class EvenDivisorMatcher implements Matcher<Integer> {

    private final int divisor;

    public EvenDivisorMatcher(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public boolean matches(Integer i) {
        return i % divisor == 0;
    }

}
