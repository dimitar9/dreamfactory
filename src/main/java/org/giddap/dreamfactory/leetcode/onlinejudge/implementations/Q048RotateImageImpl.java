package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q048RotateImage;

public class Q048RotateImageImpl implements Q048RotateImage {

    @Override
    public void rotate(int[][] matrix) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        execute(matrix, 0);
    }

    private void execute(int[][] matrix, int layer) {
        final int len = matrix.length - 2 * layer - 1;

        if (len == 0) {
            return;
        }

        // swap top to right
        for (int i = 0; i < len; i++) {
            swap(matrix, layer, layer + i, layer + i, layer + len);
        }

        // swap right to bottom
        for (int i = 0; i < len; i++) {
            swap(matrix, layer, layer + i, layer + len, layer + len - i);
        }

        // swap bottom to left
        for (int i = 0; i < len; i++) {
            swap(matrix, layer, layer + i, layer + len - i, layer);
        }

        if (len > 1) {
            execute(matrix, layer + 1);
        }
    }

    private void swap(int[][] matrix, int arow, int acol, int brow, int bcol) {
        int tmp = matrix[arow][acol];
        matrix[arow][acol] = matrix[brow][bcol];
        matrix[brow][bcol] = tmp;
    }
}
