package se.fredberg.euler.util;

import se.fredberg.euler.generator.LimitedGenerator;
import se.fredberg.euler.processor.Processor;

public class LimitedGeneratorLooper<T> {

    private final LimitedGenerator<T> generator;
    private final Processor<T> processor;

    public LimitedGeneratorLooper(LimitedGenerator<T> generator, Processor<T> processor) {
        this.generator = generator;
        this.processor = processor;
    }
    
    public void run() {
        while (generator.hasNext()) {
            processor.process(generator.next());
        }
    }
}
