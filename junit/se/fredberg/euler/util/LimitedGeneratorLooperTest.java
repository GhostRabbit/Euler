package se.fredberg.euler.util;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import se.fredberg.euler.generator.LimitedGenerator;
import se.fredberg.euler.processor.Processor;

public class LimitedGeneratorLooperTest {

    @Mock
    LimitedGenerator<Integer> generator;
    @Mock
    Processor<Integer> processor;
    private LimitedGeneratorLooper<Integer> looper;

    @Before
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
