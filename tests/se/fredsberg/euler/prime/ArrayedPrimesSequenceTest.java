package se.fredsberg.euler.prime;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.prime.ArrayedPrimesSequence;
import se.fredsberg.euler.sequence.Sequence;

public class ArrayedPrimesSequenceTest {

    @Test
    public void testGeneration() {
        Sequence<Integer> primes = new ArrayedPrimesSequence();
        assertThat(primes.next()).isEqualTo(2);
        assertThat(primes.next()).isEqualTo(3);
        assertThat(primes.next()).isEqualTo(5);
        assertThat(primes.next()).isEqualTo(7);
        assertThat(primes.next()).isEqualTo(11);
    }
}
