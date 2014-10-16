package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SpiralMatrix;

import java.util.ArrayList;

public class SpiralMatrixImpl implements SpiralMatrix {
    @Override
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return ret;
        }
        build(ret, matrix, 0, 0);
        return ret;
    }

    private void build(ArrayList<Integer> ret, int[][] matrix, int layerRow, int layerColumn) {
        final int rowLen = matrix.length - 2 * layerRow - 1;
        final int columnLen = matrix[0].length - 2 * layerColumn - 1;

        if (rowLen == 0 && columnLen == 0) {
            ret.add(matrix[layerRow][layerColumn]);
            return;
        }

        if (rowLen == 0) {
            for (int i = 0; i <= columnLen; i++) {
                ret.add(matrix[layerRow][layerColumn + i]);
            }
            return;
        }

        if (columnLen == 0) {
            for (int i = 0; i <= rowLen; i++) {
                ret.add(matrix[layerRow + i][layerColumn]);
            }
            return;
        }

        // top
        for (int i = 0; i < columnLen; i++) {
            ret.add(matrix[layerRow][layerColumn + i]);
        }

        // right
        for (int i = 0; i < rowLen; i++) {
            ret.add(matrix[layerRow + i][layerColumn + columnLen]);
        }

        // bottom
        for (int i = columnLen; i > 0; i--) {
            ret.add(matrix[layerRow + rowLen][layerColumn + i]);
        }

        // left
        for (int i = rowLen; i > 0; i--) {
            ret.add(matrix[layerRow + i][layerColumn]);
        }

        if (rowLen > 1 && columnLen > 1) {
            build(ret, matrix, layerRow + 1, layerColumn + 1);
        }
    }
}
