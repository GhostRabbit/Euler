package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem006Test {

    @Test
    public void solve() {
        assertThat(new Problem006().solve()).isEqualTo(25164150);
    }
}
