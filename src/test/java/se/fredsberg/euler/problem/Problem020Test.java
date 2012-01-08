package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem020Test {

    @Test
    public void solve() {
        assertThat(new Problem020().solve()).isEqualTo(648);
    }
}
