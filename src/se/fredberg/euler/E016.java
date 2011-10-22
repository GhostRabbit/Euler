package se.fredberg.euler;

import java.math.BigInteger;

import se.fredberg.euler.util.BigIntegers;

public class E016 {

    /**
     * 2**15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
     * 
     * What is the sum of the digits of the number 2**1000?
     */

    public static void main(String[] args) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger sum = two.pow(1000);
        System.out.println(BigIntegers.sumDigits(sum));
    }

}
