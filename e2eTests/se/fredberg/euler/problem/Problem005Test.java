package se.fredberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;


public class Problem005Test {

    @Test
    public void solve() {
        assertThat(new Problem005().solve()).isEqualTo(232792560);
    }
}
