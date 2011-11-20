package se.fredsberg.euler.util;

import se.fredsberg.euler.matcher.Condition;
import se.fredsberg.euler.sequence.Sequence;
import se.fredsberg.euler.series.Series;

public class SeriesCalculator<T> implements Runnable {

    private final Sequence<T> sequence;
    private final Series<T> series;
    private final Condition<T> breakCondition;

    public SeriesCalculator(Sequence<T> sequence, Condition<T> breakCondition, Series<T> series) {
        this.sequence = sequence;
        this.series = series;
        this.breakCondition = breakCondition;
    }

    public void run() {
        T next = sequence.next();
        while (breakCondition.forfilledBy(next)) {
            series.process(next);
            next = sequence.next();
        }
    }
}
