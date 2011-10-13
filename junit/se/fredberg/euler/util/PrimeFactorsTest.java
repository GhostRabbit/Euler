package se.fredberg.euler.util;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class PrimeFactorsTest {
    @Test
    public void primeFactors() {
        assertThat(PrimeFactors.factorize(3)).containsExactly(3);
        assertThat(PrimeFactors.factorize(8)).containsExactly(2, 2, 2);
        assertThat(PrimeFactors.factorize(10)).containsExactly(2, 5);
        assertThat(PrimeFactors.factorize(21)).containsExactly(3, 7);
        assertThat(PrimeFactors.factorize(27)).containsExactly(3, 3, 3);
        assertThat(PrimeFactors.factorize(13195)).containsExactly(5, 7, 13, 29);
    }
}
