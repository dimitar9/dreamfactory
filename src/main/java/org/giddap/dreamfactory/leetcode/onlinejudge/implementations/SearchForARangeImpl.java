package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.SearchForARange;

public class SearchForARangeImpl implements SearchForARange {
    @Override
    public int[] searchRange(int[] A, int target) {
        final int len = A.length;
        int[] ret = new int[]{-1, -1};
        // find the upper bound
        int l = -1;
        int r = len;
        while (r - l > 1) {
            int m = (l + r) / 2;
            if (A[m] > target) {
                r = m;
            } else {
                l = m;
            }
        }
        if (l > -1 && A[l] == target) {
            ret[0] = l;
            ret[1] = l;
        }

        // find the lower bound
        l = -1;
        r = len;
        while (r - l > 1) {
            int m = (l + r) / 2;
            if (A[m] < target) {
                l = m;
            } else {
                r = m;
            }
        }
        if (r < len && A[r] == target) {
            ret[0] = r;
        }
        return ret;
    }
}
