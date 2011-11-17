package se.fredsberg.euler.util;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.generator.LimitedGenerator;
import se.fredsberg.euler.processor.Processor;
import se.fredsberg.euler.util.LimitedGeneratorLooper;

public class LimitedGeneratorLooperTest {

    @Mock
    LimitedGenerator<Integer> generator;
    @Mock
    Processor<Integer> processor;
    private LimitedGeneratorLooper<Integer> looper;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        looper = new LimitedGeneratorLooper<Integer>(generator, processor);
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
