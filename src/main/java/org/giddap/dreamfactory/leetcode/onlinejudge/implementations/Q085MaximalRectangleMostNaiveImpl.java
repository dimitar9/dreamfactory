package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q085MaximalRectangle;

/**
 *
 */
public class Q085MaximalRectangleMostNaiveImpl implements Q085MaximalRectangle {
    @Override
    public int maximalRectangle(char[][] matrix) {
        final int numOfRows = matrix.length;
        if (numOfRows == 0) {
            return 0;
        }
        final int numOfCols = matrix[0].length;
        if (numOfCols == 0) {
            return 0;
        }

        int maxRectangle = 0;
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfCols; j++) {
                for (int m = i; m < numOfRows; m++) {
                    for (int n = j; n < numOfCols; n++) {
                        if (hasOnlyOnes(matrix, i, j, m, n)) {
                            maxRectangle = Math.max(maxRectangle, (m - i + 1) * (n - j + 1));
                        }
                    }
                }
            }
        }
        return maxRectangle;
    }

    private boolean hasOnlyOnes(char[][] matrix,
                                final int lowerLeftX, final int lowerLeftY,
                                final int upperRightX, final int upperRightY) {
        for (int x = lowerLeftX; x <= upperRightX; x++) {
            for (int y = lowerLeftY; y <= upperRightY; y++) {
                if (matrix[x][y] == '0') {
                    return false;
                }
            }
        }
        return true;
    }
}
