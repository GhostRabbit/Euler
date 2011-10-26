package se.fredberg.euler.prime;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredberg.euler.generator.Generator;

public class ArrayedPrimesGeneratorTest {

    @Test
    public void testGeneration() {
        Generator<Integer> primes = new ArrayedPrimesGenerator();
        assertThat(primes.next()).isEqualTo(2);
        assertThat(primes.next()).isEqualTo(3);
        assertThat(primes.next()).isEqualTo(5);
        assertThat(primes.next()).isEqualTo(7);
        assertThat(primes.next()).isEqualTo(11);
    }
}
