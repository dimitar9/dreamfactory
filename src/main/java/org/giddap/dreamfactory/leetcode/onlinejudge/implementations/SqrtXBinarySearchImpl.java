package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q069SqrtX;

/**
 *
 */
public class SqrtXBinarySearchImpl implements Q069SqrtX {
    @Override
    public int sqrt(int x) {
        // low * low <= x < high * high
        long a = x;
        long low = -1;
        long high = a + 1;

        while (high - low > 1) {
            long mid = low + (high - low) / 2;
            if (mid * mid > a) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return (int) low;
    }
}
