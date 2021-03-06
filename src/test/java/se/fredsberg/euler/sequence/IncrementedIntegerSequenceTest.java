package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class IncrementedIntegerSequenceTest {

    @Test
    public void increment() {
        IncrementedIntegerSequence sequence = new IncrementedIntegerSequence(3);
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.next()).isEqualTo(6);
        assertThat(sequence.next()).isEqualTo(9);
    }

}
