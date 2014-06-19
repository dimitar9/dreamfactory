package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q027RemoveElement;

public class Q027RemoveElementImpl implements Q027RemoveElement {
    @Override
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
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

