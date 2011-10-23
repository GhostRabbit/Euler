package se.fredberg.euler.util;

import se.fredberg.euler.matcher.Matcher;

public class ConditionedProcessor<T> implements Processor<T> {

    private final Processor<T> processor;
    private final Matcher<T> matcher;

    public ConditionedProcessor(Processor<T> processor, Matcher<T> matcher) {
        this.processor = processor;
        this.matcher = matcher;
    }

    @Override
    public void process(T arg) {
        if (matcher.matches(arg)) {
            processor.process(arg);
        }
    }

    @Override
    public T getResult() {
        return processor.getResult();
    }

}
