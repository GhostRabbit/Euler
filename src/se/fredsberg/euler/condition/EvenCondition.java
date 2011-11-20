package se.fredsberg.euler.condition;

public class EvenCondition implements Condition<Integer> {

    @Override
    public boolean forfilledBy(Integer i) {
        return i % 2 == 0;
    }
}
