package se.fredsberg.euler.function;

public class Square implements Function<Long, Long> {

    @Override
    public Long calculate(Long x) {
        return  x * x;
    }

}
