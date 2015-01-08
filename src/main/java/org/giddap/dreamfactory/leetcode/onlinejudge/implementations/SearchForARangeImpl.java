package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.SearchForARange;

public class SearchForARangeImpl implements SearchForARange {
    @Override
    public int[] searchRange(int[] A, int target) {
        int[] ret = new int[]{-1, -1};

        // find lower bound
        int l = -1;
        int r = A.length;
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (A[m] < target) {
                l = m;
            } else {
                r = m;
            }
        }
        if (r < A.length && A[r] == target) {
            ret[0] = r;
        }

        // find upper bound
        l = -1;
        r = A.length;
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (A[m] > target) {
                r = m;
            } else {
                l = m;
            }
        }
        if (l > -1 && A[l] == target) {
            ret[1] = l;
        }
        return ret;
    }
}
