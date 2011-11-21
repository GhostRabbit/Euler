package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.FiniteIntegerSequence;

public class FiniteIntegerSequenceTest {

    @Test
    public void next() {
        FiniteIntegerSequence sequence = new FiniteIntegerSequence(2);
        assertThat(sequence.hasNext()).isEqualTo(true);
        assertThat(sequence.next()).isEqualTo(1);
        assertThat(sequence.hasNext()).isEqualTo(true);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.hasNext()).isEqualTo(false);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void loopPastLimit() {
        FiniteIntegerSequence sequence = new FiniteIntegerSequence(2);
        sequence.next();
        sequence.next();
        sequence.next();
    }

}
