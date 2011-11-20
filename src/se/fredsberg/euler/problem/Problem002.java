package se.fredsberg.euler.problem;

import se.fredsberg.euler.matcher.EvenCondition;
import se.fredsberg.euler.matcher.LessThenCondition;
import se.fredsberg.euler.matcher.Condition;
import se.fredsberg.euler.sequence.FibonacciSequence;
import se.fredsberg.euler.sequence.Sequence;
import se.fredsberg.euler.series.ConditionedSeries;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.series.SumSeries;
import se.fredsberg.euler.util.SeriesCalculator;

public class Problem002 implements Problem {
    
    /**
     * Each new term in the Fibonacci sequence is generated by adding the
     * previous two terms. By starting with 1 and 2, the first 10 terms will be:
     * 
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     * 
     * By considering the terms in the Fibonacci sequence whose values do not
     * exceed four million, find the sum of the even-valued terms.
     */

    @Override
    public long solve() {
        Sequence<Integer> fibonaccies = new FibonacciSequence();
        Series<Integer> sumOfEvens = new ConditionedSeries<Integer>(new EvenCondition(), new SumSeries());
        Condition<Integer> lessThen4million = new LessThenCondition(4000000);
        new SeriesCalculator<Integer>(fibonaccies, lessThen4million, sumOfEvens).run();
        return sumOfEvens.getResult();
    }
}
