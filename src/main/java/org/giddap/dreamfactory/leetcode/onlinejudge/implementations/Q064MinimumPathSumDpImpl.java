package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q064MinimumPathSum;

public class Q064MinimumPathSumDpImpl implements Q064MinimumPathSum {
    @Override
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        final int cols = grid[0].length;
        if (cols == 0) {
            return 0;
        }

        int[] mps = new int[cols];
        mps[0] = grid[0][0];

        for (int i = 1; i < cols; i++) {
            mps[i] = mps[i - 1] + grid[0][i];
        }

        for (int j = 1; j < rows; j++) {
            mps[0] = mps[0] + grid[j][0];
            for (int k = 1; k < cols; k++) {
                mps[k] = Math.min(mps[k], mps[k - 1]) + grid[j][k];
            }
        }

        return mps[cols - 1];
    }
}
