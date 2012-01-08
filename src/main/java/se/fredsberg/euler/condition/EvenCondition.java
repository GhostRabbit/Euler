package se.fredsberg.euler.condition;

public class EvenCondition implements Condition<Long> {

    @Override
    public boolean forfilledBy(Long i) {
        return i % 2 == 0;
    }
}
