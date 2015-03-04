package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SingleNumber;

/**
 * http://www.cs.umd.edu/class/sum2003/cmsc311/Notes/BitOp/xor.html
 */
public class SingleNumberImpl implements SingleNumber {
    public int singleNumber(int[] A) {
        int x = A[0];
        for (int i = 1; i < A.length; i++) {
            x ^= A[i];
        }
        return x;
    }
}
