package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.UniquePathsII;

public class UniquePathsIIIterativeDPImpl implements UniquePathsII {
    @Override
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int numRows = obstacleGrid.length;
        if (numRows == 0) {
            return 0;
        }
        final int numColumns = obstacleGrid[0].length;
        if (numColumns == 0) {
            return 0;
        }

        int[] row = new int[numColumns];
        row[0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for (int i = 1; i < numColumns; i++) {
            if (obstacleGrid[0][i] == 0) {
                row[i] = row[i - 1];
            }
        }

        for (int i = 1; i < numRows; i++) {
            row[0] = obstacleGrid[i][0] == 1 ? 0 : row[0];
            for (int j = 1; j < numColumns; j++) {
                if (obstacleGrid[i][j] == 0) {
                    row[j] += row[j - 1];
                } else {
                    row[j] = 0;
                }
            }
        }

        return row[numColumns - 1];
    }
}
