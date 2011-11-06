package se.fredberg.euler.problem;

import se.fredberg.euler.prime.Primes;

public class Problem007 implements Problem {

    /**
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
     * see that the 6th prime is 13.
     * 
     * What is the 10 001st prime number?
     */

    @Override
    public long solve() {
        return Primes.getPrimeNumber(10001);
    }
}
