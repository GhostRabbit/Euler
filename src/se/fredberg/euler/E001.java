package se.fredberg.euler;

import se.fredberg.euler.util.DivisorCheckedSum;
import se.fredberg.euler.util.Processor;

public class E001 {
    /*
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * 
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */
    public static void main(String[] args) {
        Processor<Integer> processor = new DivisorCheckedSum(3, 5);
        for (int i = 1; i < 1000; i++) {
            processor.process(i);
        }
        System.out.println(processor.getResult());
    }
}
