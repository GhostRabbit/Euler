package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem004Test {

    @Test
    public void solve() {
        assertThat(new Problem004().solve()).isEqualTo(906609);
    }
}
