package se.fredberg.euler;

import java.util.LinkedList;
import java.util.List;

import se.fredberg.euler.matcher.PalindromeMatcher;
import se.fredberg.euler.processor.ConditionedProcessor;
import se.fredberg.euler.processor.MaxProcessor;
import se.fredberg.euler.util.IteratorLooper;

public class E004 {

    /*
     * A palindromic number reads the same both ways. The largest palindrome
     * made from the product of two 2-digit numbers is 9009 = 91 x 99.
     * 
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) {
        E004 e004 = new E004();
        List<Integer> products = e004.products(100, 999);
        MaxProcessor max = new MaxProcessor();
        PalindromeMatcher matcher = new PalindromeMatcher();
        ConditionedProcessor<Integer> conditionedProcessor = new ConditionedProcessor<Integer>(matcher, max);
        new IteratorLooper<Integer>(products, conditionedProcessor).run();
        System.out.println(max.getResult());
    }

    List<Integer> products(int i, int j) {
        List<Integer> results = new LinkedList<Integer>();
        for (int a = i; a <= j; a++) {
            for (int b = i; b <= j; b++) {
                results.add(a * b);
            }
        }
        return results;
    }
}
