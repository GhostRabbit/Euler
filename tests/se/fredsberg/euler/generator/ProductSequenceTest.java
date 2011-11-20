package se.fredsberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.ProductSequence;

public class ProductSequenceTest {

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

    @Test(expectedExceptions = NoSuchElementException.class)
    public void tooFar() {
        ProductSequence sequence = new ProductSequence(10, 10);
        sequence.next();
        sequence.next();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void upperLowerThenLower() {
        new ProductSequence(10, 9);
    }

}
