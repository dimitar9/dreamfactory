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
        final int medianLeftIdx =
                oddNumber ? (aLen + bLen) / 2 : (aLen + bLen) / 2 - 1;

        int medianLeftValue = -1;
        int medianRightValue = -1;

        // keep updating left and right medians as we proceed step by step
        int i = 0;
        int j = 0;
        while (i < aLen || j < bLen) {
            if (i == aLen) {
                medianLeftValue = B[j];
                medianRightValue = oddNumber ? medianLeftValue : B[j + 1];
                j++;
            } else if (j == bLen) {
                medianLeftValue = A[i];
                medianRightValue = oddNumber ? medianLeftValue : A[i + 1];
                i++;
            } else {
                if (A[i] <= B[j]) {
                    medianLeftValue = A[i];
                    medianRightValue = oddNumber ?  medianLeftValue :
                            Math.min(i + 1 < aLen ? A[i + 1] : Integer.MAX_VALUE, B[j]);
                    i++;
                } else {
                    medianLeftValue = B[j];
                    medianRightValue = oddNumber ?  medianLeftValue :
                            Math.min(A[i], j + 1 < bLen ? B[j + 1] : Integer.MAX_VALUE);
                    j++;
                }
            }
            if (i + j - 1 == medianLeftIdx) {
                break;
            }
        }

        return (medianLeftValue + medianRightValue) / 2.0;
    }
}
