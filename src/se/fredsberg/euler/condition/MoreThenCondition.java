package se.fredsberg.euler.condition;

public class MoreThenCondition implements Condition<Integer> {

    private final int limit;

    public MoreThenCondition(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean forfilledBy(Integer x) {
        return x > limit;
    }

}
