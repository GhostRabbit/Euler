package se.fredberg.euler.util;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

public class TriangleNumberIteratorTest {

    @Test
    public void testNext() {
        TriangleNumberIterator iterator = new TriangleNumberIterator();
        assertThat(iterator.next()).isEqualTo(1);
        assertThat(iterator.next()).isEqualTo(3);
        assertThat(iterator.next()).isEqualTo(6);
        assertThat(iterator.next()).isEqualTo(10);
        assertThat(iterator.next()).isEqualTo(15);
        assertThat(iterator.next()).isEqualTo(21);
        assertThat(iterator.next()).isEqualTo(28);
        assertThat(iterator.next()).isEqualTo(36);
        assertThat(iterator.next()).isEqualTo(45);
        assertThat(iterator.next()).isEqualTo(55);
    }

}
