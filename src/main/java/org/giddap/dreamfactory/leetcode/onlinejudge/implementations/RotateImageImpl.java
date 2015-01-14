package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RotateImage;

public class RotateImageImpl implements RotateImage {

    @Override
    public void rotate(int[][] matrix) {
        final int n = matrix.length;
        final int layers = n / 2;
        for (int i = 0; i < layers; i++) {
            int m = n - 2 * i - 2;
            for (int j = 0; j <= m; j++) {
                int tmp = matrix[i + j][i + m + 1];
                matrix[i + j][i + m + 1] = matrix[i][i + j];
                matrix[i][i + j] = tmp;

                tmp = matrix[i + m + 1][i + m + 1 - j];
                matrix[i + m + 1][i + m + 1 - j] = matrix[i][i + j];
                matrix[i][i + j] = tmp;

                tmp = matrix[i + m + 1 -j][i];
                matrix[i + m + 1 -j][i] = matrix[i][i + j];
                matrix[i][i + j] = tmp;
            }
        }
    }
}
