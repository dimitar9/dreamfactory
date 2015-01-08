package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.SearchInsertPosition;

public class SearchInsertPositionImpl implements SearchInsertPosition {
    @Override
    public int searchInsert(int[] A, int target) {
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
        return high;
    }
}
