package se.fredsberg.euler.processor;

import se.fredsberg.euler.function.Function;


public class SumProcessor extends SumOfFunctionProcessor{

    public SumProcessor() {
        super(new Function<Integer>() {

            @Override
            public Integer calculate(Integer t) {
                return t;
            }
        });
    }
}
