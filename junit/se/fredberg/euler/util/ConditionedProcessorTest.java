package se.fredberg.euler.util;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import se.fredberg.euler.matcher.AlwaysMatcher;
import se.fredberg.euler.matcher.NeverMatcher;

public class ConditionedProcessorTest {

    @Mock
    Processor<Integer> p;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getResultsFromAggrigate() {
        ConditionedProcessor<Integer> cp = new ConditionedProcessor<Integer>(p, null);
        cp.getResult();
        verify(p).getResult();
    }

    @Test
    public void processPassedToAggrigateIfMatcherMatches() {
        ConditionedProcessor<Integer> cp = new ConditionedProcessor<Integer>(p, new AlwaysMatcher<Integer>());
        cp.process(1);
        verify(p).process(1);
    }

    @Test
    public void processNotPassedToAggrigateIfMatcherDoesNotMatch() {
        ConditionedProcessor<Integer> cp = new ConditionedProcessor<Integer>(p, new NeverMatcher<Integer>());
        cp.process(1);
        verifyNoMoreInteractions(p);
    }

}
