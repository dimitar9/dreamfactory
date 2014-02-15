package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q041FirstMissingPositive;

/**
 * 基本思路是对于A[],[1..A.length+1],first missing 在这个区间里面,第一遍遍历数
 * 组把A[i]换到A[i]-1的位置上，第二遍返回第一个A[i] != i+1的数
 */
public class Q041FirstMissingPositiveImpl implements Q041FirstMissingPositive {
    @Override
    public int firstMissingPositive(int[] A) {
        final int n = A.length;
        for (int i = 0; i < n; ++i) {
            if (0 < A[i] && A[i] < n) {
                if (A[i] - 1 != i && A[A[i] - 1] != A[i]) {
                    swap(A, A[i] - 1, i);
                    --i;
                }
            }
        }

        for (int j = 0; j < n; ++j) {
            if (A[j] - 1 != j)
                return j + 1;
        }

        return n + 1;
    }

    private void swap(int[] numbers, int a, int b) {
        int tmp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = tmp;
    }
}
