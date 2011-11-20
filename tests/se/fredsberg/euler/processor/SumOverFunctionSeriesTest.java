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
        SumOverFunctionSeries processor = new SumOverFunctionSeries(new Function<Integer>() {
            
            @Override
            public Integer calculate(Integer t) {
                return t * 2;
            }
        });
        processor.process(2);
        assertThat(processor.getResult()).isEqualTo(4);
        processor.process(5);
        assertThat(processor.getResult()).isEqualTo(14);
    }
    

}
