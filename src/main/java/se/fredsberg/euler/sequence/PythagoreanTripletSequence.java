package se.fredsberg.euler.sequence;

import java.util.Arrays;
import java.util.List;

public class PythagoreanTripletSequence implements Sequence<List<Integer>> {

    /**
     * A Pythagorean triplet is a set of three natural numbers, a b c, for
     * which,
     * 
     * a**2 + b**2 = c**2 For example, 32 + 42 = 9 + 16 = 25 = 5**2.
     */

    private int c = 5;
    private int a = 1;

    @Override
    public List<Integer> next() {
        while (true) {
            while (c - a > 1) {
                a++;
                List<Integer> triplet = createTriplet();
                if (triplet != null) {
                    return triplet;
                }
            }
            a = 1;
            c++;
        }
    }

    private List<Integer> createTriplet() {
        int b = calculateBSide();
        if (b < a) { // Avoid invalid b:s and duplicates
            return null;
        }
        return Arrays.asList(a, b, c);
    }

    private int calculateBSide() {
        int bb = c * c - a * a;
        int b = (int) Math.sqrt(bb);
        if (b * b != bb) { // Not a square
            return -1;
        }
        return b;
    }

}
