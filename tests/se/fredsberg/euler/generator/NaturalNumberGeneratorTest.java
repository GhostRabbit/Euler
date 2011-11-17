package se.fredsberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.generator.NaturalNumberGenerator;

public class NaturalNumberGeneratorTest {

    @Test
    public void testNaturalNumberSequence() {
        NaturalNumberGenerator generator = new NaturalNumberGenerator();
        assertThat(generator.next()).isEqualTo(0);
        assertThat(generator.next()).isEqualTo(1);
        assertThat(generator.next()).isEqualTo(2);
    }
}
