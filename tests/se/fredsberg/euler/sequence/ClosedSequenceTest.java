package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class ClosedSequenceTest {

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

    @Test(expected = NoSuchElementException.class)
    public void exceptionIfGoingPastLimit() {
        ClosedSequence<Object> sequence = new ClosedSequence<Object>(0, wrappedSequence);
        sequence.next();
    }

    @Test
    public void shouldReturnValueFromSequence() {
        ClosedSequence<Object> sequence = new ClosedSequence<Object>(1, wrappedSequence);
        assertThat(sequence.next()).isSameAs(expected);
    }
}
