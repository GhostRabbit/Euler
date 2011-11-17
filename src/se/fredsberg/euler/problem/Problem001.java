package se.fredsberg.euler.problem;

import se.fredsberg.euler.generator.LimitedGenerator;
import se.fredsberg.euler.generator.LimitedNumberGenerator;
import se.fredsberg.euler.matcher.EvenDivisorMatcher;
import se.fredsberg.euler.matcher.Matcher;
import se.fredsberg.euler.matcher.OrMatcher;
import se.fredsberg.euler.processor.ConditionedProcessor;
import se.fredsberg.euler.processor.Processor;
import se.fredsberg.euler.processor.SumProcessor;
import se.fredsberg.euler.util.LimitedGeneratorLooper;

public class Problem001 implements Problem {

    @Override
    public long solve() {
        Processor<Integer> sumOfMultiples = createProcessor();
        LimitedGenerator<Integer> naturalNumbers = new LimitedNumberGenerator(1, 999);
        new LimitedGeneratorLooper<Integer>(naturalNumbers, sumOfMultiples).run();
        return sumOfMultiples.getResult();
    }

    private Processor<Integer> createProcessor() {
        Matcher<Integer> isMultible = createMultipleMatcher();
        Processor<Integer> sum = new SumProcessor();
        return new ConditionedProcessor<Integer>(isMultible, sum);
    }

    private OrMatcher<Integer> createMultipleMatcher() {
        return new OrMatcher<Integer>().add(new EvenDivisorMatcher(3)).add(new EvenDivisorMatcher(5));
    }

}
