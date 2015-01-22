package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.UniquePathsII;

public class UniquePathsIIIterativeDPImpl implements UniquePathsII {
    @Override
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int m = obstacleGrid.length;
        if (m == 0) {
            return 0;
        }
        final int n = obstacleGrid[0].length;
        if (n == 0) {
            return 0;
        }
        int[] memo = new int[n];
        memo[0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 1; i < memo.length; i++) {
            memo[i] = (obstacleGrid[0][i] == 1) ? 0 : memo[i - 1];
        }
        for (int r = 1; r < m; r++) {
            memo[0] = (obstacleGrid[r][0] == 1) ? 0 : memo[0];
            for (int c = 1; c < n; c++) {
                memo[c] = obstacleGrid[r][c] == 1 ? 0 : memo[c - 1] + memo[c];
            }
        }
        return memo[n - 1];
    }
}
