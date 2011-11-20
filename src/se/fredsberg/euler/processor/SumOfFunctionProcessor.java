package se.fredsberg.euler.processor;

import se.fredsberg.euler.function.Function;


public class SumOfFunctionProcessor implements Processor<Integer> {

    Integer sum = 0;
    private final Function<Integer> function;
    
    public SumOfFunctionProcessor(Function<Integer> function) {
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
