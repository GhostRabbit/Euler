package se.fredberg.euler;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class E002Test {
    
    @Test
    public void getFibonacciSequence() {
        List<Integer> sequence = new E002().getFibonacciSequence(15);
        assertEquals(6, sequence.size());
    }
    
    @Test
    public void sumEvenEntries() {
        E002 e002 = new E002();
        List<Integer> sequence = e002.getFibonacciSequence(15);
        assertEquals(10, e002.sumEvenEntries(sequence));
    }
}
