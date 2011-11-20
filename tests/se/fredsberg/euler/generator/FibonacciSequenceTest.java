package se.fredsberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.FibonacciSequence;

public class FibonacciSequenceTest {

    @Test
    public void fibonacciSequence() {
        FibonacciSequence generator = new FibonacciSequence();
        assertThat(generator.next()).isEqualTo(1);
        assertThat(generator.next()).isEqualTo(2);
        assertThat(generator.next()).isEqualTo(3);
        assertThat(generator.next()).isEqualTo(5);
        assertThat(generator.next()).isEqualTo(8);
        assertThat(generator.next()).isEqualTo(13);
        assertThat(generator.next()).isEqualTo(21);
        assertThat(generator.next()).isEqualTo(34);
        assertThat(generator.next()).isEqualTo(55);
        assertThat(generator.next()).isEqualTo(89);
    }
}
