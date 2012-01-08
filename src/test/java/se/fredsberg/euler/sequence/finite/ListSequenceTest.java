package se.fredsberg.euler.sequence.finite;

import static org.fest.assertions.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ListSequenceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void emptyList() {
        List<Integer> list = Collections.emptyList();
        ListSequence<Integer> sequence = new ListSequence<Integer>(list);
        assertThat(sequence.hasNext()).isFalse();
    }

    @Test
    public void endOverrun() {
        thrown.expect(NoSuchElementException.class);
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
