package se.fredsberg.euler.problem;

import se.fredsberg.euler.condition.AnyCondition;
import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.condition.EvenDivisorCondition;
import se.fredsberg.euler.sequence.FiniteDiscreteSequence;
import se.fredsberg.euler.series.ConditionedSeries;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.series.SumSeries;
import se.fredsberg.euler.util.FiniteSequenceCalculator;

public class Problem001 implements Problem {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * 
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */

    @Override
    public long solve() {
        Series<Long> sumOfMultiples = createSeriesOfMultiples();
        new FiniteSequenceCalculator<Long>(numbersBelow1000(), sumOfMultiples).calculateSeries();
        return sumOfMultiples.getResult();
    }

    private FiniteDiscreteSequence numbersBelow1000() {
        return new FiniteDiscreteSequence(999);
    }

    private Series<Long> createSeriesOfMultiples() {
        Condition<Long> isMultible = createMutipleOf3Or5Condition();
        Series<Long> sum = new SumSeries();
        return new ConditionedSeries<Long>(isMultible, sum);
    }

    private AnyCondition<Long> createMutipleOf3Or5Condition() {
        return new AnyCondition<Long>().add(new EvenDivisorCondition(3L)).add(new EvenDivisorCondition(5L));
    }

}
