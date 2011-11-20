package se.fredsberg.euler.problem;

import se.fredsberg.euler.matcher.PalindromeCondition;
import se.fredsberg.euler.sequence.ProductSequence;
import se.fredsberg.euler.series.ConditionedSeries;
import se.fredsberg.euler.series.MaxValueFoundInSequence;
import se.fredsberg.euler.util.FiniteSeriesCalculator;

public class Problem004 implements Problem {

    /**
     * A palindromic number reads the same both ways. The largest palindrome
     * made from the product of two 2-digit numbers is 9009 = 91 x 99.
     * 
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */

    @Override
    public long solve() {
        ConditionedSeries<Integer> largestPalindoneFinder = largestPalindoneFinder();
        new FiniteSeriesCalculator<Integer>(new ProductSequence(100, 999), largestPalindoneFinder).run();
        return largestPalindoneFinder.getResult();
    }
    
    private static ConditionedSeries<Integer> largestPalindoneFinder() {
        MaxValueFoundInSequence largestPalindrome = new MaxValueFoundInSequence();
        PalindromeCondition isPalindrome = new PalindromeCondition();
        return new ConditionedSeries<Integer>(isPalindrome, largestPalindrome);
    }
}
