package se.fredsberg.euler.util;

import java.util.Iterator;

import se.fredsberg.euler.processor.Processor;

public class IteratorLooper<T> implements Runnable {

    private final Iterator<T> iterator;
    private final Processor<T> processor;

    public IteratorLooper(Iterable<T> iterable, Processor<T> processor) {
        this.iterator = iterable.iterator();
        this.processor = processor;
    }

    @Override
    public void run() {
        while (iterator.hasNext()) {
            processor.process(iterator.next());
        }
    }

}
