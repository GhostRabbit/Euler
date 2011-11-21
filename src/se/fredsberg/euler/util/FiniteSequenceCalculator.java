package se.fredsberg.euler.util;

import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.series.Series;

public class FiniteSequenceCalculator<T> {

    private final FiniteSequence<T> sequence;
    private final Series<T> series;

    public FiniteSequenceCalculator(FiniteSequence<T> sequence, Series<T> series) {
        this.sequence = sequence;
        this.series = series;
    }
    
    public void run() {
        while (sequence.hasNext()) {
            series.process(sequence.next());
        }
    }
}
