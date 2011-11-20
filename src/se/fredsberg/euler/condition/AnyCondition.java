package se.fredsberg.euler.condition;

import java.util.LinkedList;

public class AnyCondition<T> implements Condition<T> {

    private final LinkedList<Condition<T>> conditions = new LinkedList<Condition<T>>();
    
    public AnyCondition<T> add(Condition<T> matcher) {
        conditions.add(matcher);
        return this;
    }

    @Override
    public boolean forfilledBy(T arg) {
        for (Condition<T> condition : conditions) {
            if (condition.forfilledBy(arg)) {
                return true;
            }
        }
        return false;
    }

}
