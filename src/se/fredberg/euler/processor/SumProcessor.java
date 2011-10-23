package se.fredberg.euler.processor;


public class SumProcessor implements Processor<Integer> {

    Integer sum = 0;

    @Override
    public void process(Integer i) {
        sum += i;
    }

    @Override
    public Integer getResult() {
        return sum;
    }
    
}
