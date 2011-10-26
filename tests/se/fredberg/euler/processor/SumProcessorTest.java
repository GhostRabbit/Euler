package se.fredberg.euler.processor;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

public class SumProcessorTest {

    @Test
    public void newlyCreated() {
        SumProcessor summerizer = new SumProcessor();
        assertThat(summerizer.getResult()).isEqualTo(0);
    }

    @Test
    public void sumUpSomeNumbers() {
        SumProcessor summerizer = new SumProcessor();
        summerizer.process(1);
        assertThat(summerizer.getResult()).isEqualTo(1);
        summerizer.process(2);
        assertThat(summerizer.getResult()).isEqualTo(3);
        summerizer.process(-3);
        assertThat(summerizer.getResult()).isEqualTo(0);
    }

}
