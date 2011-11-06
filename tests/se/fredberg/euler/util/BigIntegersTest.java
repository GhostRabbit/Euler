package se.fredberg.euler.util;

import static org.fest.assertions.Assertions.*;

import java.math.BigInteger;

import org.testng.annotations.Test;


public class BigIntegersTest {

    @Test
    public void sumOfDigits() {
        assertThat(BigIntegers.sumDigits(new BigInteger("123"))).isEqualTo(6);
    }
}
