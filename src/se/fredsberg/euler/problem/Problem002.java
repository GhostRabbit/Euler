package se.fredsberg.euler.problem;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.condition.EvenCondition;
import se.fredsberg.euler.condition.LessThenCondition;
import se.fredsberg.euler.sequence.FibonacciSequence;
import se.fredsberg.euler.sequence.Sequence;
import se.fredsberg.euler.series.ConditionedSeries;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.series.SumSeries;
import se.fredsberg.euler.util.InfiniteSeriesCalculator;

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
        Sequence<Long> fibonaccies = new FibonacciSequence();
        Series<Long> sumOfEvens = new ConditionedSeries<Long>(new EvenCondition(), new SumSeries());
        Condition<Long> lessThen4million = new LessThenCondition(4000000);
        new InfiniteSeriesCalculator<Long>(fibonaccies, lessThen4million, sumOfEvens).calculateSeries();
        return sumOfEvens.getResult();
    }
}
