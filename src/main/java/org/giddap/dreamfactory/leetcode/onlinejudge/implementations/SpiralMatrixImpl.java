package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixImpl implements SpiralMatrix {
    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<>();
        final int rows = matrix.length;
        final int cols = matrix[0].length;

        if (rows == 0 || cols == 0) {
            return ret;
        }

        final int maxStartRow = (rows - 1) / 2;
        final int maxStartCol = (cols - 1) / 2;

        int startRow = 0;
        int startCol = 0;

        

        return ret;
    }

//    private void build(ArrayList<Integer> ret, int[][] matrix, int layerRow, int layerColumn) {
//        final int rowLen = matrix.length - 2 * layerRow - 1;
//        final int columnLen = matrix[0].length - 2 * layerColumn - 1;
//
//        if (rowLen == 0 && columnLen == 0) {
//            ret.add(matrix[layerRow][layerColumn]);
//            return;
//        }
//
//        if (rowLen == 0) {
//            for (int i = 0; i <= columnLen; i++) {
//                ret.add(matrix[layerRow][layerColumn + i]);
//            }
//            return;
//        }
//
//        if (columnLen == 0) {
//            for (int i = 0; i <= rowLen; i++) {
//                ret.add(matrix[layerRow + i][layerColumn]);
//            }
//            return;
//        }
//
//        // top
//        for (int i = 0; i < columnLen; i++) {
//            ret.add(matrix[layerRow][layerColumn + i]);
//        }
//
//        // right
//        for (int i = 0; i < rowLen; i++) {
//            ret.add(matrix[layerRow + i][layerColumn + columnLen]);
//        }
//
//        // bottom
//        for (int i = columnLen; i > 0; i--) {
//            ret.add(matrix[layerRow + rowLen][layerColumn + i]);
//        }
//
//        // left
//        for (int i = rowLen; i > 0; i--) {
//            ret.add(matrix[layerRow + i][layerColumn]);
//        }
//
//        if (rowLen > 1 && columnLen > 1) {
//            build(ret, matrix, layerRow + 1, layerColumn + 1);
//        }
//    }
}
