package se.fredsberg.euler.series;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.function.Function;
import se.fredsberg.euler.series.SumOverFunctionSeries;


public class SumOverFunctionSeriesTest {
    
    @Test
    public void newProcessor() {
        SumOverFunctionSeries series = new SumOverFunctionSeries(null);
        assertThat(series.getResult()).isEqualTo(0);
    }

    @Test
    public void processAFew() {
        SumOverFunctionSeries series = new SumOverFunctionSeries(new Function<Long>() {
            
            @Override
            public Long calculate(Long t) {
                return t * 2;
            }
        });
        series.process(2L);
        assertThat(series.getResult()).isEqualTo(4);
        series.process(5L);
        assertThat(series.getResult()).isEqualTo(14);
    }
    

}
