package se.fredsberg.euler.matcher;

public class EvenMatcher implements Matcher<Integer> {

    @Override
    public boolean matches(Integer i) {
        return i % 2 == 0;
    }
}
