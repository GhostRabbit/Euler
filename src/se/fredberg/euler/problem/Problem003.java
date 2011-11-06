package se.fredberg.euler.problem;

import java.util.List;

import se.fredberg.euler.util.PrimeFactors;

public class Problem003 implements Problem {
    
    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * 
     * What is the largest prime factor of the number 600851475143 ?
     */

    @Override
    public long solve() {
        List<Integer> primeFactors = PrimeFactors.factorize(600851475143L);
        Integer largestPrimeFactor = primeFactors.get(primeFactors.size() - 1);
        return largestPrimeFactor;
    }

}
