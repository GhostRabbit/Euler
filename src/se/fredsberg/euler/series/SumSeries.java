package se.fredsberg.euler.series;

import se.fredsberg.euler.function.Function;


public class SumSeries extends SumOverFunctionSeries{

    public SumSeries() {
        super(new Function<Integer>() {

            @Override
            public Integer calculate(Integer t) {
                return t;
            }
        });
    }
}
