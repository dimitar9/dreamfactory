package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q080RemoveDuplicatesFromSortedArrayII;

public class Q080RemoveDuplicatesFromSortedArrayIIImpl implements Q080RemoveDuplicatesFromSortedArrayII {

    private final int MAX_REPEATED_COUNT = 2;

    @Override
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A.length == 0) {
            return 0;
        }

        int count = 1;
        int j = 1;
        for (int i = 1; i < A.length; i++) {
            if ((A[i] != A[i - 1]) || (count < 2)) {
                if (A[i] != A[i - 1]) {
                    count = 1;
                } else {
                    count++;
                }

                A[j] = A[i];
                j++;

            }
        }
        return j;
    }
}
