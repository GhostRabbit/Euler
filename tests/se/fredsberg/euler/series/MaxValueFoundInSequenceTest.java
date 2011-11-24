package se.fredsberg.euler.series;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class MaxValueFoundInSequenceTest {

    @Test
    public void extractMax() {
        MaxValueFoundInSequence<Long> max = new MaxValueFoundInSequence<Long>();
        assertThat(max.getResult()).isEqualTo(Long.MIN_VALUE);
        max.process(-5L);
        assertThat(max.getResult()).isEqualTo(-5);
        max.process(5L);
        assertThat(max.getResult()).isEqualTo(5);
        max.process(0L);
        assertThat(max.getResult()).isEqualTo(5);
    }
}
