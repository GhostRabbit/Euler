package se.fredsberg.euler.function;

public class Square implements Function<Long> {

    @Override
    public Long calculate(Long t) {
        return  t * t;
    }

}
