package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q053MaximumSubarray;

public class Q053MaximumSubarrayImpl implements Q053MaximumSubarray {

    @Override
    public int maxSubArray(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = A.length;

        if (len == 0) {
            return 0;
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            sum = Math.max(sum + A[i], A[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
