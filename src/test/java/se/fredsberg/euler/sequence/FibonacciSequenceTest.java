package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class FibonacciSequenceTest {

    @Test
    public void fibonacciSequence() {
        FibonacciSequence sequence = new FibonacciSequence();
        assertThat(sequence.next()).isEqualTo(1);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.next()).isEqualTo(5);
        assertThat(sequence.next()).isEqualTo(8);
        assertThat(sequence.next()).isEqualTo(13);
        assertThat(sequence.next()).isEqualTo(21);
        assertThat(sequence.next()).isEqualTo(34);
        assertThat(sequence.next()).isEqualTo(55);
        assertThat(sequence.next()).isEqualTo(89);
    }
}
