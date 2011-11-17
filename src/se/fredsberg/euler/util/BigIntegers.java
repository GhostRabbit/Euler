package se.fredsberg.euler.util;

import java.math.BigInteger;

public class BigIntegers {

    public static int sumDigits(BigInteger number) {
        int sum = 0;
        while (number.compareTo(BigInteger.ZERO) > 0) {
            sum += number.remainder(BigInteger.TEN).intValue();
            number = number.divide(BigInteger.TEN);
        }
        return sum;
    }

    public static BigInteger factor(int f) {
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= f; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

}
