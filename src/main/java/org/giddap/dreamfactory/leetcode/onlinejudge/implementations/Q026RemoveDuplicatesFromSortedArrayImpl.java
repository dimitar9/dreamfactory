package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q026RemoveDuplicatesFromSortedArray;

public class Q026RemoveDuplicatesFromSortedArrayImpl implements Q026RemoveDuplicatesFromSortedArray {
    @Override
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int len = A.length;
        if (len == 0) {
            return 0;
        }

        int i = 1;
        for (int j = 1; j < len; j++) {
            if (A[j] != A[j - 1]) {
                A[i] = A[j];
                i++;
            }
        }
        return i;
    }
}
