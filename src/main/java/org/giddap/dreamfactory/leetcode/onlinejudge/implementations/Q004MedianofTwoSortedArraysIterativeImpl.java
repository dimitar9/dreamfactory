package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q004MedianofTwoSortedArrays;

public class Q004MedianofTwoSortedArraysIterativeImpl implements Q004MedianofTwoSortedArrays {

    @Override
    public double findMedianSortedArrays(int[] A, int[] B) {
        // Figure out the total number of numbers
        final int totalLength = A.length + B.length;
        if (totalLength % 2 == 0) {
            // If there are even number of numbers, take the average of the lower and upper medians
            return (findKth(A, B, totalLength / 2) + findKth(A, B, totalLength / 2 + 1)) / 2;
        } else {
            // Odd number of numbers - take the median
            return findKth(A, B, totalLength / 2 + 1);
        }
    }

    private double findKth(int[] A, int[] B, int k) {
        if (k <= 0)
            return Math.min(A[0], B[0]);
        if (k > A.length + B.length)
            return Math.max(A[A.length - 1], B[B.length - 1]);

        int l = 0;
        int h = Math.min(A.length - 1, k - 1);
        while (l <= h) {
            int x = (l + h) / 2;

            int a_x = A[x];
            int a_x_1 = (x - 1 < 0 ? Integer.MIN_VALUE : A[x - 1]);
            int b_k_x = (k - x >= B.length ? Integer.MAX_VALUE : B[k - x]);
            int b_k_x_1 = (k - x - 1 >= B.length ? Integer.MAX_VALUE : B[k - x - 1]);

            if (a_x < b_k_x_1)
                l = x + 1;
            else if (a_x_1 > b_k_x)
                h = x - 1;
            else
                return Math.max(a_x_1, b_k_x_1);
        }

        return -1;
    }
}
