package se.fredberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

public class FibonacciGeneratorTest {

    @Test
    public void fibonacciSequence() {
        FibonacciGenerator generator = new FibonacciGenerator();
        assertThat(generator.next()).isEqualTo(1);
        assertThat(generator.next()).isEqualTo(2);
        assertThat(generator.next()).isEqualTo(3);
        assertThat(generator.next()).isEqualTo(5);
        assertThat(generator.next()).isEqualTo(8);
        assertThat(generator.next()).isEqualTo(13);
        assertThat(generator.next()).isEqualTo(21);
        assertThat(generator.next()).isEqualTo(34);
        assertThat(generator.next()).isEqualTo(55);
        assertThat(generator.next()).isEqualTo(89);
    }
}
