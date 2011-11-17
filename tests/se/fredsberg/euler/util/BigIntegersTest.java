package se.fredsberg.euler.util;

import static org.fest.assertions.Assertions.*;

import java.math.BigInteger;

import org.testng.annotations.Test;

import se.fredsberg.euler.util.BigIntegers;

public class BigIntegersTest {

    @Test
    public void sumOfDigits() {
        assertThat(BigIntegers.sumDigits(new BigInteger("123"))).isEqualTo(6);
    }

    @Test
    public void factor() {
        assertThat(BigIntegers.factor(1)).isEqualTo(new BigInteger("1"));
        assertThat(BigIntegers.factor(3)).isEqualTo(new BigInteger("6"));
    }
}
