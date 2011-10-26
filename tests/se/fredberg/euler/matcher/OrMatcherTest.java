package se.fredberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

public class OrMatcherTest {

    @Test
    public void checkCases2() {
        assertThat(new OrMatcher<Integer>().add(new AlwaysMatcher<Integer>()).add(new AlwaysMatcher<Integer>()).matches(1)).isTrue();
        assertThat(new OrMatcher<Integer>().add(new NeverMatcher<Integer>()).add(new AlwaysMatcher<Integer>()).matches(1)).isTrue();
        assertThat(new OrMatcher<Integer>().add(new AlwaysMatcher<Integer>()).add(new NeverMatcher<Integer>()).matches(1)).isTrue();
        assertThat(new OrMatcher<Integer>().add(new NeverMatcher<Integer>()).add(new NeverMatcher<Integer>()).matches(1)).isFalse();
    }
}
