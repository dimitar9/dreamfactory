package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q088MergeSortedArray;

public class Q088MergeSortedArrayImpl implements Q088MergeSortedArray {
    @Override
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int j = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (A[m] < B[n]) {
                A[j] = B[n];
                n--;
            } else {
                A[j] = A[m];
                m--;
            }
            j--;
        }
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                A[i] = B[i];
            }
        }
    }
}
