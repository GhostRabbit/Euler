package se.fredberg.euler;

import java.util.LinkedList;
import java.util.List;

import se.fredberg.euler.matcher.PalindromeMatcher;

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
        List<Integer> palindromes = e004.findPalindromes(products);
        System.out.println(max(palindromes));
    }

    static Integer max(List<Integer> palindromes) {
        Integer max = Integer.MIN_VALUE;
        for (Integer i : palindromes) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    private static List<Integer> filterPalindromes(List<Integer> products, PalindromeMatcher matcher) {
        List<Integer> palindromes = new LinkedList<Integer>();
        for (Integer i : products) {
            if (matcher.matches(i)) {
                palindromes.add(i);
            }
        }
        return palindromes;
    }

    List<Integer> findPalindromes(List<Integer> products) {
        return filterPalindromes(products, new PalindromeMatcher());
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
