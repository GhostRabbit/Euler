package se.fredsberg.euler.problem;

import se.fredsberg.euler.function.Square;
import se.fredsberg.euler.sequence.DiscreteSequence;
import se.fredsberg.euler.sequence.finite.ClosedSequence;
import se.fredsberg.euler.sequence.finite.FiniteSequence;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.series.SumOverFunctionSeries;
import se.fredsberg.euler.series.SumSeries;
import se.fredsberg.euler.util.FiniteSequenceCalculator;


public class Problem006 implements Problem {

    /**
     * The sum of the squares of the first ten natural numbers is,
     * 
     * 1***2 + 2**2 + ... + 10**2 = 385 The square of the sum of the first ten
     * natural numbers is,
     * 
     * (1 + 2 + ... + 10)**2 = 552 = 3025 Hence the difference between the sum
     * of the squares of the first ten natural numbers and the square of the sum
     * is 3025-385 = 2640.
     * 
     * Find the difference between the sum of the squares of the first one
     * hundred natural numbers and the square of the sum.
     */

    @Override
    public long solve() {
        return Math.abs(sumOfSquares() - squareOfSum());
    }

    private long sumOfSquares() {
        return calculateSeries(new SumOverFunctionSeries(new Square()));
    }

    private long squareOfSum() {
        long sum = calculateSeries(new SumSeries());
        return sum * sum;
    }

    private long calculateSeries(Series<Long> series) {
        new FiniteSequenceCalculator<Long>(first100Numbers(), series).calculateSeries();
        return series.getResult();
    }

    private FiniteSequence<Long> first100Numbers() {
        return new ClosedSequence<Long>(100 + 1, new DiscreteSequence());
    }
}
