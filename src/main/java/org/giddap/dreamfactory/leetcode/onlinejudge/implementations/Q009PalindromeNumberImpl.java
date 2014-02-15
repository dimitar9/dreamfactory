package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q009PalindromeNumber;

public class Q009PalindromeNumberImpl implements Q009PalindromeNumber {

    @Override
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x < 0) {
            return false;
        }

        long y = x;

        int i = 0;
        while (y >= 10) {
            y /= 10;
            i++;
        }

        y = x;
        while (y > 9) {
            long r = y % 10;
            long l = (long) (y / Math.pow(10, i));

            if (l != r) {
                return false;
            }

            y %= Math.pow(10, i);
            y /= 10;

            i -= 2;
        }
        return true;
    }
}
