package se.fredsberg.euler.series;

import se.fredsberg.euler.condition.Condition;

public class ConditionedSeries<T> implements Series<T> {

    private final Series<T> series;
    private final Condition<T> condition;

    public ConditionedSeries(Condition<T> condition, Series<T> series) {
        this.series = series;
        this.condition = condition;
    }

    @Override
    public void process(T arg) {
        if (condition.forfilledBy(arg)) {
            series.process(arg);
        }
    }

    @Override
    public T getResult() {
        return series.getResult();
    }

}
