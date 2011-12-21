package se.fredsberg.euler.series;

import se.fredsberg.euler.function.Function;

public class SumSeries extends SumOverFunctionSeries {

    public SumSeries() {
        super(new Function<Long, Long>() {

            @Override
            public Long calculate(Long x) {
                return x;
            }
        });
    }
}
