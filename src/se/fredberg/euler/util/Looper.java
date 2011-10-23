package se.fredberg.euler.util;

import se.fredberg.euler.generator.Generator;
import se.fredberg.euler.matcher.Matcher;
import se.fredberg.euler.processor.Processor;

public class Looper<T> implements Runnable {

    private final Generator<T> generator;
    private final Processor<T> processor;
    private final Matcher<T> breakCondition;

    public Looper(Generator<T> generator, Matcher<T> breakCondition, Processor<T> processor) {
        this.generator = generator;
        this.processor = processor;
        this.breakCondition = breakCondition;
    }

    public void run() {
        T next = generator.next();
        while (breakCondition.matches(next)) {
            processor.process(next);
            next = generator.next();
        }
        
    }
}
