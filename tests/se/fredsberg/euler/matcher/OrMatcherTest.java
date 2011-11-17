package se.fredsberg.euler.matcher;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.matcher.OrMatcher;

public class OrMatcherTest {

    private OrMatcher<Integer> matcher;

    @BeforeMethod
    public void setup() {
        matcher = new OrMatcher<Integer>();
    }

    @Test
    public void checkCasesBothTrue() {
        assertThat(matcher.add(new AlwaysMatcher<Integer>()).add(new AlwaysMatcher<Integer>()).matches(1)).isTrue();
    }

    @Test
    public void checkCasesOneFalseOneTrue() {
        assertThat(matcher.add(new NeverMatcher<Integer>()).add(new AlwaysMatcher<Integer>()).matches(1)).isTrue();
    }

    @Test
    public void checkCasesOneTrueOneFalse() {
        assertThat(matcher.add(new AlwaysMatcher<Integer>()).add(new NeverMatcher<Integer>()).matches(1)).isTrue();
    }

    @Test
    public void checkCasesBothFalse() {
        assertThat(matcher.add(new NeverMatcher<Integer>()).add(new NeverMatcher<Integer>()).matches(1)).isFalse();
    }
}
