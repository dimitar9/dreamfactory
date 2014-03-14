package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SqrtX;

/**
 * 弼馬溫注解：
 * Binary-search like approach to find the square root.
 * <p/>
 * Time complexity: O(log(x)).
 * Space complexity: O(1).
 */
public class SqrtXBinarySearchImpl implements SqrtX {
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
