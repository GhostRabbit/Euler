package se.fredsberg.euler.util;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.generator.Generator;
import se.fredsberg.euler.matcher.Matcher;
import se.fredsberg.euler.processor.Processor;
import se.fredsberg.euler.util.GeneratorLooper;

public class GeneratorLooperTest {

    @Mock
    Generator<Integer> generator;
    @Mock
    Processor<Integer> processor;
    @Mock
    Matcher<Integer> matcher;
    private GeneratorLooper<Integer> looper;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        looper = new GeneratorLooper<Integer>(generator, matcher, processor);
    }

    @Test
    public void noLoops() {
        when(matcher.matches(anyInt())).thenReturn(false);
        looper.run();
        verify(generator).next();
        verify(matcher).matches(anyInt());
        verifyNoMoreInteractions(processor);
    }

    @Test
    public void twoLoops() {
        when(matcher.matches(anyInt())).thenReturn(true).thenReturn(true).thenReturn(false);
        looper.run();
        verify(generator, times(3)).next();
        verify(matcher, times(3)).matches(anyInt());
        verify(processor, times(2)).process(anyInt());
    }
}
