package se.fredsberg.euler.function;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;


public class DivisorCountTest {

    @Test
    public void testAFewValues() {
        DivisorCount function = new DivisorCount();
        assertThat(function.calculate(1)).isEqualTo(1);
        assertThat(function.calculate(3)).isEqualTo(2);
        assertThat(function.calculate(6)).isEqualTo(4);
        assertThat(function.calculate(10)).isEqualTo(4);
        assertThat(function.calculate(15)).isEqualTo(4);
        assertThat(function.calculate(21)).isEqualTo(4);
        assertThat(function.calculate(28)).isEqualTo(6);
    }
    
}
