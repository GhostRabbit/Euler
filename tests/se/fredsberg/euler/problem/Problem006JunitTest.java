package se.fredsberg.euler.problem;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Problem006JunitTest {

    private Problem006 problem;

    @BeforeMethod
    public void setUp() {
        problem = new Problem006();
    }
    
    @Test
    public void squareOfSum() throws Exception {
        assertThat(problem.squareOfSum(1, 100)).isEqualTo(25502500L);
    }
    
    @Test
    public void sumOfSquares() throws Exception {
        assertThat(problem.sumOfSquares(1, 100)).isEqualTo(338350L);
    }
    
}
