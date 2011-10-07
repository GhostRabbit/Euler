package se.fredberg.euler.prime;

import static org.mockito.Mockito.*;

import org.junit.Test;


public class LinkedPrimesGeneratorTest {

    @Test
    public void shouldUseGeneratorToGetNumbers() {
       Generator generator = mock(Generator.class);
       LinkedPrimesGenerator primes = new LinkedPrimesGenerator(generator);
       primes.next();
       verify(generator).next();
    }
    
    @Test
    public void shouldCreateFilterForNumber() {
        FilterFactory factory = mock(FilterFactory.class);
        NumberGenerator generator = new NumberGenerator(2);
        LinkedPrimesGenerator primes = new LinkedPrimesGenerator(generator, factory);
        primes.next();
        verify(factory).createFilter(2, generator);
    }
}
