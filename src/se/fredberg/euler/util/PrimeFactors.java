package se.fredberg.euler.util;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> factorize(long number) {
        List<Integer> factors = new ArrayList<Integer>();
        number = extractFactors(number, factors, 2);
        int until = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < until; i += 2) {
            number = extractFactors(number, factors, i);
        }
        return factors;
    }

    private static long extractFactors(long number, List<Integer> factors, int divisor) {
        while (number % divisor == 0) {
            factors.add(divisor);
            number /= divisor;
        }
        return number;
    }
}
