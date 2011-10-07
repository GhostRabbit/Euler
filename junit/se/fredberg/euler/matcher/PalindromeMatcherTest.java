package se.fredberg.euler.matcher;

import static org.junit.Assert.*;

import org.junit.Test;

import se.fredberg.euler.matcher.PalindromeMatcher;


public class PalindromeMatcherTest {

   @Test
   public void matching() {
       PalindromeMatcher matcher = new PalindromeMatcher();
       assertTrue(matcher.matches(1001));
       assertFalse(matcher.matches(101201));
       assertTrue(matcher.matches(123321));
   }
}
