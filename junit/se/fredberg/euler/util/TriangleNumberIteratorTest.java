package se.fredberg.euler.util;

import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleNumberIteratorTest {

    @Test
    public void testNext() {
        TriangleNumberIterator iterator = new TriangleNumberIterator();
        assertEquals(1, iterator.next());
        assertEquals(3, iterator.next());
        assertEquals(6, iterator.next());
        assertEquals(10, iterator.next());
        assertEquals(15, iterator.next());
        assertEquals(21, iterator.next());
        assertEquals(28, iterator.next());
        assertEquals(36, iterator.next());
        assertEquals(45, iterator.next());
        assertEquals(55, iterator.next());
    }
    
}
