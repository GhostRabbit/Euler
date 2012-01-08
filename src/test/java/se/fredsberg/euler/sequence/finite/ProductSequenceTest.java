package se.fredsberg.euler.sequence.finite;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ProductSequenceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void next() {
        ProductSequence sequence = new ProductSequence(10, 12);
        assertThat(sequence.next()).isEqualTo(100);
        assertThat(sequence.next()).isEqualTo(110);
        assertThat(sequence.next()).isEqualTo(120);
        assertThat(sequence.next()).isEqualTo(121);
        assertThat(sequence.next()).isEqualTo(132);
        assertThat(sequence.next()).isEqualTo(144);
    }

    @Test
    public void tooFar() {
        thrown.expect(NoSuchElementException.class);
        ProductSequence sequence = new ProductSequence(10, 10);
        sequence.next();
        sequence.next();
    }

    @Test
    public void upperLowerThenLower() {
        thrown.expect(IllegalArgumentException.class);
        new ProductSequence(10, 9);
    }

}
