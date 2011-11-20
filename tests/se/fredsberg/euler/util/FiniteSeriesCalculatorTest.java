package se.fredsberg.euler.util;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.FiniteSequence;
import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.util.FiniteSeriesCalculator;

public class FiniteSeriesCalculatorTest {

    @Mock
    FiniteSequence<Integer> generator;
    @Mock
    Series<Integer> processor;
    private FiniteSeriesCalculator<Integer> looper;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        looper = new FiniteSeriesCalculator<Integer>(generator, processor);
    }

    @Test
    public void noLoops() {
        when(generator.hasNext()).thenReturn(false);
        looper.run();
        verify(generator).hasNext();
        verifyNoMoreInteractions(processor);
    }

    @Test
    public void twoLoops() {
        when(generator.hasNext()).thenReturn(true).thenReturn(true).thenReturn(false);
        looper.run();
        verify(generator, times(3)).hasNext();
        verify(generator, times(2)).next();
        verify(processor, times(2)).process(anyInt());
    }

}
