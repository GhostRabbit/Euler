package se.fredsberg.euler.condition;

public class PalindromeCondition<T extends Number> implements Condition<T> {

    @Override
    public boolean forfilledBy(T i) {
        String string = i.toString();
        String reverseString = new StringBuilder(string).reverse().toString();
        return string.equals(reverseString);
    }
}
