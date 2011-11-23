package se.fredsberg.euler.problem;

import org.testng.annotations.Test;
import static org.fest.assertions.Assertions.*;


public class Problem008Test {

    @Test
    public void solve() {
        assertThat(new Problem008().solve()).isEqualTo(40824L);
    }
    
}
