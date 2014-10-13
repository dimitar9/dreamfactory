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

        int low = -1;
        int high = rows * cols;

        while (high - low > 1) {
            int mid = low + (high - low) / 2;
            int midVal = matrix[mid / cols][mid % cols];
            if (midVal > target) {
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
