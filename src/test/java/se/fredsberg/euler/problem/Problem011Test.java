package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem011Test {

    @Test
    public void solve() {
        assertThat(new Problem011().solve()).isEqualTo(70600674);
    }
}
