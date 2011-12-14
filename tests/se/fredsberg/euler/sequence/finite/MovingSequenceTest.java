package se.fredsberg.euler.sequence.finite;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import se.fredsberg.euler.sequence.DiscreteSequence;
import se.fredsberg.euler.sequence.finite.ClosedSequence;
import se.fredsberg.euler.sequence.finite.FiniteSequence;
import se.fredsberg.euler.sequence.finite.MovingSequence;

public class MovingSequenceTest {

    @Test
    public void emptySequence() {
        FiniteSequence<Long> source = new ClosedSequence<Long>(0, null);
        MovingSequence<Long> sequence = new MovingSequence<Long>(source, 1);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void simpleSequenceOfOne() {
        FiniteSequence<Long> source = new ClosedSequence<Long>(2, new DiscreteSequence());
        MovingSequence<Long> sequences = new MovingSequence<Long>(source, 1);
        assertThat(sequences.hasNext()).isTrue();
        assertSequenceContains(sequences.next(), 0);
        assertThat(sequences.hasNext()).isTrue();
        assertSequenceContains(sequences.next(), 1);
        assertThat(sequences.hasNext()).isFalse();
    }

    @Test
    public void complexSequenceOfTwo() {
        FiniteSequence<Long> source = new ClosedSequence<Long>(3, new DiscreteSequence());
        MovingSequence<Long> sequences = new MovingSequence<Long>(source, 2);
        assertThat(sequences.hasNext()).isTrue();
        assertSequenceContains(sequences.next(), 0, 1);
        assertThat(sequences.hasNext()).isTrue();
        assertSequenceContains(sequences.next(), 1, 2);
        assertThat(sequences.hasNext()).isFalse();
    }

    private void assertSequenceContains(FiniteSequence<Long> sequence, long... contents) {
        for (long x : contents) {
            assertThat(sequence.hasNext()).isTrue();
            assertThat(sequence.next()).isEqualTo(x);
        }
        assertThat(sequence.hasNext()).isFalse();
    }
}
