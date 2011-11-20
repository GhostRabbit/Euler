package se.fredsberg.euler.function;

import java.util.List;

import se.fredsberg.euler.util.PrimeFactors;

public class DivisorCount implements Function<Integer> {

    @Override
    public Integer calculate(Integer x) {
        List<Integer> factors = PrimeFactors.factorize(x);
        int count = 0;
        int totalCount = 1;
        int lastFactor = 0;
        for (int f : factors) {
            if (lastFactor == f) {
                count++;
            } else {
                totalCount *= (count + 1);
                lastFactor = f;
                count = 1;
            }
        }
        totalCount *= (count + 1);
        return totalCount;
    }

}
