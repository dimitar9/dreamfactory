package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.MaximalRectangle;

public class MaximalRectangleImpl implements MaximalRectangle {
    @Override
    public int maximalRectangle(char[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int numRows = matrix.length;
        if (numRows == 0) {
            return 0;
        }
        final int numColumns = matrix[0].length;
        if (numColumns == 0) {
            return 0;
        }

        int[][] memo = new int[numRows][numColumns];
        int maxSquare = 0;
        for (int i = numRows - 1; i >= 0; i--) {
            for (int j = numColumns - 1; j >= 0; j--) {
                if (matrix[i][j] == '0') {
                    memo[i][j] = 0;
                } else if (i == numRows - 1 || j == numColumns - 1) {
                    memo[i][j] = matrix[i][j] - '0';
                } else {
                    int tmp = Math.min(memo[i][j + 1], memo[i + 1][j]);
                    tmp = Math.min(tmp, memo[i + 1][j + 1]);
                    memo[i][j] = tmp + 1;
                }
                maxSquare = Math.max(maxSquare, memo[i][j]);
            }
        }

        return maxSquare;
    }
}
