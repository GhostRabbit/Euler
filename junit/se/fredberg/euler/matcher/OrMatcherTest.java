package se.fredberg.euler.matcher;

import static org.junit.Assert.*;

import org.junit.Test;


public class OrMatcherTest {

    @Test
    public void checkCases() {
        assertTrue(new OrMatcher<Integer>(new AlwaysMatcher<Integer>(), new AlwaysMatcher<Integer>()).matches(1));
        assertTrue(new OrMatcher<Integer>(new NeverMatcher<Integer>(), new AlwaysMatcher<Integer>()).matches(1));
        assertTrue(new OrMatcher<Integer>(new AlwaysMatcher<Integer>(), new NeverMatcher<Integer>()).matches(1));
        assertFalse(new OrMatcher<Integer>(new NeverMatcher<Integer>(), new NeverMatcher<Integer>()).matches(1));
    }
    
}
