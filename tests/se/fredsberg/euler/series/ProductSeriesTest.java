package se.fredsberg.euler.series;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.series.ProductSeries;

public class ProductSeriesTest {

    @Test
    public void newlyCreated() {
        ProductSeries processor = new ProductSeries();
        assertThat(processor.getResult()).isEqualTo(1);
    }

    @Test
    public void multiplySomeNumbers() {
        ProductSeries processor = new ProductSeries();
        processor.process(1);
        assertThat(processor.getResult()).isEqualTo(1);
        processor.process(2);
        assertThat(processor.getResult()).isEqualTo(2);
        processor.process(-3);
        assertThat(processor.getResult()).isEqualTo(-6);
    }

}
