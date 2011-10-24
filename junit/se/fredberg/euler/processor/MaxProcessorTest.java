package se.fredberg.euler.processor;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class MaxProcessorTest {

    @Test
    public void extractMax() {
        MaxProcessor max = new MaxProcessor();
        assertThat(max.getResult()).isEqualTo(Integer.MIN_VALUE);
        max.process(-5);
        assertThat(max.getResult()).isEqualTo(-5);
        max.process(5);
        assertThat(max.getResult()).isEqualTo(5);
        max.process(0);
        assertThat(max.getResult()).isEqualTo(5);
    }
}
