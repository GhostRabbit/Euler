package se.fredsberg.euler.series;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.series.ProductSeries;

public class ProductSeriesTest {

    @Test
    public void newlyCreated() {
        ProductSeries<?> processor = new ProductSeries<Integer>();
        assertThat(processor.getResult()).isEqualTo(1);
    }

    @Test
    public void multiplySomeNumbers() {
        ProductSeries<Long> processor = new ProductSeries<Long>();
        processor.process(1L);
        assertThat(processor.getResult()).isEqualTo(1);
        processor.process(2L);
        assertThat(processor.getResult()).isEqualTo(2);
        processor.process(-3L);
        assertThat(processor.getResult()).isEqualTo(-6);
    }

}
