package se.fredsberg.euler.function;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class DivisorCountTest {

    @Test
    public void testAFewValues() {
        DivisorCount function = new DivisorCount();
        assertThat(function.calculate(1L)).isEqualTo(1);
        assertThat(function.calculate(3L)).isEqualTo(2);
        assertThat(function.calculate(6L)).isEqualTo(4);
        assertThat(function.calculate(10L)).isEqualTo(4);
        assertThat(function.calculate(15L)).isEqualTo(4);
        assertThat(function.calculate(21L)).isEqualTo(4);
        assertThat(function.calculate(28L)).isEqualTo(6);
    }

}
