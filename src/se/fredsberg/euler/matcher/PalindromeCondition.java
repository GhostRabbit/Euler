package se.fredsberg.euler.matcher;

public class PalindromeCondition implements Condition<Integer> {
    
    @Override
    public boolean forfilledBy(Integer i) {
        String string = i.toString();
        String reverseString = new StringBuffer(string).reverse().toString();
        return string.equals(reverseString);
    }
}
