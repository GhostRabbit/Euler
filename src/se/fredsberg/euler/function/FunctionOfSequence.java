package se.fredsberg.euler.function;

import se.fredsberg.euler.sequence.FiniteSequence;

public interface FunctionOfSequence<T extends Number> {

    Long calculate(FiniteSequence<T> sequence);
}
