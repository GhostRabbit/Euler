package se.fredberg.euler;

import se.fredberg.euler.generator.LimitedGenerator;
import se.fredberg.euler.generator.LimitedNumberGenerator;
import se.fredberg.euler.matcher.EvenDivisorMatcher;
import se.fredberg.euler.matcher.Matcher;
import se.fredberg.euler.matcher.OrMatcher;
import se.fredberg.euler.processor.ConditionedProcessor;
import se.fredberg.euler.processor.Processor;
import se.fredberg.euler.processor.SumProcessor;
import se.fredberg.euler.util.LimitedGeneratorLooper;

public class E001 {
    
    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * 
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */
    
    public static void main(String[] args) {
        Processor<Integer> sumOfMultiples = createProcessor();
        LimitedGenerator<Integer> naturalNumbers = new LimitedNumberGenerator(1, 999);
        new LimitedGeneratorLooper<Integer>(naturalNumbers, sumOfMultiples).run();
        System.out.println(sumOfMultiples.getResult());
    }

    private static Processor<Integer> createProcessor() {
        Matcher<Integer> isMultible = new OrMatcher<Integer>(new EvenDivisorMatcher(3), new EvenDivisorMatcher(5));
        Processor<Integer> sum = new SumProcessor();
        return new ConditionedProcessor<Integer>(isMultible, sum);
    }
}
