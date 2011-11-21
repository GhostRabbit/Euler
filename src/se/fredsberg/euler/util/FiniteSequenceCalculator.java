package se.fredsberg.euler.util;

import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.series.Series;

public class FiniteSequenceCalculator<T> implements SeriesCalculator {

    private final FiniteSequence<T> sequence;
    private final Series<T> series;

    public FiniteSequenceCalculator(FiniteSequence<T> sequence, Series<T> series) {
        this.sequence = sequence;
        this.series = series;
    }
    
    @Override
    public void calculateSeries() {
        while (sequence.hasNext()) {
            series.process(sequence.next());
        }
    }
}
