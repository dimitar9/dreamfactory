package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.PalindromeNumber;

/**
 * 弼馬溫注解：
 * 算出位數，然後從兩頭算起。
 */
public class PalindromeNumberImpl implements PalindromeNumber {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = 1;
        int a = x;
        while (a > 9) {
            n *= 10;
            a /= 10;
        }
        a = x;
        while (a > 0) {
            int t = a % 10;
            int h = a / n;
            if (t != h) {
                return false;
            }
            a %= (a % n) / 10;
            n /= 100;
        }
        return true;
    }
}
