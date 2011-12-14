package se.fredsberg.euler.function;

import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.sequence.PrimeFactorSequence;

public class DivisorCount implements Function<Long> {

    @Override
    public Long calculate(Long x) {
        FiniteSequence<Long> sequence = new PrimeFactorSequence(x);
        int count = 0;
        long totalCount = 1;
        long lastFactor = 0;
        while (sequence.hasNext()) {
            long primeFactor = sequence.next();
            if (lastFactor == primeFactor) {
                count++;
            } else {
                totalCount *= (count + 1);
                lastFactor = primeFactor;
                count = 1;
            }
        }
        totalCount *= (count + 1);
        return totalCount;
    }

}
