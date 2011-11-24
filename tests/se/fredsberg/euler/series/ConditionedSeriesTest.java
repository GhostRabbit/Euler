package se.fredsberg.euler.series;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import se.fredsberg.euler.condition.AlwaysMatcher;
import se.fredsberg.euler.condition.NeverMatcher;

public class ConditionedSeriesTest {

    @Mock
    Series<Integer> series;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getResultsFromAggrigate() {
        ConditionedSeries<Integer> cs = new ConditionedSeries<Integer>(null, series);
        cs.getResult();
        verify(series).getResult();
    }

    @Test
    public void processPassedToAggrigateIfMatcherMatches() {
        ConditionedSeries<Integer> cs = new ConditionedSeries<Integer>(new AlwaysMatcher<Integer>(), series);
        cs.process(1);
        verify(series).process(1);
    }

    @Test
    public void processNotPassedToAggrigateIfMatcherDoesNotMatch() {
        ConditionedSeries<Integer> cs = new ConditionedSeries<Integer>(new NeverMatcher<Integer>(), series);
        cs.process(1);
        verifyNoMoreInteractions(series);
    }

}
