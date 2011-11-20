package se.fredsberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.generator.IncrementedNumberGenerator;


public class IncrementedNumberGeneratorTest {

    @Test
    public void increment() {
        IncrementedNumberGenerator generator = new IncrementedNumberGenerator(3);
        assertThat(generator.next()).isEqualTo(3);
        assertThat(generator.next()).isEqualTo(6);
        assertThat(generator.next()).isEqualTo(9);
    }
    
}