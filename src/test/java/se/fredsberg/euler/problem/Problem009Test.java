package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem009Test {

    @Test
    public void solve() {
        assertThat(new Problem009().solve()).isEqualTo(31875000L);
    }

}
