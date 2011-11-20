package se.fredsberg.euler.matcher;

public class EvenCondition implements Condition<Integer> {

    @Override
    public boolean forfilledBy(Integer i) {
        return i % 2 == 0;
    }
}
