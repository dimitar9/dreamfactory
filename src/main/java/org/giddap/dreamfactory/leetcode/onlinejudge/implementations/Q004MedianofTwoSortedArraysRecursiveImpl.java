package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q004MedianofTwoSortedArrays;

import java.util.Arrays;

public class Q004MedianofTwoSortedArraysRecursiveImpl implements Q004MedianofTwoSortedArrays {
    @Override
    public double findMedianSortedArrays(int A[], int B[]) {
        // Start typing your Java solution below
        // DO NOT write main() function

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

    private double findKth(int a[], int b[], int k) {
        final int aLength = a.length;
        final int bLength = b.length;

        if (aLength > bLength) return findKth(b, a, k);

        if (aLength == 0) return b[k - 1];
        if (k == 1) return Math.min(a[0], b[0]);
        int pa = Math.min(k / 2, aLength), pb = k - pa;
        if (a[pa - 1] < b[pb - 1]) {
            return findKth(Arrays.copyOfRange(a, pa, aLength), b, k - pa);
        } else {
            return findKth(a, Arrays.copyOfRange(b, pb, bLength), k - pb);
        }
    }
}
