package se.fredberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class ProductGeneratorTest {

    @Test
    public void next() {
        ProductGenerator productGenerator = new ProductGenerator(10, 12);
        assertThat(productGenerator.next()).isEqualTo(100);
        assertThat(productGenerator.next()).isEqualTo(110);
        assertThat(productGenerator.next()).isEqualTo(120);
        assertThat(productGenerator.next()).isEqualTo(121);
        assertThat(productGenerator.next()).isEqualTo(132);
        assertThat(productGenerator.next()).isEqualTo(144);
    }

    @Test(expected = NoSuchElementException.class)
    public void tooFar() {
        ProductGenerator productGenerator = new ProductGenerator(10, 10);
        productGenerator.next();
        productGenerator.next();
    }

    @Test(expected = IllegalArgumentException.class)
    public void upperLowerThenLower() {
        new ProductGenerator(10, 9);
    }

}
