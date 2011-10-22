package se.fredberg.euler.util;

import static org.junit.Assert.*;

import org.junit.Test;


public class DivisorCheckedSumTest {

    @Test
    public void newCheckedSumHaveNoResult() {
        assertResultEquals(0, new DivisorCheckedSum());
    }

    @Test
    public void aCheckedSumIgnoresCertainValues() {
        DivisorCheckedSum checkedSum = new DivisorCheckedSum(3, 5);
        checkedSum.process(0);
        checkedSum.process(2);
        assertResultEquals(0, checkedSum);
        checkedSum.process(3);
        assertResultEquals(3, checkedSum);
        checkedSum.process(4);
        checkedSum.process(5);
        assertResultEquals(8, checkedSum);
        checkedSum.process(15);
        assertResultEquals(23, checkedSum);
    }

    private void assertResultEquals(int i, DivisorCheckedSum checkedSum) {
        assertEquals(i, (int) checkedSum.getResult());
    }
    
    
}
