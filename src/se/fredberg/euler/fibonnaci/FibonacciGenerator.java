package se.fredberg.euler.fibonnaci;

import java.util.Stack;

import se.fredberg.euler.util.Generator;

public class FibonacciGenerator implements Generator<Integer> {

    private Stack<Integer> fibonaccieNumbers;

    public FibonacciGenerator() {
        fibonaccieNumbers = new Stack<Integer>();
    }

    @Override
    public Integer next() {
        int size = fibonaccieNumbers.size();
        int next;
        if (size < 2) {
            next = size + 1;
        } else {
            int last = fibonaccieNumbers.pop();
            next = last + fibonaccieNumbers.pop();
            fibonaccieNumbers.add(last);
        }
        fibonaccieNumbers.add(next);
        return next;
    }
}
