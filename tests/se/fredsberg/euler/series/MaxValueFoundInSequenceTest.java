package se.fredsberg.euler.series;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.series.MaxValueFoundInSequence;

public class MaxValueFoundInSequenceTest {

    @Test
    public void extractMax() {
        MaxValueFoundInSequence max = new MaxValueFoundInSequence();
        assertThat(max.getResult()).isEqualTo(Integer.MIN_VALUE);
        max.process(-5);
        assertThat(max.getResult()).isEqualTo(-5);
        max.process(5);
        assertThat(max.getResult()).isEqualTo(5);
        max.process(0);
        assertThat(max.getResult()).isEqualTo(5);
    }
}
