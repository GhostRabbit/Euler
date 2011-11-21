package se.fredsberg.euler.condition;

public class LessThenCondition implements Condition<Long> {

    private final long limit;

    public LessThenCondition(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean forfilledBy(Long x) {
        return x < limit;
    }

}
