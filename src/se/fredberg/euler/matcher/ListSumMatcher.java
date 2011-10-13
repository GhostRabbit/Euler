package se.fredberg.euler.matcher;

import java.util.List;

public class ListSumMatcher {

    private final int targetSum;

    public ListSumMatcher(int targetSum) {
        this.targetSum = targetSum;
    }

    public boolean matches(List<Integer> list) {
        int sum = 0;
        for (Integer x : list) {
            sum += x;
        }
        return sum == targetSum;
    }
}