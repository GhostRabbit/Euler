package se.fredsberg.euler.problem;

import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.sequence.PrimeFactorSequence;

public class Problem003 implements Problem {
    
    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * 
     * What is the largest prime factor of the number 600851475143 ?
     */

    @Override
    public long solve() {
        FiniteSequence<Long> sequence = new PrimeFactorSequence(600851475143L);
        long lastFactor;
        do {
            lastFactor = sequence.next();
        } while (sequence.hasNext());
        return lastFactor;
    }

}
