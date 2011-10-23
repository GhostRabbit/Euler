package se.fredberg.euler.processor;

import static org.junit.Assert.*;

import org.junit.Test;

import se.fredberg.euler.processor.SumProcessor;


public class SumProcessorTest {

    @Test
    public void newlyCreated() {
        SumProcessor summerizer = new SumProcessor();
        assertEquals(0, (int) summerizer.getResult());
    }
    
    @Test
    public void sumUpSomeNumbers() {
        SumProcessor summerizer = new SumProcessor();
        summerizer.process(1);
        assertEquals(1, (int) summerizer.getResult());
        summerizer.process(2);
        assertEquals(3, (int) summerizer.getResult());
        summerizer.process(-3);
        assertEquals(0, (int) summerizer.getResult());
    }
    
}
