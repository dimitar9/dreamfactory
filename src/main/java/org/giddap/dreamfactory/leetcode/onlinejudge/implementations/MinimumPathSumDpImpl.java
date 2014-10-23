package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MinimumPathSum;

public class MinimumPathSumDpImpl implements MinimumPathSum {
    @Override
    public int minPathSum(int[][] grid) {
        // DP: mps[i][j] = min(mps[i][j - 1], mps[i - 1][j]) + grid[i][j]
        final int numOfRows = grid.length;
        if (numOfRows == 0) {
            return 0;
        }
        final int numOfCols = grid[0].length;
        if (numOfCols == 0) {
            return 0;
        }
        int[] prev = new int[numOfCols];
        prev[0] = grid[0][0];
        for (int i = 1; i < numOfCols; i++) {
            prev[i] = prev[i - 1] + grid[0][i];
        }
        for (int i = 1; i < numOfRows; i++) {
            prev[0] += grid[i][0];
            for (int j = 1; j < numOfCols; j++) {
                prev[j] = Math.min(prev[j], prev[j - 1]) + grid[i][j];
            }
        }
        return prev[numOfCols - 1];
    }
}
