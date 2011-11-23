package se.fredsberg.euler.function;

import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.series.ProductSeries;
import se.fredsberg.euler.util.FiniteSequenceCalculator;

public class ProductOverSequenceFunction<T extends Number> implements FunctionOfSequence<T> {

    @Override
    public Long calculate(FiniteSequence<T> sequence) {
        ProductSeries<T> productSeries = new ProductSeries<T>();
        new FiniteSequenceCalculator<T>(sequence, productSeries).calculateSeries();
        return productSeries.getResult();
    }

}
