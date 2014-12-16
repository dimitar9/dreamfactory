package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SetMatrixZeroes;

public class SetMatrixZeroesImpl implements SetMatrixZeroes {
    @Override
    public void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int numRows = matrix.length;
        if (numRows == 0) {
            return;
        }
        final int numColumns = matrix[0].length;
        if (numColumns == 0) {
            return;
        }

        // first row
        boolean hasZeroInFirstRow = false;
        for (int n : matrix[0]) {
            if (n == 0) {
                hasZeroInFirstRow = true;
                break;
            }
        }

        // first column
        boolean hasZeroInFirstColumn = false;
        for (int i = 0; i < numRows; i++) {
            if (matrix[i][0] == 0) {
                hasZeroInFirstColumn = true;
                break;
            }
        }

        // detect zeroes
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numColumns; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // set zeroes
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numColumns; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // set zeroes in first row, if needed
        if (hasZeroInFirstRow) {
            for (int i = 0; i < numColumns; i++) {
                matrix[0][i] = 0;
            }
        }


        // set zeroes in first column, if needed
        if (hasZeroInFirstColumn) {
            for (int i = 0; i < numRows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
