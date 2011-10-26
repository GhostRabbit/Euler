package se.fredberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

public class OrMatcherTest {

    @Test
    public void checkCases() {
        assertThat(new OrMatcher<Integer>(new AlwaysMatcher<Integer>(), new AlwaysMatcher<Integer>()).matches(1)).isTrue();
        assertThat(new OrMatcher<Integer>(new NeverMatcher<Integer>(), new AlwaysMatcher<Integer>()).matches(1)).isTrue();
        assertThat(new OrMatcher<Integer>(new AlwaysMatcher<Integer>(), new NeverMatcher<Integer>()).matches(1)).isTrue();
        assertThat(new OrMatcher<Integer>(new NeverMatcher<Integer>(), new NeverMatcher<Integer>()).matches(1)).isFalse();
    }

    // @Test(expected = IllegalArgumentException.class)
    // public void requireAtLeastTwoMatchers() {
    //
    // }

}
