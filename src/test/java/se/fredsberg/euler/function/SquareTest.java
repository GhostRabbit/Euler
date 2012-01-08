package se.fredsberg.euler.function;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class SquareTest {

    @Test
    public void someValues() {
        Square function = new Square();
        assertThat(function.calculate(2L)).isEqualTo(4);
        assertThat(function.calculate(-3L)).isEqualTo(9);
    }
}
