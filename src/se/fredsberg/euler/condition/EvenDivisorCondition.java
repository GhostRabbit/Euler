package se.fredsberg.euler.condition;

public class EvenDivisorCondition implements Condition<Long> {

    private final long divisor;

    public EvenDivisorCondition(long divisor) {
        this.divisor = divisor;
    }

    @Override
    public boolean forfilledBy(Long i) {
        return i % divisor == 0;
    }

}
