package se.fredberg.euler.matcher;

public class PalindromeMatcher {
    public boolean matches(Integer value) {
        String valueS = value.toString();
        String reverseS = new StringBuffer(valueS).reverse().toString();
        return valueS.equals(reverseS);
    }
}
