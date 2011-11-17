package se.fredsberg.euler.matcher;

import java.util.List;

public class ListSumMatcher implements Matcher<List<Integer>>{

    private final int targetSum;

    public ListSumMatcher(int targetSum) {
        this.targetSum = targetSum;
    }

    @Override
    public boolean matches(List<Integer> list) {
        int sum = 0;
        for (Integer x : list) {
            sum += x;
        }
        return sum == targetSum;
    }
}
