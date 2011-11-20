package se.fredsberg.euler.matcher;

public class LessThenCondition implements Condition<Integer> {

    private final int limit;

    public LessThenCondition(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean forfilledBy(Integer x) {
        return x < limit;
    }

}
