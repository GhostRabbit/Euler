package se.fredsberg.euler.problem;

import java.util.HashMap;
import java.util.Map;

public class Problem014 implements Problem {

    /**
     * The following iterative sequence is defined for the set of positive
     * integers:
     * 
     * <pre>
     * n -> n/2 (n is even)
     * n -> 3n + 1 (n is odd)
     * </pre>
     * 
     * Using the rule above and starting with 13, we generate the following
     * sequence:
     * 
     * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 It can be seen that
     * this sequence (starting at 13 and finishing at 1) contains 10 terms.
     * Although it has not been proved yet (Collatz Problem), it is thought that
     * all starting numbers finish at 1.
     * 
     * Which starting number, under one million, produces the longest chain?
     * 
     * NOTE: Once the chain starts the terms are allowed to go above one
     * million.
     */

    @Override
    public long solve() {
        int limit = 1000000;
        final Map<Long, Long> cachedValues = new ValueCache(limit);
        cachedValues.put(1L, 1L);

        return calculate(cachedValues, 1, limit);
    }

    private Long calculate(Map<Long, Long> cachedSolutions, int start, int end) {
        Solution solutionCandidate = new Solution();
        for (long number = start; number < end; number++) {
            solutionCandidate.challange(getStepCount(number, cachedSolutions), number);
        }
        return solutionCandidate.forNumber;
    }

    private Long getStepCount(Long x, Map<Long, Long> cachedSolutions) {
        Long cachedValue = cachedSolutions.get(x);
        if (cachedValue != null) {
            return cachedValue;
        }
        Long value = nextCollatz(x);
        Long stepCount = getStepCount(value, cachedSolutions) + 1;
        cachedSolutions.put(value, stepCount);
        return stepCount;
    }

    private Long nextCollatz(Long x) {
        if (x % 2 == 0) {
            return x / 2;
        }
        return 3 * x + 1;
    }

    private class ValueCache extends HashMap<Long, Long> {

        private static final long serialVersionUID = 1L;
        private final Long limit;

        ValueCache(int limit) {
            super((int) (limit * 1.5));
            this.limit = (long) limit;
        }

        @Override
        public Long put(Long key, Long value) {
            if (limit.compareTo(key) < 0) {
                return null;
            }
            return super.put(key, value);
        }
    }

    private class Solution {
        public long max = 0L;
        public long forNumber = 0L;

        public void challange(Long newMax, long i) {
            if (max < newMax) {
                max = newMax;
                forNumber = i;
            }
        }
    }

}
