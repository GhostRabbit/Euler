package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;


public class Problem012Test {

    @Test
    public void solve() {
        assertThat(new Problem012().solve()).isEqualTo(76576500);
    }
}
