package se.fredsberg.euler.util;

import se.fredsberg.euler.generator.LimitedGenerator;
import se.fredsberg.euler.processor.Processor;

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
