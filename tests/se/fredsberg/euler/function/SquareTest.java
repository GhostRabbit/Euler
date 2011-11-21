package se.fredsberg.euler.function;

import org.testng.annotations.Test;
import static org.fest.assertions.Assertions.*;


public class SquareTest {

    @Test
    public void someValues() {
        Square function = new Square();
        assertThat(function.calculate(2L)).isEqualTo(4);
        assertThat(function.calculate(-3L)).isEqualTo(9);
    }
}
