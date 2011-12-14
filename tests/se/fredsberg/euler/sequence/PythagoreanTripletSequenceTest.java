package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import java.util.Arrays;

import org.junit.Test;

public class PythagoreanTripletSequenceTest {

    @Test
    public void firstTriplet() {
        PythagoreanTripletSequence sequence = new PythagoreanTripletSequence();
        assertThat(sequence.next()).isEqualTo(Arrays.asList(3, 4, 5));
        assertThat(sequence.next()).isEqualTo(Arrays.asList(6, 8, 10));
        assertThat(sequence.next()).isEqualTo(Arrays.asList(5, 12, 13));
    }
}
