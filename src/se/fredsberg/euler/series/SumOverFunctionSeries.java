package se.fredsberg.euler.series;

import se.fredsberg.euler.function.Function;


public class SumOverFunctionSeries implements Series<Long> {

    protected Long sum = 0L;
    private final Function<Long> function;
    
    public SumOverFunctionSeries(Function<Long> function) {
        this.function = function;
    }

    @Override
    public void process(Long i) {
        sum += function.calculate(i);
    }

    @Override
    public Long getResult() {
        return sum;
    }
    
}
