package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.DiscreteSequence;

public class DiscreteSequenceTest {

    @Test
    public void testNaturalNumberSequence() {
        DiscreteSequence sequence = new DiscreteSequence();
        assertThat(sequence.next()).isEqualTo(0);
        assertThat(sequence.next()).isEqualTo(1);
        assertThat(sequence.next()).isEqualTo(2);
    }
}
