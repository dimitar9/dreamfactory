package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q062UniquePaths;

public class Q062UniquePathsDPImpl implements Q062UniquePaths {
    //paths(i, j) = paths(i - 1, j) + paths(i, j - 1)
    @Override
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] prev = new int[n];

        prev[0] = 1;
        for (int i = 1; i < n; i++) {
            prev[i] = prev[i - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                prev[j] += prev[j - 1];
            }
        }

        return prev[n - 1];
    }
}
