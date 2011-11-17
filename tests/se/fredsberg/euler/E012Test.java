package se.fredsberg.euler;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.E012;

public class E012Test {

    @Test
    public void getDivisorCount() {
        assertThat(E012.getDivisorCount(1)).isEqualTo(1);
        assertThat(E012.getDivisorCount(3)).isEqualTo(2);
        assertThat(E012.getDivisorCount(6)).isEqualTo(4);
        assertThat(E012.getDivisorCount(10)).isEqualTo(4);
        assertThat(E012.getDivisorCount(15)).isEqualTo(4);
        assertThat(E012.getDivisorCount(21)).isEqualTo(4);
        assertThat(E012.getDivisorCount(28)).isEqualTo(6);
    }
}
