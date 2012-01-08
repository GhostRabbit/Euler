package se.fredsberg.euler.sequence.finite;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import se.fredsberg.euler.sequence.Sequence;

public class ClosedSequenceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private final Object expected = new Object();
    private Sequence<Object> wrappedSequence;

    @Before
    public void setup() {
        wrappedSequence = new Sequence<Object>() {

            @Override
            public Object next() {
                return expected;
            }
        };
    }

    @Test
    public void limitZeroHasNoNext() {
        ClosedSequence<Long> sequence = new ClosedSequence<Long>(0, null);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void limitOneHaveOneNext() {
        ClosedSequence<Object> sequence = new ClosedSequence<Object>(1, wrappedSequence);
        assertThat(sequence.hasNext()).isTrue();
        sequence.next();
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void exceptionIfGoingPastLimit() {
        thrown.expect(NoSuchElementException.class);
        ClosedSequence<Object> sequence = new ClosedSequence<Object>(0, wrappedSequence);
        sequence.next();
    }

    @Test
    public void shouldReturnValueFromSequence() {
        ClosedSequence<Object> sequence = new ClosedSequence<Object>(1, wrappedSequence);
        assertThat(sequence.next()).isSameAs(expected);
    }
}
