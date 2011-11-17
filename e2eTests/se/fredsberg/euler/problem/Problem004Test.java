package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.problem.Problem004;


public class Problem004Test {

    @Test
    public void solve() {
        assertThat(new Problem004().solve()).isEqualTo(906609);
    }
}
