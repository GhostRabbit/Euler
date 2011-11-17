package se.fredsberg.euler.util;

import static org.mockito.Mockito.*;

import java.util.Collections;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.processor.Processor;
import se.fredsberg.euler.util.IteratorLooper;

public class IteratorLooperTest {

    @Mock
    Processor<Integer> processor;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void emptyList() {
        new IteratorLooper<Integer>(Collections.<Integer> emptyList(), processor).run();
        verifyNoMoreInteractions(processor);
    }

    @Test
    public void oneList() {
        new IteratorLooper<Integer>(Collections.singleton(1), processor).run();
        verify(processor).process(1);
    }

}
