package se.fredsberg.euler.series;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import se.fredsberg.euler.function.Function;

public class SumOverFunctionSeriesTest {

    @Test
    public void newProcessor() {
        SumOverFunctionSeries series = new SumOverFunctionSeries(null);
        assertThat(series.getResult()).isEqualTo(0);
    }

    @Test
    public void processAFew() {
        SumOverFunctionSeries series = new SumOverFunctionSeries(new Function<Long, Long>() {

            @Override
            public Long calculate(Long x) {
                return x * 2;
            }
        });
        series.process(2L);
        assertThat(series.getResult()).isEqualTo(4);
        series.process(5L);
        assertThat(series.getResult()).isEqualTo(14);
    }

}
