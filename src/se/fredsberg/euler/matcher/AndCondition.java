package se.fredsberg.euler.matcher;

import java.util.LinkedList;

public class AndCondition<T> implements Condition<T> {

    private final LinkedList<Condition<T>> conditions = new LinkedList<Condition<T>>();
    
    public AndCondition<T> add(Condition<T> matcher) {
        conditions.add(matcher);
        return this;
    }

    @Override
    public boolean forfilledBy(T arg) {
        for (Condition<T> condition : conditions) {
            if (!condition.forfilledBy(arg)) {
                return false;
            }
        }
        return true;
    }

}