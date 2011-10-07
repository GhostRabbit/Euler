package se.fredberg.euler;

import java.util.Arrays;
import java.util.List;

import se.fredberg.euler.util.ListSumMatcher;

public class E009 {

    /*
     * A Pythagorean triplet is a set of three natural numbers, a b c, for
     * which,
     * 
     * a**2 + b**2 = c**2 For example, 32 + 42 = 9 + 16 = 25 = 5**2.
     * 
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
     */

    public static void main(String[] args) {
        ListSumMatcher matcher = new ListSumMatcher(1000);
        List<Integer> triplet = new E009().findTriplets(matcher);
        System.out.println(triplet.get(0) * triplet.get(1) * triplet.get(2));
    }

    private List<Integer> findTriplets(ListSumMatcher matcher) {
        int c = 4;
        while (c++ < 1000) {
            for (int a = 1; a < c; a++) {
                int bb = c * c - a * a;
                int b = (int) Math.sqrt(bb);
                if (b >= a) {
                    continue;
                }
                if (b * b != bb) { // Not a square
                    continue;
                }
                List<Integer> triplet = Arrays.asList(b, a, c);
                if (matcher.matches(triplet)) {
                    return triplet;
                }
            }
        }
        return null;
    }
}
