package se.fredsberg.euler.processor;

import se.fredsberg.euler.matcher.Matcher;

public class ConditionedProcessor<T> implements Processor<T> {

    private final Processor<T> processor;
    private final Matcher<T> matcher;

    public ConditionedProcessor(Matcher<T> matcher, Processor<T> processor) {
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
