package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class TriangleNumberSequenceTest {

    @Test
    public void testNext() {
        TriangleNumberSequence sequence = new TriangleNumberSequence();
        assertThat(sequence.next()).isEqualTo(1);
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.next()).isEqualTo(6);
        assertThat(sequence.next()).isEqualTo(10);
        assertThat(sequence.next()).isEqualTo(15);
        assertThat(sequence.next()).isEqualTo(21);
        assertThat(sequence.next()).isEqualTo(28);
        assertThat(sequence.next()).isEqualTo(36);
        assertThat(sequence.next()).isEqualTo(45);
        assertThat(sequence.next()).isEqualTo(55);
    }

}
