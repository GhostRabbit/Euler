package se.fredsberg.euler.problem;

import se.fredsberg.euler.function.Square;
import se.fredsberg.euler.sequence.FiniteIntegerSequence;
import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.series.SumOverFunctionSeries;
import se.fredsberg.euler.series.SumSeries;
import se.fredsberg.euler.util.FiniteSeriesCalculator;


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
        int x = 100;
        long a = sumOfSquares(1, x);
        long b = squareOfSum(1, x);
        return b - a;
    }
    
    long sumOfSquares(int from, int to) {
        FiniteSequence<Integer> generator = new FiniteIntegerSequence(from, to);
        Series<Integer> series = new SumOverFunctionSeries(new Square());
        FiniteSeriesCalculator<Integer> looper = new FiniteSeriesCalculator<Integer>(generator, series);
        looper.run();
        return series.getResult();
    }

    long squareOfSum(int from, int to) {
        long sum = sumOf(from, to);
        return sum * sum;
    }
    
    private long sumOf(int from, int to) {
        FiniteSequence<Integer> generator = new FiniteIntegerSequence(from, to);
        Series<Integer> series = new SumSeries();
        new FiniteSeriesCalculator<Integer>(generator, series).run();
        return series.getResult();
    }
}
