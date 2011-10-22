package se.fredberg.euler.matcher;

public class PalindromeMatcher implements Matcher<Integer> {
    
    @Override
    public boolean matches(Integer i) {
        String string = i.toString();
        String reverseString = new StringBuffer(string).reverse().toString();
        return string.equals(reverseString);
    }
}
