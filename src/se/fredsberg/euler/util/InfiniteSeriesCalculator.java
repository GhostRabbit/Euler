package se.fredsberg.euler.util;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.sequence.Sequence;
import se.fredsberg.euler.series.Series;

public class InfiniteSeriesCalculator<T> implements SeriesCalculator {

    private final Sequence<T> sequence;
    private final Series<T> series;
    private final Condition<T> breakCondition;

    public InfiniteSeriesCalculator(Sequence<T> sequence, Condition<T> breakCondition, Series<T> series) {
        this.sequence = sequence;
        this.series = series;
        this.breakCondition = breakCondition;
    }

    @Override
    public void calculateSeries() {
        T next = sequence.next();
        while (breakCondition.forfilledBy(next)) {
            series.process(next);
            next = sequence.next();
        }
    }
}
