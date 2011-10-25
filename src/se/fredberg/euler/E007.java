package se.fredberg.euler;

import se.fredberg.euler.prime.Primes;

public class E007 {

    /**
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
     * see that the 6th prime is 13.
     * 
     * What is the 10 001st prime number?
     */

    public static void main(String[] args) {
        System.out.println(Primes.getPrimeNumber(10001));
    }

}
