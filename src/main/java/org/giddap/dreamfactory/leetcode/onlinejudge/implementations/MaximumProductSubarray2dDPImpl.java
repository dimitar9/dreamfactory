package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximumProductSubarray;

/**
 *
 */
public class MaximumProductSubarray2dDPImpl implements MaximumProductSubarray {
    @Override
    public int maxProduct(int[] A) {
        final int len = A.length;
        int[][] products = new int[len][len];
        int maxP = Integer.MIN_VALUE;
        for (int i = 0; i < len; ++i) { // row
            int[] mins = new int[len];
            int[] maxes = new int[len];

            for (int j = i; j < len; ++j) {// col
                if (i == j) {
                    products[i][j] = A[i];
                } else {
                    products[i][j] = products[i][j - 1] * A[j];
                }
                mins[j] = Math.min(mins[j], products[i][j]);
                maxes[j] = Math.min(maxes[j], products[i][j]);
                maxP = Math.max(maxP, products[i][j]);
            }
        }
        return maxP;
    }
}
