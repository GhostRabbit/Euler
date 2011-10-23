package se.fredberg.euler.util;

import static org.mockito.Mockito.*;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import se.fredberg.euler.processor.Processor;

public class IteratorLooperTest {

    @Mock
    Processor<Integer> processor;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void emptyList() {
        new IteratorLooper<Integer>(Collections.<Integer>emptyList(), processor).run();
        verifyNoMoreInteractions(processor);
    }

    @Test
    public void oneList() {
        new IteratorLooper<Integer>(Collections.singleton(1), processor).run();
        verify(processor).process(1);
    }

}
