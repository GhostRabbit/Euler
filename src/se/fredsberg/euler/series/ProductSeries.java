package se.fredsberg.euler.series;

public class ProductSeries implements Series<Long> {

    Long product = 1L;

    @Override
    public void process(Long i) {
        product *= i;
    }

    @Override
    public Long getResult() {
        return product;
    }
    
}
