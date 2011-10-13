package se.fredberg.euler;

import java.util.ArrayList;
import java.util.List;

import se.fredberg.euler.matcher.EvenMatcher;

public class E002 {
    /*
     * Each new term in the Fibonacci sequence is generated by adding the
     * previous two terms. By starting with 1 and 2, the first 10 terms will be:
     * 
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     * 
     * By considering the terms in the Fibonacci sequence whose values do not
     * exceed four million, find the sum of the even-valued terms.
     */

    public static void main(String[] args) {
        System.out.println(new E002().solve());
    }

    private long solve() {
        List<Integer> sequence = getFibonacciSequence(4000000);
        return sumEvenEntries(sequence);
    }

    long sumEvenEntries(List<Integer> sequence) {
        return sum(filter(sequence, new EvenMatcher()));
    }

    private long sum(List<Integer> filter) {
        long sum = 0L;
        for (int i : filter) {
            sum += i;
        }
        return sum;
    }

    private List<Integer> filter(List<Integer> sequence, EvenMatcher evenMatcher) {
        List<Integer> filtered = new ArrayList<Integer>();
        for (Integer i : sequence) {
            if (evenMatcher.matches(i)) {
                filtered.add(i);
            }
        }
        return filtered;
    }

    List<Integer> getFibonacciSequence(int limit) {
        List<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(2);
        while (true) {
            int next = sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
            if (next > limit) {
                break;
            }
            sequence.add(next);
        }
        return sequence;
    }
}