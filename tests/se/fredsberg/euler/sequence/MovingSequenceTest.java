package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;


public class MovingSequenceTest {

    @Test
    public void emptySequence() {
        MovingSequence<Long> sequence = new MovingSequence<Long>(new FiniteDiscreteSequence(0), 1);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void simpleSequenceOfOne() {
        FiniteDiscreteSequence source = new FiniteDiscreteSequence(2);
        MovingSequence<Long> sequences = new MovingSequence<Long>(source, 1);
        assertThat(sequences.hasNext()).isTrue();
        assertSequenceContains(sequences.next(), 1);
        assertThat(sequences.hasNext()).isTrue();
        assertSequenceContains(sequences.next(), 2);
        assertThat(sequences.hasNext()).isFalse();
    }

    @Test
    public void complexSequenceOfTwo() { 
        FiniteDiscreteSequence source = new FiniteDiscreteSequence(3);
        MovingSequence<Long> sequences = new MovingSequence<Long>(source, 2);
        assertThat(sequences.hasNext()).isTrue();
        assertSequenceContains(sequences.next(), 1, 2);
        assertThat(sequences.hasNext()).isTrue();
        assertSequenceContains(sequences.next(), 2, 3);
        assertThat(sequences.hasNext()).isFalse();
    }

    private void assertSequenceContains(FiniteSequence<Long> sequence, long ... contents) {
        for (long x : contents) {
            assertThat(sequence.hasNext()).isTrue();
            assertThat(sequence.next()).isEqualTo(x);
        }
        assertThat(sequence.hasNext()).isFalse();
    }
}
