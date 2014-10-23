package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximumProductSubarray;

/**
 *
 */
public class MaximumProductSubarrayOneIterationImpl
        implements MaximumProductSubarray {
    @Override
    public int maxProduct(int[] A) {
        final int len = A.length;
        int max = Integer.MIN_VALUE;
        int min = 1;
        int curr = 1;
        for (int i = 0; i < len; ++i) { // row
            if (A[i] == 0) {
                max = Math.max(0, max);
                curr = 1;
                min = 1;
            } else {
                curr *= A[i];
                min *= A[i];
                if (A[i] < 0) {
                    boolean bothNeg = false;
                    if (curr < 0 && min < 0) {
                        min = 1;
                        bothNeg = true;
                    }
                    int tmp = min;
                    if (curr < min) {
                        min = curr;
                        curr = tmp;
                    }
                    if (bothNeg) {
                        max = Math.max(min, max);
                        continue;
                    }
                }
                max = Math.max(curr, max);

            }
        }
        return max;
    }
}
