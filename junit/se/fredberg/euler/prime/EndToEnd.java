package se.fredberg.euler.prime;

import static org.junit.Assert.*;

import org.junit.Test;

public class EndToEnd {

    @Test
    public void expectASeriesOfPrimes() {
        Generator primes = new LinkedPrimesGenerator(new NumberGenerator(2));
        assertEquals(2, primes.next());
        assertEquals(3, primes.next());
        assertEquals(5, primes.next());
        assertEquals(7, primes.next());
        assertEquals(11, primes.next());
    }
}
