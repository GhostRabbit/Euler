package se.fredsberg.euler.series;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class SumSeriesTest {

    @Test
    public void newlyCreated() {
        SumSeries summerizer = new SumSeries();
        assertThat(summerizer.getResult()).isEqualTo(0);
    }

    @Test
    public void sumUpSomeNumbers() {
        SumSeries summerizer = new SumSeries();
        summerizer.process(1L);
        assertThat(summerizer.getResult()).isEqualTo(1);
        summerizer.process(2L);
        assertThat(summerizer.getResult()).isEqualTo(3);
        summerizer.process(-3L);
        assertThat(summerizer.getResult()).isEqualTo(0);
    }
}
