package se.fredberg.euler;

import se.fredberg.euler.generator.ProductGenerator;
import se.fredberg.euler.matcher.PalindromeMatcher;
import se.fredberg.euler.processor.ConditionedProcessor;
import se.fredberg.euler.processor.MaxProcessor;
import se.fredberg.euler.util.LimitedGeneratorLooper;

public class E004 {

    /*
     * A palindromic number reads the same both ways. The largest palindrome
     * made from the product of two 2-digit numbers is 9009 = 91 x 99.
     * 
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) {
        MaxProcessor max = new MaxProcessor();
        PalindromeMatcher matcher = new PalindromeMatcher();
        ConditionedProcessor<Integer> conditionedProcessor = new ConditionedProcessor<Integer>(matcher, max);
        new LimitedGeneratorLooper<Integer>(new ProductGenerator(100, 999), conditionedProcessor).run();
        System.out.println(max.getResult());
    }
}
