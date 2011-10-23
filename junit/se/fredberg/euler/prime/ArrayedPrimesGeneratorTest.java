package se.fredberg.euler.prime;

import static org.junit.Assert.*;

import org.junit.Test;

import se.fredberg.euler.generator.Generator;

public class ArrayedPrimesGeneratorTest {

    @Test
    public void test() {
        Generator<Integer> primes = new ArrayedPrimesGenerator();
        assertEquals(2, (int) primes.next());
        assertEquals(3, (int) primes.next());
        assertEquals(5, (int) primes.next());
        assertEquals(7, (int) primes.next());
        assertEquals(11, (int) primes.next());
    }
}
