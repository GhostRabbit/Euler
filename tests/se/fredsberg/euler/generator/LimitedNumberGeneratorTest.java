package se.fredsberg.euler.generator;

import static org.fest.assertions.Assertions.*;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

import se.fredsberg.euler.generator.LimitedNumberGenerator;

public class LimitedNumberGeneratorTest {

    @Test
    public void next() {
        LimitedNumberGenerator generator = new LimitedNumberGenerator(2, 2);
        assertThat(generator.hasNext()).isEqualTo(true);
        assertThat(generator.next()).isEqualTo(2);
        assertThat(generator.hasNext()).isEqualTo(false);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void limitLessThenStartIsIllegal() {
        new LimitedNumberGenerator(2, 1);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void loopPastLimit() {
        LimitedNumberGenerator generator = new LimitedNumberGenerator(2, 2);
        generator.next();
        generator.next();
    }

}