package se.fredsberg.euler.problem;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.sequence.ListSequence;
import se.fredsberg.euler.sequence.PrimeFactorSequence;
import se.fredsberg.euler.series.ProductSeries;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.util.FiniteSequenceCalculator;

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
        List<Long> primeFactors = getAllPrimeFactorsUpTo(20);
        Series<Long> series = new ProductSeries<Long>();
        FiniteSequenceCalculator<Long> looper = new FiniteSequenceCalculator<Long>(new ListSequence<Long>(primeFactors), series);
        looper.calculateSeries();
        // Answer = 2 * 2 * 2 * 2 * 3 * 3 * 5 * 7 * 11 * 13 * 17 * 19
        return series.getResult();
    }

    private List<Long> getAllPrimeFactorsUpTo(int upperInclusiveLimit) {
        List<Long> result = new LinkedList<Long>();
        for (long i = 2; i <= upperInclusiveLimit; i++) {
            result.addAll(notIn(new PrimeFactorSequence(i), result));
        }
        return result;
    }

    private Collection<? extends Long> notIn(FiniteSequence<Long> factors, List<Long> result) {
        List<Long> copy = new LinkedList<Long>(result);
        List<Long> toAdd = new LinkedList<Long>();
        while (factors.hasNext()) {
            Long x = factors.next();
            if (!copy.remove(x)) {
                toAdd.add(x);
            }
        }
        return toAdd;
    }
}
