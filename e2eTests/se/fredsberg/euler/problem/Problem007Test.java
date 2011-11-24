package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem007Test {

    @Test
    public void solve() {
        assertThat(new Problem007().solve()).isEqualTo(104743);
    }
}
