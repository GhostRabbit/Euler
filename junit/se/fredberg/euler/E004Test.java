package se.fredberg.euler;

import static org.fest.assertions.Assertions.*;

import java.util.List;

import org.junit.Test;

public class E004Test {

    @Test
    public void products() {
        List<Integer> actual = new E004().products(10,12);
        assertThat(actual).contains(100, 110, 120, 121, 132, 144);
    }
    
    @Test
    public void findPalaindormes() {
        List<Integer> candidates = new E004().products(91, 99);
        System.out.println(new E004().findPalindromes(candidates));
        assertThat(new E004().findPalindromes(candidates)).isNotEmpty();
    }
    
}
