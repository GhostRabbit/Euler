package se.fredberg.euler;

import se.fredberg.euler.generator.Generator;
import se.fredberg.euler.generator.NaturalNumberGenerator;
import se.fredberg.euler.matcher.DivisorMatcher;
import se.fredberg.euler.matcher.LessThenMatcher;
import se.fredberg.euler.matcher.Matcher;
import se.fredberg.euler.matcher.OrMatcher;
import se.fredberg.euler.processor.ConditionedProcessor;
import se.fredberg.euler.processor.Processor;
import se.fredberg.euler.processor.SumProcessor;
import se.fredberg.euler.util.GeneratorLooper;

public class E001 {
    /*
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * 
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */
    public static void main(String[] args) {
        Processor<Integer> sumOfDevisableNumbers = createProcessor();
        Generator<Integer> naturalNumbers = new NaturalNumberGenerator();
        Matcher<Integer> lessThen1000 = new LessThenMatcher(1000);
        new GeneratorLooper<Integer>(naturalNumbers, lessThen1000, sumOfDevisableNumbers).run();
        System.out.println(sumOfDevisableNumbers.getResult());
    }

    private static Processor<Integer> createProcessor() {
        Matcher<Integer> divisors = new OrMatcher<Integer>(new DivisorMatcher(3), new DivisorMatcher(5));
        Processor<Integer> sum = new SumProcessor();
        return new ConditionedProcessor<Integer>(divisors, sum);
    }
}
