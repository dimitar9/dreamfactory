package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.FirstMissingPositive;

/**
 * 基本思路是对于A[],[1..A.length+1],first missing 在这个区间里面,第一遍遍历数
 * 组把A[i]换到A[i]-1的位置上，第二遍返回第一个A[i] != i+1的数
 */
public class FirstMissingPositiveImpl implements FirstMissingPositive {
    @Override
    public int firstMissingPositive(int[] A) {
        final int len = A.length;
        int i = 0;
        while (i < len) {
            if (0 < A[i] && A[i] <= len && A[A[i] - 1] != A[i]) {
                int tmp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = tmp;
            } else {
                i++;
            }
        }

        i = 0;
        while (i < len && A[i] - 1 == i) {
            i++;
        }
        return i + 1;
    }
}
