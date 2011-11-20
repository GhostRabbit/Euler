package se.fredsberg.euler.condition;

import se.fredsberg.euler.function.Function;

public class ConditionOverFunction<T> implements Condition<T> {

    private final Condition<T> condition;
    private final Function<T> function;

    public ConditionOverFunction(Condition<T> condition, Function<T> function) {
        this.condition = condition;
        this.function = function;
        
    }

    @Override
    public boolean forfilledBy(T arg) {
        return condition.forfilledBy(function.calculate(arg));
    }

}
