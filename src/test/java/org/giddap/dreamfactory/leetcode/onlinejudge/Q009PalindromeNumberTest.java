package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.onlinejudge.implementations.Q009PalindromeNumberImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q009PalindromeNumberTest {
    private Q009PalindromeNumber q009PalindromeNumber = new Q009PalindromeNumberImpl();

    @Test
    public void small01() {
        assertEquals(true, q009PalindromeNumber.isPalindrome(0));
    }

    @Test
    public void small02() {
        assertEquals(true, q009PalindromeNumber.isPalindrome(5));
    }

    @Test
    public void small03() {
        assertEquals(false, q009PalindromeNumber.isPalindrome(10));
    }

    @Test
    public void small04() {
        assertEquals(true, q009PalindromeNumber.isPalindrome(121));
    }

    @Test
    public void small05() {
        assertEquals(true, q009PalindromeNumber.isPalindrome(2332));
    }

    @Test
    public void small06() {
        assertEquals(false, q009PalindromeNumber.isPalindrome(12343));
    }

    @Test
    public void small07() {
        assertEquals(false, q009PalindromeNumber.isPalindrome(-101));
    }

    @Test
    public void small08() {
        assertEquals(false, q009PalindromeNumber.isPalindrome(500));
    }

}
