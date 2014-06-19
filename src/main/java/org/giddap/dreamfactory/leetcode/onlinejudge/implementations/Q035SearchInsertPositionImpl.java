package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q035SearchInsertPosition;

public class Q035SearchInsertPositionImpl implements Q035SearchInsertPosition {
    @Override
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int low = -1;
        int high = A.length;

        while (high - low > 1) {
            int mid = low + (high - low) / 2;
            if (A[mid] < target) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low + 1;
    }
}
