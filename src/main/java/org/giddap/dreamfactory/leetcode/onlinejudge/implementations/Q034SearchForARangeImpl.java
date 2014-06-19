package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q034SearchForARange;

public class Q034SearchForARangeImpl implements Q034SearchForARange {
    @Override
    public int[] searchRange(int[] A, int target) {
        int[] ret = {-1, -1};
        final int len = A.length;
        if (len == 0) {
            return ret;
        }

        // range high
        int low = -1;
        int high = len;
        while (high - low > 1) {
            int mid = low + (high - low) / 2;
            if (A[mid] > target) {
                high = mid;
            } else {
                low = mid;
            }
        }

        if (low != -1 && A[low] == target) {
            ret[1] = low;
        }

        // range low
        low = -1;
        high = len;
        while (high - low > 1) {
            int mid = low + (high - low) / 2;
            if (A[mid] < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        if (high != len && A[high] == target) {
            ret[0] = high;
        }
        return ret;
    }
}
