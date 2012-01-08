package se.fredsberg.euler.problem;

import java.math.BigInteger;

import se.fredsberg.euler.util.BigIntegers;

public class Problem016 implements Problem {

    /**
     * 2**15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
     * 
     * What is the sum of the digits of the number 2**1000?
     */

    @Override
    public long solve() {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger sum = two.pow(1000);
        return BigIntegers.sumDigits(sum);
    }
}
