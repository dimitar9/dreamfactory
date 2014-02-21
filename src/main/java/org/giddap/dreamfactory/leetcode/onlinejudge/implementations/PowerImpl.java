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
        // Start typing your Java solution below
        // DO NOT write main() function
        long y = Math.abs((long) n);
        double ret = 1L;

        while (y > 0) {
            if ((y & 1) == 1) {
                ret *= x;
            }
            y >>= 1;
            x *= x;
        }

        return n > 0 ? ret : 1.0 / ret;
    }
}
