package se.fredberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;


public class Problem003Test {

    @Test
    public void solve() {
        assertThat(new Problem004().solve()).isEqualTo(906609);
    }
}
