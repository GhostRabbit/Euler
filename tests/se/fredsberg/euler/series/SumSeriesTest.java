package se.fredsberg.euler.series;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.series.SumSeries;

public class SumSeriesTest {

    @Test
    public void newlyCreated() {
        SumSeries summerizer = new SumSeries();
        assertThat(summerizer.getResult()).isEqualTo(0);
    }

    @Test
    public void sumUpSomeNumbers() {
        SumSeries summerizer = new SumSeries();
        summerizer.process(1);
        assertThat(summerizer.getResult()).isEqualTo(1);
        summerizer.process(2);
        assertThat(summerizer.getResult()).isEqualTo(3);
        summerizer.process(-3);
        assertThat(summerizer.getResult()).isEqualTo(0);
    }

}
