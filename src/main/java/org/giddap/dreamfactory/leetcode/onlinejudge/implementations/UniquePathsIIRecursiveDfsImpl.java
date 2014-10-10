package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.UniquePathsII;

public class UniquePathsIIRecursiveDfsImpl implements UniquePathsII {
    @Override
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int numOfRows = obstacleGrid.length;
        if (numOfRows == 0) {
            return 0;
        }
        final int numOfColumns = obstacleGrid[0].length;
        if (numOfColumns == 0) {
            return 0;
        }

        return calculateUniquePaths(obstacleGrid, numOfRows, numOfColumns, 0, 0);
    }

    private int calculateUniquePaths(int[][] obstacleGrid, final int numOfRows, final int numOfColumns,
                                     int currRow, int currCol) {
        if (obstacleGrid[currRow][currCol] == 1) {
            return 0;
        }
        if (currRow == numOfRows - 1 && currCol == numOfColumns - 1) {
            return 1;
        }

        int numOfPaths = 0;
        // next right
        if (currCol < numOfColumns - 1) {
            numOfPaths += calculateUniquePaths(obstacleGrid, numOfRows, numOfColumns, currRow, currCol + 1);
        }

        if (currRow < numOfRows - 1) {
            numOfPaths += calculateUniquePaths(obstacleGrid, numOfRows, numOfColumns, currRow + 1, currCol);
        }

        return numOfPaths;
    }
}
