package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SearchInRotatedSortedArray;

public class SearchInRotatedSortedArrayImpl implements SearchInRotatedSortedArray {

    @Override
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int len = A.length;
        if (len == 0) {
            return -1;
        }

        int low = 0;
        int high = len - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (A[low] <= A[mid]) { // sorted between low and mid
                if (A[low] <= target && target < A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // sorted between mid and high
                if (A[mid] < target && target <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
