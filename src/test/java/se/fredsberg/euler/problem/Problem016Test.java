package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem016Test {

    @Test
    public void solve() {
        assertThat(new Problem016().solve()).isEqualTo(1366);
    }
}
