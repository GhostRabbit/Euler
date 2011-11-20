package se.fredsberg.euler.processor;

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
        SumOverFunctionSeries series = new SumOverFunctionSeries(new Function<Integer>() {
            
            @Override
            public Integer calculate(Integer t) {
                return t * 2;
            }
        });
        series.process(2);
        assertThat(series.getResult()).isEqualTo(4);
        series.process(5);
        assertThat(series.getResult()).isEqualTo(14);
    }
    

}
