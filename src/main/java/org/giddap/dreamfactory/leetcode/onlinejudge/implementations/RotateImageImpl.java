package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RotateImage;

public class RotateImageImpl implements RotateImage {

    @Override
    public void rotate(int[][] matrix) {
        final int n = matrix.length;
        int layer = 0;
        while (2 * layer <= n) {
            int len = n - 2 * layer - 1;
            for (int i = 0; i < len; i++) {
                // top to right
                int right = matrix[layer + i][layer + len];
                matrix[layer + i][layer + len] = matrix[layer][layer + i];
                // right to bottom
                int bottom = matrix[layer + len][layer + len - i];
                matrix[layer + len][layer + len - i] = right;
                // bottom to left
                int left = matrix[layer + len - i][layer];
                matrix[layer + len - i][layer] = bottom;
                // left to top
                matrix[layer][layer + i] = left;
            }
            layer++;
        }
    }
}
