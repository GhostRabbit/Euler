package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class PrimeFactorSequenceTest {

    @Test
    public void factorizeLessThen2() {
        PrimeFactorSequence sequence = new PrimeFactorSequence(1L);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void factorize3() {
        PrimeFactorSequence sequence = new PrimeFactorSequence(3L);
        assertThat(sequence.hasNext()).isTrue();
    }

    @Test
    public void factorize8() {
        PrimeFactorSequence sequence = new PrimeFactorSequence(8L);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void factorize10() {
        PrimeFactorSequence sequence = new PrimeFactorSequence(10L);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.next()).isEqualTo(5);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void factorize12() {
        PrimeFactorSequence sequence = new PrimeFactorSequence(12L);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void factorize21() {
        PrimeFactorSequence sequence = new PrimeFactorSequence(21L);
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.next()).isEqualTo(7);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void factorize27() {
        PrimeFactorSequence sequence = new PrimeFactorSequence(27L);
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void factorize13195() {
        PrimeFactorSequence sequence = new PrimeFactorSequence(13195L);
        assertThat(sequence.next()).isEqualTo(5);
        assertThat(sequence.next()).isEqualTo(7);
        assertThat(sequence.next()).isEqualTo(13);
        assertThat(sequence.next()).isEqualTo(29);
        assertThat(sequence.hasNext()).isFalse();
    }
}
