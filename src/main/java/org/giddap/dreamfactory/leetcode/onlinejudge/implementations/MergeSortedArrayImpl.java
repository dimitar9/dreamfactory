package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MergeSortedArray;

public class MergeSortedArrayImpl implements MergeSortedArray {
    @Override
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[i + j + 1] = A[i];
                i--;
            } else {
                A[i + j + 1] = B[j];
                j--;
            }
        }

        while (j >= 0) {
            A[j] = B[j];
            j--;
        }
    }
}
