package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

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

    @Test(expectedExceptions=NoSuchElementException.class)
    public void nextWhenFinsihedShouldThrowException() {
        IntFromStringSequence sequence = new IntFromStringSequence("");
        sequence.next();
    }
}
