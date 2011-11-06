package se.fredberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;


public class Problem010Test {

    @Test
    public void solve() {
        assertThat(new Problem010().solve()).isEqualTo(142913828922L);
    }
}
