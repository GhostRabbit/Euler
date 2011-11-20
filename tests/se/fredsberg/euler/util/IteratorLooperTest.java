package se.fredsberg.euler.util;

import static org.mockito.Mockito.*;

import java.util.Collections;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.series.Series;
import se.fredsberg.euler.util.IteratorLooper;

public class IteratorLooperTest {

    @Mock
    Series<Integer> series;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void emptyList() {
        new IteratorLooper<Integer>(Collections.<Integer> emptyList(), series).run();
        verifyNoMoreInteractions(series);
    }

    @Test
    public void oneList() {
        new IteratorLooper<Integer>(Collections.singleton(1), series).run();
        verify(series).process(1);
    }

}
