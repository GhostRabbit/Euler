package se.fredsberg.euler.processor;


public class ProductProcessor implements Processor<Integer> {

    Integer product = 1;

    @Override
    public void process(Integer i) {
        product *= i;
    }

    @Override
    public Integer getResult() {
        return product;
    }
    
}
