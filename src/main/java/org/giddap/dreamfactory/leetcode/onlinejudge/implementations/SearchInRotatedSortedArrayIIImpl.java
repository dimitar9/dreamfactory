package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SearchInRotatedSortedArrayII;

public class SearchInRotatedSortedArrayIIImpl implements SearchInRotatedSortedArrayII {
    @Override
    public boolean search(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == target) {
                return true;
            }

            if (A[low] < A[mid]) { // left is sorted
                if (A[low] <= target && target < A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (A[low] > A[mid]) { // right is sorted
                if (A[mid] < target && target <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else { // cannot really tell
                if (A[mid] == A[high]) {
                    low++;
                    high--;
                } else {
                    low = mid + 1;
                }
            }
        }

        return false;
    }
}
