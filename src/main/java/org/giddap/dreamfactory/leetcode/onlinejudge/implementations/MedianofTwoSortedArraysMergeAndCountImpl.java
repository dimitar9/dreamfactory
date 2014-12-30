package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MedianofTwoSortedArrays;

/**
 * Merge the two sorted arrays to find the median.
 */
public class MedianofTwoSortedArraysMergeAndCountImpl implements MedianofTwoSortedArrays {
    @Override
    public double findMedianSortedArrays(int[] A, int[] B) {

        final int aLen = A.length;
        final int bLen = B.length;
        // determine if the total number is odd or even
        final boolean oddNumber = ((aLen + bLen) & 0x1) == 1;
        // determine the left median index
        final int leftMedianIdx = oddNumber ? (aLen + bLen) / 2 : (aLen + bLen) / 2 - 1;

        // keep updating left and right medians as we proceed step by step
        int i = 0;
        int j = 0;
        while ((i < aLen || j < bLen) && (i + j < leftMedianIdx)) {
            if (i == aLen) {
                j++;
            } else if (j == bLen) {
                i++;
            } else {
                if (A[i] <= B[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }

        // Calculate the median
        int leftMedianValue = -1;
        int rightMedianValue = -1;
        if (i == aLen) {
            leftMedianValue = B[j];
            rightMedianValue = oddNumber ? leftMedianValue : B[j + 1];
        } else if (j == bLen) {
            leftMedianValue = A[i];
            rightMedianValue = oddNumber ? leftMedianValue : A[i + 1];
        } else {
            if (A[i] <= B[j]) {
                leftMedianValue = A[i];
                i++;
            } else {
                leftMedianValue = B[j];
                j++;
            }
            rightMedianValue = oddNumber ? leftMedianValue :
                    Math.min(i < aLen ? A[i] : Integer.MAX_VALUE,
                            j < bLen ? B[j] : Integer.MAX_VALUE);
        }
        return (leftMedianValue + rightMedianValue) / 2.0;
    }
}
