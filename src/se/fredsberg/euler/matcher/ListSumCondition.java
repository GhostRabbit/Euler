package se.fredsberg.euler.matcher;

import java.util.List;

public class ListSumCondition implements Condition<List<Integer>>{

    private final int targetSum;

    public ListSumCondition(int targetSum) {
        this.targetSum = targetSum;
    }

    @Override
    public boolean forfilledBy(List<Integer> list) {
        int sum = 0;
        for (Integer x : list) {
            sum += x;
        }
        return sum == targetSum;
    }
}
