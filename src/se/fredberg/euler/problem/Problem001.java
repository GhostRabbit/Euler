package se.fredberg.euler.problem;

import se.fredberg.euler.generator.LimitedGenerator;
import se.fredberg.euler.generator.LimitedNumberGenerator;
import se.fredberg.euler.matcher.EvenDivisorMatcher;
import se.fredberg.euler.matcher.Matcher;
import se.fredberg.euler.matcher.OrMatcher;
import se.fredberg.euler.processor.ConditionedProcessor;
import se.fredberg.euler.processor.Processor;
import se.fredberg.euler.processor.SumProcessor;
import se.fredberg.euler.util.LimitedGeneratorLooper;

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
