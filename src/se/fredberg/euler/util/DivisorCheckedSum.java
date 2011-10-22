package se.fredberg.euler.util;

public class DivisorCheckedSum implements Processor<Integer> {

    private int sum = 0;
    private final int[] divisors;

    public DivisorCheckedSum(int ... divisors) {
        this.divisors = divisors;
    }
    
    @Override
    public void process(Integer i) {
        for (int divisor : divisors) {
            if (i % divisor == 0) {
                sum += i;
                break;
            }
        }
    }

    @Override
    public Integer getResult() {
        return sum;
    }

}
