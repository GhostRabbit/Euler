package se.fredberg.euler.prime;

import static org.junit.Assert.*;

import org.junit.Test;

import se.fredberg.euler.util.Generator;

public class ArrayedPrimesGeneratorTest {

    @Test
    public void test() {
        Generator primes = new ArrayedPrimesGenerator();
        assertEquals(2, primes.next());
        assertEquals(3, primes.next());
        assertEquals(5, primes.next());
        assertEquals(7, primes.next());
        assertEquals(11, primes.next());
    }
}
