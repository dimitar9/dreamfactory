package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximumSubarray;

public class MaximumSubarrayDivideAndConquerImpl implements MaximumSubarray {
    @Override
    public int maxSubArray(int[] A) {
        return findMaxSubArray(A, 0, A.length - 1);
    }

    private int findMaxSubArray(int[] a, int low, int high) {
        if (low == high) {
            return a[low];
        }

        int mid = low + (high - low) / 2;

        int max = Math.max(findMaxSubArray(a, low, mid), findMaxSubArray(a, mid + 1, high));
        max = Math.max(max, findCrossMidSum(a, low, mid, high));

        return max;
    }

    private int findCrossMidSum(int[] a, int low, int mid, int high) {
        int leftSum = 0;
        int maxLeftSum = Integer.MIN_VALUE;
        int i = mid;
        while (i >= low) {
            leftSum += a[i];
            if (leftSum > maxLeftSum) {
                maxLeftSum = leftSum;
            }
            i--;
        }

        int rightSum = 0;
        int maxRightSum = Integer.MIN_VALUE;
        i = mid + 1;
        while (i <= high) {
            rightSum += a[i];
            if (rightSum > maxRightSum) {
                maxRightSum = rightSum;
            }
            i++;
        }

        return maxLeftSum + maxRightSum;
    }
}
