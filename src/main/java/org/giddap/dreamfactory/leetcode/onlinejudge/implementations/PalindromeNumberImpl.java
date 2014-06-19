package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PalindromeNumber;

/**
 * 弼馬溫注解：
 * 算出位數，然後從兩頭算起。
 */
public class PalindromeNumberImpl implements PalindromeNumber {

    @Override
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x < 0) {
            return false;
        }
        int n = 1;
        int a = x;
        while ((a /= 10) > 0) {
            n++;
        }
        a = x;
        while (a >= 10) {
            int tail = a % 10;
            int head = a / (int) Math.pow(10, (n - 1));
            if (tail != head) {
                return false;
            }
            a %= Math.pow(10, (n - 1));
            a /= 10;
            n -= 2;
        }
        return true;
    }
}
