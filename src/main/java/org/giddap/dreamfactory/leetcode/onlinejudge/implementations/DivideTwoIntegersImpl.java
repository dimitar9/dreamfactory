package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.DivideTwoIntegers;

public class DivideTwoIntegersImpl implements DivideTwoIntegers {

    @Override
    public int divide(int dividend, int divisor) {
        final boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long ret = 0;
        while (a >= b) {
            int i = 1;
            while (a >= (b << i)) {
                i++;
            }
            i--;
            ret += 1L << i;
            a -= b << i;
            if (ret >= Integer.MAX_VALUE) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return isNegative ? 0 - (int) ret : (int) ret;
    }
}
