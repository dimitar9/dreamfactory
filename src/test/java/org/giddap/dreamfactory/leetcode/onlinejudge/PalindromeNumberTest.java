package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.PalindromeNumberImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber = new PalindromeNumberImpl();

    @Test
    public void small01() {
        assertEquals(true, palindromeNumber.isPalindrome(0));
    }

    @Test
    public void small02() {
        assertEquals(true, palindromeNumber.isPalindrome(5));
    }

    @Test
    public void small03() {
        assertEquals(false, palindromeNumber.isPalindrome(10));
    }

    @Test
    public void small04() {
        assertEquals(true, palindromeNumber.isPalindrome(121));
    }

    @Test
    public void small05() {
        assertEquals(true, palindromeNumber.isPalindrome(2332));
    }

    @Test
    public void small06() {
        assertEquals(false, palindromeNumber.isPalindrome(12343));
    }

    @Test
    public void small07() {
        assertEquals(false, palindromeNumber.isPalindrome(-101));
    }

    @Test
    public void small08() {
        assertEquals(false, palindromeNumber.isPalindrome(500));
    }

    @Test
    public void small09() {
        assertEquals(false, palindromeNumber.isPalindrome(1000021));
    }

    @Test
    public void small10() {
        assertEquals(true, palindromeNumber.isPalindrome(1001001));
    }
}
