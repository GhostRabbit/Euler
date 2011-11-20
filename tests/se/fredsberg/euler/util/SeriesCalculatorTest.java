package se.fredsberg.euler.util;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.matcher.Condition;
import se.fredsberg.euler.sequence.Sequence;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.util.SeriesCalculator;

public class SeriesCalculatorTest {

    @Mock
    Sequence<Integer> sequence;
    @Mock
    Series<Integer> series;
    @Mock
    Condition<Integer> condition;
    private SeriesCalculator<Integer> calculator;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        calculator = new SeriesCalculator<Integer>(sequence, condition, series);
    }

    @Test
    public void noLoops() {
        when(condition.forfilledBy(anyInt())).thenReturn(false);
        calculator.run();
        verify(sequence).next();
        verify(condition).forfilledBy(anyInt());
        verifyNoMoreInteractions(series);
    }

    @Test
    public void twoLoops() {
        when(condition.forfilledBy(anyInt())).thenReturn(true).thenReturn(true).thenReturn(false);
        calculator.run();
        verify(sequence, times(3)).next();
        verify(condition, times(3)).forfilledBy(anyInt());
        verify(series, times(2)).process(anyInt());
    }
}
