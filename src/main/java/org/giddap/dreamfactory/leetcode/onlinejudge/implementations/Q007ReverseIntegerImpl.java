package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q007ReverseInteger;

public class Q007ReverseIntegerImpl implements Q007ReverseInteger {
    @Override
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean isNegative = (x < 0);
        long num = Math.abs(x);

        long ret = 0;
        while (num > 0) {
            ret = ret * 10 + num % 10;

            if (!isNegative && ret >= Integer.MAX_VALUE) {
                ret = Integer.MAX_VALUE;
                break;
            }

            if (isNegative && ret >= 0L - Integer.MIN_VALUE) {
                ret = 0L - Integer.MIN_VALUE;
                break;
            }

            num /= 10;
        }
        return isNegative ? (int) (0 - ret) : (int) ret;
    }
}
