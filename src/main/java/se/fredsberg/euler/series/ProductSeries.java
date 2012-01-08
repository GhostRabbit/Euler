package se.fredsberg.euler.series;

public class ProductSeries <T extends Number> implements Series<T> {

    Long product = 1L;

    @Override
    public void process(T i) {
        product *= i.longValue();
    }

    @Override
    public Long getResult() {
        return product;
    }

}
