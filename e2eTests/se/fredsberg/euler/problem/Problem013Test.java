package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem013Test {

    @Test
    public void solve() {
        assertThat(new Problem013().solve()).isEqualTo(5537376230L);
    }
}
