package se.fredsberg.euler.series;

public class MaxValueFoundInSequence<T extends Number> implements Series<T> {

    private long max = Long.MIN_VALUE; 
    
    @Override
    public void process(T x) {
        max = Math.max(max, x.longValue());
    }

    @Override
    public Long getResult() {
        return max;
    }

}
