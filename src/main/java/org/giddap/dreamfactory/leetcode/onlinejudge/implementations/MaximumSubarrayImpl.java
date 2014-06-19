package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximumSubarray;

public class MaximumSubarrayImpl implements MaximumSubarray {

    @Override
    public int maxSubArray(int[] A) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : A) {
            sum = Math.max(sum + num, num);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
