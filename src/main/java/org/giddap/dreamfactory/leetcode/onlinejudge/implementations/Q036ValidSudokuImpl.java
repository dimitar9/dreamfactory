package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q036ValidSudoku;

public class Q036ValidSudokuImpl implements Q036ValidSudoku {
    @Override
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function

        final int numRows = board.length;
        if (numRows == 0) {
            return false;
        }
        final int numColumns = board[0].length;
        if (numColumns == 0) {
            return false;
        }

        int[] row = new int[numRows];
        int[] column = new int[numColumns];
        int[] cube = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (board[i][j] != '.') {
                    int value = board[i][j] - '1';
                    if (value < 0 || value > 8) {
                        return false;
                    }

                    int cubeIdx = (i / 3) * 3 + j / 3;

                    if ((row[i] & (1 << value)) != 0) {
                        return false;
                    }

                    if ((column[j] & (1 << value)) != 0) {
                        return false;
                    }

                    if ((cube[cubeIdx] & (1 << value)) != 0) {
                        return false;
                    }

                    row[i] |= 1 << value;
                    column[j] |= 1 << value;
                    cube[cubeIdx] |= 1 << value;
                }
            }
        }
        return true;
    }
}
