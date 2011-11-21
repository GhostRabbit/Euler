package se.fredsberg.euler.series;

public class ProductSeries implements Series<Integer> {

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
