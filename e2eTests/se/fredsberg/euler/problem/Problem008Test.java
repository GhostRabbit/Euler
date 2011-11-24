package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class Problem008Test {

    @Test
    public void solve() {
        assertThat(new Problem008().solve()).isEqualTo(40824L);
    }

}
