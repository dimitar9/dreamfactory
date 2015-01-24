package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Search2dMatrix;

public class Search2dMatrixImpl implements Search2dMatrix {
    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        final int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        final int cols = matrix[0].length;
        if (cols == 0) {
            return false;
        }
        int l = -1;
        int h = rows * cols;
        while (h - l > 1) {
            int m = l + (h - l) / 2;
            if (matrix[m / cols][m % cols] > target) {
                h = m;
            } else {
                l = m;
            }
        }
        return l >= 0 ? (matrix[l / cols][l % cols] == target) : false;
    }
}
