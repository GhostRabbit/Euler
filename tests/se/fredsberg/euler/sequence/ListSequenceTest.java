package se.fredsberg.euler.sequence;

import static org.fest.assertions.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;

public class ListSequenceTest {

    @Test
    public void emptyList() {
        List<Integer> list = Collections.emptyList();
        ListSequence<Integer> sequence = new ListSequence<Integer>(list);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test(expected = NoSuchElementException.class)
    public void endOverrun() {
        List<Integer> list = Collections.emptyList();
        ListSequence<Integer> sequence = new ListSequence<Integer>(list);
        sequence.next();
    }

    @Test
    public void twoValues() {
        List<Integer> list = Arrays.asList(new Integer[] { 3, 7 });
        ListSequence<Integer> sequence = new ListSequence<Integer>(list);
        assertThat(sequence.hasNext()).isTrue();
        assertThat(sequence.next()).isEqualTo(3);
        assertThat(sequence.hasNext()).isTrue();
        assertThat(sequence.next()).isEqualTo(7);
        assertThat(sequence.hasNext()).isFalse();
    }

}
