package se.fredsberg.euler.function;

import se.fredsberg.euler.sequence.finite.FiniteSequence;

public interface FunctionOfSequence<T extends Number> {

    Long calculate(FiniteSequence<T> sequence);
}
