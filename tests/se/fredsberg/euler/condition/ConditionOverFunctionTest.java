package se.fredsberg.euler.condition;

import static org.fest.assertions.Assertions.*;

import org.testng.annotations.Test;

import se.fredsberg.euler.condition.Condition;
import se.fredsberg.euler.condition.ConditionOverFunction;
import se.fredsberg.euler.condition.LessThenCondition;
import se.fredsberg.euler.function.Function;
import se.fredsberg.euler.function.Square;


public class ConditionOverFunctionTest {

    
    @Test
    public void testCreation() {
        Function<Integer> function = new Square();
        Condition<Integer> condition = new LessThenCondition(5);
        Condition<Integer> conditionOverFunction = new ConditionOverFunction<Integer>(condition, function);
        assertThat(conditionOverFunction.forfilledBy(2)).isTrue();
        assertThat(conditionOverFunction.forfilledBy(3)).isFalse();
    }
    
}
