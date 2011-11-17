package se.fredsberg.euler.util;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.generator.NaturalNumberGenerator;
import se.fredsberg.euler.matcher.EvenDivisorMatcher;
import se.fredsberg.euler.matcher.Matcher;
import se.fredsberg.euler.util.FindLooper;


public class FindLooperTest {

    @Test(invocationTimeOut = 100)
    public void find() {
        Matcher<Integer> matches3 = new EvenDivisorMatcher(3);
        NaturalNumberGenerator generator = new NaturalNumberGenerator();
        generator.next(); // Bypass 0
        FindLooper finder = new FindLooper(matches3, generator);
        assertThat(finder.finds()).isEqualTo(3);
    }
}
