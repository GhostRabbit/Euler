package se.fredsberg.euler.processor;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.function.Function;


public class SumOfFunctionProcessorTest {
    
    @Test
    public void newProcessor() {
        SumOfFunctionProcessor processor = new SumOfFunctionProcessor(null);
        assertThat(processor.getResult()).isEqualTo(0);
    }

    @Test
    public void processAFew() {
        SumOfFunctionProcessor processor = new SumOfFunctionProcessor(new Function<Integer>() {
            
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
