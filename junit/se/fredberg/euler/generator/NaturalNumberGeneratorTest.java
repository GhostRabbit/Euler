package se.fredberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class NaturalNumberGeneratorTest {

    @Test
    public void testNaturalNumberSequence() {
        NaturalNumberGenerator generator = new NaturalNumberGenerator();
        assertThat(generator.next()).isEqualTo(0);
        assertThat(generator.next()).isEqualTo(1);
        assertThat(generator.next()).isEqualTo(2);
    }
}
