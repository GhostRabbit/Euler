package se.fredsberg.euler.series;

import se.fredsberg.euler.function.Function;


public class SumOverFunctionSeries implements Series<Integer> {

    protected Integer sum = 0;
    private final Function<Integer> function;
    
    public SumOverFunctionSeries(Function<Integer> function) {
        this.function = function;
    }

    @Override
    public void process(Integer i) {
        sum += function.calculate(i);
    }

    @Override
    public Integer getResult() {
        return sum;
    }
    
}
