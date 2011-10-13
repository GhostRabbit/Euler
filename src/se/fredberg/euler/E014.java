package se.fredberg.euler;

import java.util.HashMap;
import java.util.Map;

public class E014 {

    /**
     * The following iterative sequence is defined for the set of positive
     * integers:
     * 
     * <pre>
     * n -> n/2 (n is even)
     * n -> 3n + 1 (n is odd)
     * </pre>
     * 
     * Using the rule above and starting with 13, we generate the following
     * sequence:
     * 
     * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 It can be seen that
     * this sequence (starting at 13 and finishing at 1) contains 10 terms.
     * Although it has not been proved yet (Collatz Problem), it is thought that
     * all starting numbers finish at 1.
     * 
     * Which starting number, under one million, produces the longest chain?
     * 
     * NOTE: Once the chain starts the terms are allowed to go above one
     * million.
     */

    public static void main(String[] args) {
        Map<Integer, Integer> buffer = new HashMap<Integer, Integer>(10000);
        buffer.put(1, 1);
        int max = 0;
        int numberToRemember = 0;
        for (int i = 1; i < 1000000; i++) {
            int count = getStepCount(i, buffer);
            if (max < count) {
                max = count;
                numberToRemember = i;
            }
        }
        System.out.println(numberToRemember);
    }

    private static int getStepCount(long x, Map<Integer, Integer> buffer) {
        if (x == 1) {
            return 1;
        }
        if (x % 2 == 0) {
            return getStepCount(x / 2, buffer) + 1;
        }
        return getStepCount(3 * x + 1, buffer);
    }

}
