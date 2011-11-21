package se.fredsberg.euler.util;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.util.FiniteSequenceCalculator;

public class FiniteSequenceCalculatorTest {

    @Mock
    FiniteSequence<Integer> sequence;
    @Mock
    Series<Integer> series;
    private FiniteSequenceCalculator<Integer> calculator;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        calculator = new FiniteSequenceCalculator<Integer>(sequence, series);
    }

    @Test
    public void noLoops() {
        when(sequence.hasNext()).thenReturn(false);
        calculator.calculateSeries();
        verify(sequence).hasNext();
        verifyNoMoreInteractions(series);
    }

    @Test
    public void twoLoops() {
        when(sequence.hasNext()).thenReturn(true).thenReturn(true).thenReturn(false);
        calculator.calculateSeries();
        verify(sequence, times(3)).hasNext();
        verify(sequence, times(2)).next();
        verify(series, times(2)).process(anyInt());
    }

}
