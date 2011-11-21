package se.fredsberg.euler.series;

import se.fredsberg.euler.function.Function;

public class SumSeries extends SumOverFunctionSeries {

    public SumSeries() {
        super(new Function<Long>() {

            @Override
            public Long calculate(Long t) {
                return t;
            }
        });
    }
}
