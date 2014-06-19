package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.UniquePaths;

/**
 * 弼馬溫注解：
 * DP solution: s[i, j] = s[i - 1, j] + s[i, j - 1]
 */
public class UniquePathsDPImpl implements UniquePaths {
    //paths(i, j) = paths(i - 1, j) + paths(i, j - 1)
    @Override
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (m == 0 || n == 0) {
            return 0;
        }

        int[] row = new int[n];
        row[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                row[j] += row[j - 1];
            }
        }

        return row[n - 1];
    }
}
