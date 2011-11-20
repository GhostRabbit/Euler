package se.fredsberg.euler.processor;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import se.fredsberg.euler.matcher.AlwaysMatcher;
import se.fredsberg.euler.matcher.NeverMatcher;
import se.fredsberg.euler.series.ConditionedSeries;
import se.fredsberg.euler.series.Series;

public class ConditionedSeriesTest {

    @Mock
    Series<Integer> series;

    @BeforeMethod
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
