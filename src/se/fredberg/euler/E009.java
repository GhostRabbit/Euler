package se.fredberg.euler;

import java.util.Arrays;
import java.util.List;

import se.fredberg.euler.matcher.ListSumMatcher;
import se.fredberg.euler.matcher.Matcher;

public class E009 {

    /*
     * A Pythagorean triplet is a set of three natural numbers, a b c, for
     * which,
     * 
     * a**2 + b**2 = c**2 For example, 32 + 42 = 9 + 16 = 25 = 5**2.
     * 
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product a*b*c.
     */

    public static void main(String[] args) {
        Matcher<List<Integer>> matcher = new ListSumMatcher(1000);
        List<Integer> triplet = new E009().findTriplets(matcher);
        System.out.println(triplet.get(0) * triplet.get(1) * triplet.get(2));
    }

    private List<Integer> findTriplets(Matcher<List<Integer>> matcher) {
        int c = 4;
        while (c++ < 1000) {
            for (int a = 1; a < c; a++) {
                List<Integer> triplet = createTriplet(c, a);
                if (triplet != null && matcher.matches(triplet)) {
                    return triplet;
                }
            }
        }
        return null;
    }

    private List<Integer> createTriplet(int c, int a) {
        int bb = c * c - a * a;
        int b = (int) Math.sqrt(bb);
        if (b >= a) { // Avoid duplicates
            return null;
        }
        if (b * b != bb) { // Not a square
            return null;
        }
        return Arrays.asList(b, a, c);
    }
}
