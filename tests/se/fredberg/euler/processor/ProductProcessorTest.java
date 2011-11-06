package se.fredberg.euler.processor;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

public class ProductProcessorTest {

    @Test
    public void newlyCreated() {
        ProductProcessor processor = new ProductProcessor();
        assertThat(processor.getResult()).isEqualTo(1);
    }

    @Test
    public void multiplySomeNumbers() {
        ProductProcessor processor = new ProductProcessor();
        processor.process(1);
        assertThat(processor.getResult()).isEqualTo(1);
        processor.process(2);
        assertThat(processor.getResult()).isEqualTo(2);
        processor.process(-3);
        assertThat(processor.getResult()).isEqualTo(-6);
    }

}
