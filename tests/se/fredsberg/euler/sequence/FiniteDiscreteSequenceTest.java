package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.FiniteDiscreteSequence;

public class FiniteDiscreteSequenceTest {

    @Test
    public void next() {
        FiniteDiscreteSequence sequence = new FiniteDiscreteSequence(2);
        assertThat(sequence.hasNext()).isEqualTo(true);
        assertThat(sequence.next()).isEqualTo(1);
        assertThat(sequence.hasNext()).isEqualTo(true);
        assertThat(sequence.next()).isEqualTo(2);
        assertThat(sequence.hasNext()).isEqualTo(false);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void loopPastLimit() {
        FiniteDiscreteSequence sequence = new FiniteDiscreteSequence(2);
        sequence.next();
        sequence.next();
        sequence.next();
    }

}
