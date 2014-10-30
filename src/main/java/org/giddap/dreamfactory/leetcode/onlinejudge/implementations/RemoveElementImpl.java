package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.RemoveElement;

public class RemoveElementImpl implements RemoveElement {
    @Override
    public int removeElement(int[] A, int elem) {
        final int len = A.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (A[i] != elem) {
                A[j] = A[i];
                j++;
            }
        }
        return j;
    }
}

