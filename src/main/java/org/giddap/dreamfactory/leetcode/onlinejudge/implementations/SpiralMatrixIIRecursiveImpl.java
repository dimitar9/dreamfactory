package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

/**
 *
 */
public class SpiralMatrixIIRecursiveImpl {
    public int[][] generateMatrix(int n) {
        int val = 1;
        int[][] matrix = new int[n][n];

        for (int level = 0; level < n; ++level, --n) {
            // top
            for (int i = level; i < n; ++i) matrix[level][i] = val++;
            // right
            for (int i = level + 1; i < n; ++i) matrix[i][n - 1] = val++;
            // bottom
            for (int i = n - 2; i >= level; --i) matrix[n - 1][i] = val++;
            // left
            for (int i = n - 2; i > level; --i) matrix[i][level] = val++;
        }

        return matrix;
    }
}
