package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MedianofTwoSortedArrays;

/**
 *
 */
public class MedianofTwoSortedArraysMergeAndCountImpl implements MedianofTwoSortedArrays {
    @Override
    public double findMedianSortedArrays(int[] A, int[] B) {
        final int aLen = A.length;
        final int bLen = B.length;
        final int n = aLen + bLen;

        final boolean oddNumber = (n & 0x1) == 1;

        final int medianRightIdx = (aLen + bLen) / 2;
        final int medianLeftIdx = oddNumber ? medianRightIdx : medianRightIdx - 1;

        int medianLeftValue = -1;
        int medianRightValue = -1;
        if (aLen == 0) {
            medianLeftValue = B[medianLeftIdx];
            medianRightValue = B[medianRightIdx];
        } else if (bLen == 0) {
            medianLeftValue = A[medianLeftIdx];
            medianRightValue = A[medianRightIdx];
        } else {
            int i = 0;
            int j = 0;
            int k = 0;
            for (; k < medianLeftIdx; k++) {
                if (i == aLen) { // reached the end of A
                    medianLeftValue = B[medianLeftIdx - aLen];
                    medianRightValue = oddNumber ? medianLeftValue : B[j + 1];
                    break;
                } else if (j == bLen) {
                    medianLeftValue = A[medianLeftIdx - bLen];
                    medianRightValue = oddNumber ? medianLeftValue : A[i + 1];
                    break;
                } else if (A[i] <= B[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            if (i != aLen && j != bLen) {
                medianLeftValue = Math.min(A[i], B[j]);
                medianRightValue = oddNumber ? medianLeftValue
                    : Math.min(
                        Math.max(A[i], B[j]),
                        Math.min(i + 1 < aLen ? A[i + 1] : Integer.MAX_VALUE,
                                 j + 1 < bLen ? B[j + 1] : Integer.MAX_VALUE));
            } else if (i == aLen && k == medianLeftIdx) {
                // all first k elements are taken from A
                medianLeftValue = B[0];
                medianRightValue = oddNumber ? medianLeftValue : B[j + 1];
            } else if (j == bLen && k == medianLeftIdx) {
                // all first k elements are taken from B
                medianLeftValue = A[0];
                medianRightValue = oddNumber ? medianLeftValue : A[i + 1];
            }
        }
        return (medianLeftValue + medianRightValue) / 2.0;
    }
}
