package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;


public class Problem005Test {

    @Test
    public void solve() {
        assertThat(new Problem005().solve()).isEqualTo(232792560);
    }
}
