package se.fredsberg.euler.problem;

import se.fredsberg.euler.function.Function;
import se.fredsberg.euler.function.Square;
import se.fredsberg.euler.generator.LimitedGenerator;
import se.fredsberg.euler.generator.LimitedNumberGenerator;
import se.fredsberg.euler.processor.Processor;
import se.fredsberg.euler.processor.SumOfFunctionProcessor;
import se.fredsberg.euler.processor.SumProcessor;
import se.fredsberg.euler.util.LimitedGeneratorLooper;


public class Problem006 implements Problem {

    /**
     * The sum of the squares of the first ten natural numbers is,
     * 
     * 1***2 + 2**2 + ... + 10**2 = 385 The square of the sum of the first ten
     * natural numbers is,
     * 
     * (1 + 2 + ... + 10)**2 = 552 = 3025 Hence the difference between the sum
     * of the squares of the first ten natural numbers and the square of the sum
     * is 3025-385 = 2640.
     * 
     * Find the difference between the sum of the squares of the first one
     * hundred natural numbers and the square of the sum.
     */
    
    @Override
    public long solve() {
        int x = 100;
        long a = sumOfSquares(1, x);
        long b = squareOfSum(1, x);
        return b - a;
    }
    
    long sumOfSquares(int from, int to) {
        LimitedGenerator<Integer> generator = new LimitedNumberGenerator(from, to);
        Processor<Integer> processor = new SumOfFunctionProcessor(new Square());
        LimitedGeneratorLooper<Integer> looper = new LimitedGeneratorLooper<Integer>(generator, processor);
        looper.run();
        return processor.getResult();
    }

    long squareOfSum(int from, int to) {
        long sum = sumOf(from, to);
        return sum * sum;
    }
    
    private long sumOf(int from, int to) {
        LimitedGenerator<Integer> generator = new LimitedNumberGenerator(from, to);
        Processor<Integer> processor = new SumProcessor();
        LimitedGeneratorLooper<Integer> looper = new LimitedGeneratorLooper<Integer>(generator, processor);
        looper.run();
        return processor.getResult();
    }
}
