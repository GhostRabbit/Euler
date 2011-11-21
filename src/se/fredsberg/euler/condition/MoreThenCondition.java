package se.fredsberg.euler.condition;

public class MoreThenCondition implements Condition<Long> {

    private final int limit;

    public MoreThenCondition(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean forfilledBy(Long x) {
        return x > limit;
    }

}
