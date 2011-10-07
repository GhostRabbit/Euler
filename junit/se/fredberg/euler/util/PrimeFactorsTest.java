package se.fredberg.euler.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {
    @Test
    public void primeFactors_8() {
        List<Integer> expected = Arrays.asList(new Integer[] { 2, 2, 2 });
        assertEquals(expected, PrimeFactors.factorize(8));
    }

    @Test
    public void primeFactors_27() {
        List<Integer> expected = Arrays.asList(new Integer[] { 3, 3, 3 });
        assertEquals(expected, PrimeFactors.factorize(27));
    }

    @Test
    public void primeFactors_13195() {
        // Primefactors of 13195 are 5, 7, 13 and 29.
        List<Integer> expected = Arrays.asList(new Integer[] { 5, 7, 13, 29 });
        assertEquals(expected, PrimeFactors.factorize(13195));
    }
}
