package se.fredsberg.euler.function;

import static org.fest.assertions.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import se.fredsberg.euler.sequence.FiniteSequence;

// @RunWith(MockitoJUnitRunner.class)
public class ProductOverSequenceFunctionTest {

    @Mock
    private FiniteSequence<Number> sequence;

    @BeforeMethod
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testAFewValues() {
        ProductOverSequenceFunction<Number> function = new ProductOverSequenceFunction<Number>();
        doReturn(true).doReturn(true).doReturn(false).when(sequence).hasNext();
        doReturn(2).doReturn(3).when(sequence).next();
        assertThat(function.calculate(sequence)).isEqualTo(6);
    }
}
