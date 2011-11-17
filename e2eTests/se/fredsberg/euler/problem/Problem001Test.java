package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.problem.Problem001;


public class Problem001Test {

    @Test
    public void solve() {
        assertThat(new Problem001().solve()).isEqualTo(233168);
    }
}
