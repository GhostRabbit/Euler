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
        long t = System.currentTimeMillis();
        Map<Integer, Integer> buffer = new HashMap<Integer, Integer>(10000);
        buffer.put(1, 1);
        int max = 0;
        int numberToRemember = 0;
        for (int i = 1; i < 1000000; i++) {
            try {
                int count = getStepCount(i, buffer);
                if (max < count) {
                    max = count;
                    numberToRemember = i;
                }
            } catch (StackOverflowError e) {
                System.out.println("Error at " + i);
                System.out.println("size : " + buffer.size());
                break;
            }
        }
        System.out.println(numberToRemember);
        System.out.println(System.currentTimeMillis() - t + " ms");
    }

    private static int getStepCount(int x, Map<Integer, Integer> buffer) {
//        Integer value = buffer.get(x);
//        if (value == null) {
//            if (x % 2 == 0) {
//                value = getStepCount(x / 2, buffer) + 1;
//            } else {
//                value = getStepCount(3 * x + 1, buffer) + 1;
//            }
//            buffer.put(x, value);
//        }
//        return value;
        if (x == 1) { return 1;}
        return (x % 2 == 0) ? getStepCount(x / 2, buffer) + 1 : getStepCount(3 * x + 1, buffer);
    }

}
