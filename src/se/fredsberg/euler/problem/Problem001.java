package se.fredsberg.euler.problem;

import se.fredsberg.euler.matcher.Condition;
import se.fredsberg.euler.matcher.EvenDivisorCondition;
import se.fredsberg.euler.matcher.AnyCondition;
import se.fredsberg.euler.sequence.FiniteIntegerSequence;
import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.series.ConditionedSeries;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.series.SumSeries;
import se.fredsberg.euler.util.FiniteSeriesCalculator;

public class Problem001 implements Problem {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * 
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */

    @Override
    public long solve() {
        Series<Integer> sumOfMultiples = createSeriesOfMultiples();
        FiniteSequence<Integer> naturalNumbers = new FiniteIntegerSequence(1, 999);
        new FiniteSeriesCalculator<Integer>(naturalNumbers, sumOfMultiples).run();
        return sumOfMultiples.getResult();
    }

    private Series<Integer> createSeriesOfMultiples() {
        Condition<Integer> isMultible = createMutipleOf3Or5Condition();
        Series<Integer> sum = new SumSeries();
        return new ConditionedSeries<Integer>(isMultible, sum);
    }

    private AnyCondition<Integer> createMutipleOf3Or5Condition() {
        return new AnyCondition<Integer>().add(new EvenDivisorCondition(3)).add(new EvenDivisorCondition(5));
    }

}
