package se.fredsberg.euler.condition;

public class EvenDivisorCondition implements Condition<Integer> {

    private final int divisor;

    public EvenDivisorCondition(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public boolean forfilledBy(Integer i) {
        return i % divisor == 0;
    }

}
