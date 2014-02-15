package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q029DivideTwoIntegers;

public class Q029DivideTwoIntegersImpl implements Q029DivideTwoIntegers {

    @Override
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long ret = 0;
        while (a >= b) {
            long c = b;
            for (int i = 0; a >= c; ++i, c <<= 1) {
                a -= c;
                ret += 1 << i;
            }
        }

        return (((dividend ^ divisor) >>> 31) == 1) ? (int) (0 - ret) : (int) (ret);
    }
}
