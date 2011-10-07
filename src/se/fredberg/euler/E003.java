package se.fredberg.euler;

import java.util.List;

import se.fredberg.euler.util.PrimeFactors;

public class E003 {
    /*
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * 
     * What is the largest prime factor of the number 600851475143 ?
     */

    public static void main(String[] args) {
        List<Integer> primeFactors = PrimeFactors.factorize(600851475143L);
        System.out.println(primeFactors.get(primeFactors.size() - 1));
    }

}
