package se.fredsberg.euler.sequence.finite;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IntFromStringSequenceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

    @Test
    public void nextWhenFinsihedShouldThrowException() {
        thrown.expect(NoSuchElementException.class);
        IntFromStringSequence sequence = new IntFromStringSequence("");
        sequence.next();
    }
}
