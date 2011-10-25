package se.fredberg.euler;

import se.fredberg.euler.generator.ProductGenerator;
import se.fredberg.euler.matcher.PalindromeMatcher;
import se.fredberg.euler.processor.ConditionedProcessor;
import se.fredberg.euler.processor.MaxProcessor;
import se.fredberg.euler.util.LimitedGeneratorLooper;

public class E004 {

    /**
     * A palindromic number reads the same both ways. The largest palindrome
     * made from the product of two 2-digit numbers is 9009 = 91 x 99.
     * 
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    
    public static void main(String[] args) {
        ConditionedProcessor<Integer> largestPalindoneFinder = largestPalindoneFinder();
        new LimitedGeneratorLooper<Integer>(new ProductGenerator(100, 999), largestPalindoneFinder).run();
        System.out.println(largestPalindoneFinder.getResult());
    }

    private static ConditionedProcessor<Integer> largestPalindoneFinder() {
        MaxProcessor largestPalindrome = new MaxProcessor();
        PalindromeMatcher isPalindrome = new PalindromeMatcher();
        return new ConditionedProcessor<Integer>(isPalindrome, largestPalindrome);
    }
}
