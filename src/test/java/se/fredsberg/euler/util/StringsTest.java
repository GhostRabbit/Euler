package se.fredsberg.euler.util;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class StringsTest {

    @Test
    public void string2int() {
        Strings SUT = new Strings();
        assertThat(SUT.string2int("")).isEmpty();
        assertThat(SUT.string2int("0123")).containsExactly(0, 1, 2, 3);
    }
}
