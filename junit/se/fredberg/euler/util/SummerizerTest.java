package se.fredberg.euler.util;

import static org.junit.Assert.*;

import org.junit.Test;


public class SummerizerTest {

    @Test
    public void newlyCreated() {
        Summerizer summerizer = new Summerizer();
        assertEquals(0, (int) summerizer.getResult());
    }
    
    @Test
    public void sumUpSomeNumbers() {
        Summerizer summerizer = new Summerizer();
        summerizer.process(1);
        assertEquals(1, (int) summerizer.getResult());
        summerizer.process(2);
        assertEquals(3, (int) summerizer.getResult());
        summerizer.process(-3);
        assertEquals(0, (int) summerizer.getResult());
    }
    
}
