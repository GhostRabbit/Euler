package se.fredsberg.euler;

import static org.fest.assertions.Assertions.*;

import java.util.List;

import org.testng.annotations.Test;

import se.fredsberg.euler.E008;

public class E008Test {

    E008 SUT = new E008();

    @Test
    public void string2int() {
        assertThat(SUT.string2int("")).isEmpty();
        assertThat(SUT.string2int("0123")).containsExactly(0, 1, 2, 3);
    }

    @Test
    public void createCombinations() {
        assertThat(SUT.createCombinations(SUT.string2int("0123"), 4)).hasSize(1);
        List<List<Integer>> combos = SUT.createCombinations(SUT.string2int("01234"), 4);
        assertThat(combos).hasSize(2);
        assertThat(combos.get(0)).containsExactly(0, 1, 2, 3);
        assertThat(combos.get(1)).containsExactly(1, 2, 3, 4);

    }
}
