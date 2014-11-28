package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MedianofTwoSortedArrays;

import java.util.Arrays;

/**
 * Created by peng on 11/28/14.
 */
public class MedianofTwoSortedArraysWithFindKthElementImpl implements MedianofTwoSortedArrays {
    @Override
    public double findMedianSortedArrays(int[] A, int[] B) {
        final int m = A.length;
        final int n = B.length;
        final int l = m + n;
        if ((l & 0x1) == 1) { // l is odd
            return findKthElement(A, B, l / 2 + 1);
        } else { // l is even
            return (findKthElement(A, B, l / 2)
                    + findKthElement(A, B, l / 2 + 1)) / 2.0;
        }
    }

    private int findKthElement(int[] A, int[] B, int k) {
        final int m = A.length;
        final int n = B.length;

        // Special Case #1: Always assume A has
        // fewer or equal number of elements than B does
        if (m > n) {
            return findKthElement(B, A, k);
        }
        // Special Case #2: 'A is empty' then return 'k - 1' element in B
        if (m == 0) {
            return B[k - 1];
        }
        // Special Case #3: 'k == 1' then return the min of A[0] and B[0]
        if (k == 1) {
            return Math.min(A[0], B[0]);
        }

        // divide K into two parts
        int pa = Math.min(k / 2, m);
        int pb = k - pa;
        if (A[pa - 1] < B[pb - 1]) { // Median is located in A[pa, m] or B
            return findKthElement(Arrays.copyOfRange(A, pa, m), B, k - pa);
        } else if (A[pa - 1] > B[pb - 1]) { // Median is located in A or B[pb, n]
            return findKthElement(A, Arrays.copyOfRange(B, pb, n), k - pb);
        } else { // Found the median; take the one from A
            return A[pa - 1];
        }
    }
}
