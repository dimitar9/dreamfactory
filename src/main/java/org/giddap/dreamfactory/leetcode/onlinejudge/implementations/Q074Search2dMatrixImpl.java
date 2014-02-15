package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q074Search2dMatrix;

public class Q074Search2dMatrixImpl implements Q074Search2dMatrix {
    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        final int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        final int cols = matrix[0].length;
        if (cols == 0) {
            return false;
        }

        int low = -1;
        int high = rows * cols;

        while (high - low > 1) {
            int mid = low + (high - low) / 2;
            int row = mid / cols;
            int col = mid % cols;
            if (matrix[row][col] > target) {
                high = mid;
            } else {
                low = mid;
            }
        }

        if (low == -1 || matrix[low / cols][low % cols] != target) {
            return false;
        } else {
            return true;
        }
    }
}
