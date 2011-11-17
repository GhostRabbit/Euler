package se.fredsberg.euler;

import java.math.BigInteger;

import se.fredsberg.euler.util.BigIntegers;

public class E020 {

    /**
     * n! means n * (n - 1) * ... * 3 * 2 * 1
     * 
     * For example, 10! = 10 * 9 * ... * 3 * 2 * 1 = 3628800, and the sum of the
     * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
     * 
     * Find the sum of the digits in the number 100!
     */
    
    public static void main(String[] args) {
        BigInteger sum = BigIntegers.factor(100);
        System.out.println(BigIntegers.sumDigits(sum));
    }
}
