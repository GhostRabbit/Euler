package se.fredberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;


public class Problem001Test {

    @Test
    public void solve() {
        assertThat(new Problem001().solve()).isEqualTo(233168);
    }
}
