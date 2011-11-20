package se.fredsberg.euler.problem;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.series.ProductProcessor;
import se.fredsberg.euler.util.IteratorLooper;
import se.fredsberg.euler.util.PrimeFactors;

public class Problem005 implements Problem {

    /**
     * 2520 is the smallest number that can be divided by each of the numbers
     * from 1 to 10 without any remainder.
     * 
     * What is the smallest positive number that is evenly divisible by all of
     * the numbers from 1 to 20?
     */

    @Override
    public long solve() {
        List<Integer> primeFactors = getPrimeFactorsUpTo(20);
        Series<Integer> processor = new ProductProcessor();
        IteratorLooper<Integer> looper = new IteratorLooper<Integer>(primeFactors, processor);
        looper.run();
        // Answer = 2 * 2 * 2 * 2 * 3 * 3 * 5 * 7 * 11 * 13 * 17 * 19
        return processor.getResult();
    }

    private List<Integer> getPrimeFactorsUpTo(int upperInclusiveLimit) {
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 2; i <= upperInclusiveLimit; i++) {
            List<Integer> factors = PrimeFactors.factorize(i);
            result.addAll(notIn(factors, result));
        }
        return result;
    }

    private Collection<? extends Integer> notIn(List<Integer> factors, List<Integer> result) {
        List<Integer> copy = new LinkedList<Integer>(result);
        List<Integer> toAdd = new LinkedList<Integer>();
        for (Integer x : factors) {
            if (!copy.remove(x)) {
                toAdd.add(x);
            }
        }
        return toAdd;
    }
}
