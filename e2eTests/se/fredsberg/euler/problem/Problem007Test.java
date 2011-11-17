package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.problem.Problem007;


public class Problem007Test {

    @Test
    public void solve() {
        assertThat(new Problem007().solve()).isEqualTo(104743);
    }
}
