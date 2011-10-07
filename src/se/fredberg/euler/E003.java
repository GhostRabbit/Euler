package se.fredberg.euler;

import java.util.ArrayList;
import java.util.List;

public class E003 {
    /*
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * 
     * What is the largest prime factor of the number 600851475143 ?
     */
    
    public static void main(String[] args) {
        List<Integer> primeFactors = primeFactorsOf(600851475143L);
        System.out.println(primeFactors.get(primeFactors.size() -1));
    }

    public static List<Integer> primeFactorsOf(long l) {
        List<Integer> factors = new ArrayList<Integer>();
        l = extractFactors(l, factors, 2);
        int until = (int) Math.sqrt(l) + 1;
        for (int i = 3; i < until; i+=2) {
            l = extractFactors(l, factors, i);
        }
        return factors;
    }

    private static long extractFactors(long l, List<Integer> factors, int divisor) {
        while (l % divisor == 0) {
            factors.add(divisor);
            l /= divisor;
        }
        return l;
    }
}
