package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.problem.Problem002;


public class Problem002Test {

    @Test
    public void solve() {
        assertThat(new Problem002().solve()).isEqualTo(4613732);
    }
}
