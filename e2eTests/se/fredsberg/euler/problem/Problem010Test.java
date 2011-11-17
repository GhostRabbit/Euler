package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.problem.Problem010;


public class Problem010Test {

    @Test
    public void solve() {
        assertThat(new Problem010().solve()).isEqualTo(142913828922L);
    }
    
   @Test
   public void performance() {
       for (int i = 0; i < 200; i++) {
           new Problem010().solve();
       }
   }
}
