package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.UniquePaths;

/**
 * TLE on Judge Large
 */
public class UniquePathsRecursiveDfsImpl implements UniquePaths {
    @Override
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return sumUpUniquePaths(m, n, 0, 0);
    }

    private int sumUpUniquePaths(int m, int n, int row, int col) {
        if (row == m - 1 && col == n - 1) {
            return 1;
        }

        if (row >= m || col >= n) {
            return 0;
        }

        return sumUpUniquePaths(m, n, row + 1, col) + sumUpUniquePaths(m, n, row, col + 1);
    }
}
