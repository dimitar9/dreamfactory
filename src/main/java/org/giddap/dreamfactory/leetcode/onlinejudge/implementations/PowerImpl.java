package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Power;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Time complexity: O(log(n))</li>
 * <li>Space complexity: O(1)</li>
 * <li>Similar to binary search. Cut down the space by half each step.
 * <li>Thought Process: note to handle odd/even cases.
 * </li>
 * </ul>
 */
public class PowerImpl implements Power {
    @Override
    public double pow(double x, int n) {
        final boolean isNegative = (n < 0);
        long a = Math.abs((long) n);
        double ret = 1.0;
        while (a > 0) {
            if ((a & 1) == 1) {
                ret *= x;
            }
            a >>= 1;
            x *= x;
        }

        return isNegative ? 1.0/ret : ret;
    }
}
