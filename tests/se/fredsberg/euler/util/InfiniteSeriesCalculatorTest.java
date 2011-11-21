package se.fredsberg.euler.util;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.sequence.Sequence;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.util.InfiniteSeriesCalculator;

public class InfiniteSeriesCalculatorTest {

    @Mock
    Sequence<Integer> sequence;
    @Mock
    Series<Integer> series;
    @Mock
    Condition<Integer> condition;
    private InfiniteSeriesCalculator<Integer> calculator;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        calculator = new InfiniteSeriesCalculator<Integer>(sequence, condition, series);
    }

    @Test
    public void noLoops() {
        when(condition.forfilledBy(anyInt())).thenReturn(false);
        calculator.calculateSeries();
        verify(sequence).next();
        verify(condition).forfilledBy(anyInt());
        verifyNoMoreInteractions(series);
    }

    @Test
    public void twoLoops() {
        when(condition.forfilledBy(anyInt())).thenReturn(true).thenReturn(true).thenReturn(false);
        calculator.calculateSeries();
        verify(sequence, times(3)).next();
        verify(condition, times(3)).forfilledBy(anyInt());
        verify(series, times(2)).process(anyInt());
    }
}
