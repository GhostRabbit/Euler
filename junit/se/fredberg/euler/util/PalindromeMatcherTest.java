package se.fredberg.euler.util;

import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeMatcherTest {

   @Test
   public void matching() {
       PalindromeMatcher matcher = new PalindromeMatcher();
       assertTrue(matcher.matches(1001));
       assertFalse(matcher.matches(101201));
       assertTrue(matcher.matches(123321));
   }
}
