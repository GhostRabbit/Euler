package se.fredsberg.euler.util;

import java.util.Iterator;

import se.fredsberg.euler.series.Series;

public class IteratorLooper<T> implements Runnable {

    private final Iterator<T> iterator;
    private final Series<T> processor;

    public IteratorLooper(Iterable<T> iterable, Series<T> processor) {
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
