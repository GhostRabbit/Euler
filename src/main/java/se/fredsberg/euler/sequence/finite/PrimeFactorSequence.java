package se.fredsberg.euler.sequence.finite;

import java.util.NoSuchElementException;

public class PrimeFactorSequence implements FiniteSequence<Long> {

    private Long number;
    private long i;

    public PrimeFactorSequence(Long number) {
        this.number = number;
        this.i = 2;
    }

    @Override
    public Long next() {
        while (hasNext()) {
            if (number % i == 0) {
                number /= i;
                return i;
            }
            i++;
        }
        throw new NoSuchElementException("Factor not found (can not happen)");
    }

    @Override
    public boolean hasNext() {
        return i <= number;
    }

}
