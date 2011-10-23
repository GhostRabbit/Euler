package se.fredberg.euler;

import se.fredberg.euler.fibonnaci.FibonacciGenerator;
import se.fredberg.euler.matcher.EvenMatcher;
import se.fredberg.euler.matcher.Matcher;
import se.fredberg.euler.util.Generator;

public class E002 {
    /*
     * Each new term in the Fibonacci sequence is generated by adding the
     * previous two terms. By starting with 1 and 2, the first 10 terms will be:
     * 
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     * 
     * By considering the terms in the Fibonacci sequence whose values do not
     * exceed four million, find the sum of the even-valued terms.
     * 
     * (Answer is 4613732)
     */

    public static void main(String[] args) {
        Generator<Integer> generator = new FibonacciGenerator();
        Matcher<Integer> matcher = new EvenMatcher();
        int next = generator.next();
        long sum = 0L;
        while (next < 4000000) {
            if (matcher.matches(next)) {
                sum += next;
            }
            next = generator.next();
        }
        System.out.println(sum);
    }
}
