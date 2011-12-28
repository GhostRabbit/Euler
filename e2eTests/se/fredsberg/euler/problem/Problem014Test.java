package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem014Test {

    @Test
    public void solve() {
        assertThat(new Problem014().solve()).isEqualTo(837799);
    }
}
