package se.fredsberg.euler.function;

public class Square implements Function<Integer> {

    @Override
    public Integer calculate(Integer t) {
        return  t * t;
    }

}
