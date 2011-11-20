package se.fredsberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.IntegerSequence;

public class IntegerSequenceTest {

    @Test
    public void testNaturalNumberSequence() {
        IntegerSequence sequence = new IntegerSequence();
        assertThat(sequence.next()).isEqualTo(0);
        assertThat(sequence.next()).isEqualTo(1);
        assertThat(sequence.next()).isEqualTo(2);
    }
}
