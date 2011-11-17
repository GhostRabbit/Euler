package se.fredsberg.euler.problem;

import se.fredsberg.euler.generator.ProductGenerator;
import se.fredsberg.euler.matcher.PalindromeMatcher;
import se.fredsberg.euler.processor.ConditionedProcessor;
import se.fredsberg.euler.processor.MaxProcessor;
import se.fredsberg.euler.util.LimitedGeneratorLooper;

public class Problem004 implements Problem {

    /**
     * A palindromic number reads the same both ways. The largest palindrome
     * made from the product of two 2-digit numbers is 9009 = 91 x 99.
     * 
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */

    @Override
    public long solve() {
        ConditionedProcessor<Integer> largestPalindoneFinder = largestPalindoneFinder();
        new LimitedGeneratorLooper<Integer>(new ProductGenerator(100, 999), largestPalindoneFinder).run();
        return largestPalindoneFinder.getResult();
    }
    
    private static ConditionedProcessor<Integer> largestPalindoneFinder() {
        MaxProcessor largestPalindrome = new MaxProcessor();
        PalindromeMatcher isPalindrome = new PalindromeMatcher();
        return new ConditionedProcessor<Integer>(isPalindrome, largestPalindrome);
    }
}
