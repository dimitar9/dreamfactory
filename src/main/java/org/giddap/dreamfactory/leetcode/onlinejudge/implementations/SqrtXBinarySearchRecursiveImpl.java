package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SqrtX;

/**
 *
 */
public class SqrtXBinarySearchRecursiveImpl implements SqrtX {
    @Override
    public int sqrt(int x) {
        return (int) calcSqrt(x, -1, (long) x + 1);
    }

    private long calcSqrt(long x, long low, long high) {

        if (high - low <= 1) {
            return low;
        }

        long mid = low + (high - low) / 2;
        if (mid * mid > x) {
            return calcSqrt(x, low, mid);
        } else {
            return calcSqrt(x, mid, high);
        }
    }
}
