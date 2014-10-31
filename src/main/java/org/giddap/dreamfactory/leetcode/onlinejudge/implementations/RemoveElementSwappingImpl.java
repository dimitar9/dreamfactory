package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RemoveElement;

/**
 *
 */
public class RemoveElementSwappingImpl implements RemoveElement {
    @Override
    public int removeElement(int[] A, int elem) {
        final int len = A.length;
        if (len == 0) {
            return 0;
        }
        int l = 0;
        int r = len - 1;
        while (l <= r) {
            if (A[l] != elem) {
                l++;
            } else {
                if (A[r] == elem) {
                    r--;
                } else {
                    A[l] = A[r];
                    l++;
                    r--;
                }
            }
        }
        return l;
    }
}
