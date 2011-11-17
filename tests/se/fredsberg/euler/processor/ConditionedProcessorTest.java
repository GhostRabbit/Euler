package se.fredsberg.euler.processor;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import se.fredsberg.euler.matcher.AlwaysMatcher;
import se.fredsberg.euler.matcher.NeverMatcher;
import se.fredsberg.euler.processor.ConditionedProcessor;
import se.fredsberg.euler.processor.Processor;

public class ConditionedProcessorTest {

    @Mock
    Processor<Integer> p;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getResultsFromAggrigate() {
        ConditionedProcessor<Integer> cp = new ConditionedProcessor<Integer>(null, p);
        cp.getResult();
        verify(p).getResult();
    }

    @Test
    public void processPassedToAggrigateIfMatcherMatches() {
        ConditionedProcessor<Integer> cp = new ConditionedProcessor<Integer>(new AlwaysMatcher<Integer>(), p);
        cp.process(1);
        verify(p).process(1);
    }

    @Test
    public void processNotPassedToAggrigateIfMatcherDoesNotMatch() {
        ConditionedProcessor<Integer> cp = new ConditionedProcessor<Integer>(new NeverMatcher<Integer>(), p);
        cp.process(1);
        verifyNoMoreInteractions(p);
    }

}
