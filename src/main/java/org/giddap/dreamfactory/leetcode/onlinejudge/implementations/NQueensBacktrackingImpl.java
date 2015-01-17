package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.NQueens;

import java.util.ArrayList;
import java.util.List;


public class NQueensBacktrackingImpl implements NQueens {
    @Override
    public List<String[]> solveNQueens(int n) {
        List<String[]> res = new ArrayList<>();
        buildConfiuration(0, new int[n], res);
        return res;
    }

    private void buildConfiuration(
            int row, int[] cols, List<String[]>res) {
        final int n = cols.length;
        if (row == n) {
            String[] item = new String[n];
            for (int i = 0; i < n; i++) {
                StringBuilder strRow = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (cols[i] == j)
                        strRow.append('Q');
                    else
                        strRow.append('.');
                }
                item[i] = strRow.toString();
            }
            res.add(item);
            return;
        }
        for (int i = 0; i < n; i++) {
            cols[row] = i;
            if (isValidConfiguration(row, cols)) {
                buildConfiuration(row + 1, cols, res);
            }
        }
    }

    private boolean isValidConfiguration(int row, int[] cols) {
        for (int i = 0; i < row; i++) {
            if (cols[row] == cols[i]
                    || Math.abs(cols[row] - cols[i]) == row - i) {
                return false;
            }

        }
        return true;
    }
}
