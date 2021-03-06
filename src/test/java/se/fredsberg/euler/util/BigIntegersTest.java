package se.fredsberg.euler.util;

import static org.fest.assertions.Assertions.*;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegersTest {

    @Test
    public void sumOfDigits() {
        assertThat(BigIntegers.sumDigits(new BigInteger("123"))).isEqualTo(6);
    }

    @Test
    public void factorial() {
        assertThat(BigIntegers.factorial(1)).isEqualTo(new BigInteger("1"));
        assertThat(BigIntegers.factorial(3)).isEqualTo(new BigInteger("6"));
    }
}
