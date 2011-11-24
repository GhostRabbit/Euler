package se.fredsberg.euler.function;

import static org.fest.assertions.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import se.fredsberg.euler.sequence.FiniteSequence;

@RunWith(MockitoJUnitRunner.class)
public class ProductOverSequenceFunctionTest {

    @Mock
    private FiniteSequence<Number> sequence;

    @Test
    public void testAFewValues() {
        ProductOverSequenceFunction<Number> function = new ProductOverSequenceFunction<Number>();
        doReturn(true).doReturn(true).doReturn(false).when(sequence).hasNext();
        doReturn(2).doReturn(3).when(sequence).next();
        assertThat(function.calculate(sequence)).isEqualTo(6);
    }
}
