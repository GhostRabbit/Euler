package se.fredsberg.euler.problem;

import java.util.List;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.condition.ListSumCondition;
import se.fredsberg.euler.sequence.PythagoreanTripletSequence;

public class Problem009 implements Problem {

    /**
     * A Pythagorean triplet is a set of three natural numbers, a b c, for
     * which,
     * 
     * a**2 + b**2 = c**2 For example, 32 + 42 = 9 + 16 = 25 = 5**2.
     * 
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product a*b*c.
     */

    @Override
    public long solve() {
        PythagoreanTripletSequence sequence = new PythagoreanTripletSequence();
        Condition<List<Integer>> condition = new ListSumCondition(1000);
        while (true) {
            // TODO Searches sequence for a match, a SequenceSearch?
            List<Integer> triplet = sequence.next();
            if (condition.forfilledBy(triplet)) {
                return triplet.get(0) * triplet.get(1) * triplet.get(2);
            }
        }
    }
}
