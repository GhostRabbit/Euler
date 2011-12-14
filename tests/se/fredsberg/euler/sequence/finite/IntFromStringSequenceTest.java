package se.fredsberg.euler.sequence.finite;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.Test;

import se.fredsberg.euler.sequence.finite.IntFromStringSequence;

public class IntFromStringSequenceTest {

    @Test
    public void emptySequence() {
        IntFromStringSequence sequence = new IntFromStringSequence("");
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void someNumbers() {
        IntFromStringSequence sequence = new IntFromStringSequence("12");
        assertThat(sequence.hasNext()).isTrue();
        assertThat(sequence.next()).isEqualTo(1);
        assertThat(sequence.hasNext()).isTrue();
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test(expected = NoSuchElementException.class)
    public void nextWhenFinsihedShouldThrowException() {
        IntFromStringSequence sequence = new IntFromStringSequence("");
        sequence.next();
    }
}
