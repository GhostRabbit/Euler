package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class AnyConditionTest {

    private AnyCondition<Integer> condition;

    @Before
    public void setup() {
        condition = new AnyCondition<Integer>();
    }

    @Test
    public void checkCasesBothTrue() {
        assertThat(condition.add(new AlwaysMatcher<Integer>()).add(new AlwaysMatcher<Integer>()).forfilledBy(1)).isTrue();
    }

    @Test
    public void checkCasesOneFalseOneTrue() {
        assertThat(condition.add(new NeverMatcher<Integer>()).add(new AlwaysMatcher<Integer>()).forfilledBy(1)).isTrue();
    }

    @Test
    public void checkCasesOneTrueOneFalse() {
        assertThat(condition.add(new AlwaysMatcher<Integer>()).add(new NeverMatcher<Integer>()).forfilledBy(1)).isTrue();
    }

    @Test
    public void checkCasesBothFalse() {
        assertThat(condition.add(new NeverMatcher<Integer>()).add(new NeverMatcher<Integer>()).forfilledBy(1)).isFalse();
    }
}
