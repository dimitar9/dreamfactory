package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

/**
 * TEL on OJ large.
 */
public class Q064MinimumPathSumDfsBacktrackingImpl {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return findMinPathSum(grid, Integer.MAX_VALUE, 0, 0, 0);
    }

    private int findMinPathSum(int[][] grid, int minSum, int currentSum, int x, int y) {
        final int maxY = grid.length - 1;
        final int maxX = grid[0].length - 1;

        if (x > maxX || y > maxY) {
            return Integer.MAX_VALUE;
        }

        if (x == maxX && y == maxY) {
            return currentSum + grid[maxY][maxX];
        }

        return Math.min(findMinPathSum(grid, minSum, currentSum + grid[y][x], x + 1, y),
                findMinPathSum(grid, minSum, currentSum + grid[y][x], x, y + 1));
    }
}
