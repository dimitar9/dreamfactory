package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SudokuSolver;

/**
 * Created by peng on 12/1/14.
 */
public class SudokuSolverImpl implements SudokuSolver {
    private class Pair<A, B> {
        public A first;
        public B second;
        public Pair(A a, B b) {
            first = a; second = b;
        }
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
        public boolean equals(Pair pp) {
            return (pp != null && first==pp.first && second==pp.second);
        }
    }

    private Pair<Integer, Integer> nullCell = new Pair<Integer, Integer>(-1, -1);

    // Find the next empty cell.
    // Return true if found one. Otherwise, return false.
    private Pair<Integer, Integer> findNextEmptyCell(char[][] board, Pair<Integer, Integer> cell) {
        for (int i=cell.first; i<9; ++i) {
            for (int j=(i==cell.first)?cell.second:0; j<9; ++j) {
                if (board[i][j] == '.') {
                    return new Pair<Integer, Integer>(i, j);
                }
            }
        }
        return nullCell;
    }

    // Check whether the board is still valid after fill in a cell.
    // Only need to check the current row/column/box
    private boolean isValidSudoku(char[][] board, Pair<Integer, Integer> cell) {
        // check row and column
        for (int i=0; i<9; ++i) {
            if (i != cell.second && board[cell.first][i] == board[cell.first][cell.second]) {
                return false;
            }
            if (i != cell.first && board[i][cell.second] == board[cell.first][cell.second]) {
                return false;
            }
        }
        // check box
        for (int row=(cell.first/3)*3, i=row; i<row+3; ++i) {
            for (int col=(cell.second)/3*3, j=col; j<col+3; ++j) {
                if (i != cell.first && j != cell.second && board[i][j] == board[cell.first][cell.second]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean solveSudokuHelper(char[][] board, Pair<Integer, Integer> c) {
        Pair<Integer, Integer> cell = findNextEmptyCell(board, c);
        if (cell.equals(nullCell)) return true;
        // try every possible number
        for (int i=1; i<10; ++i) {
            board[cell.first][cell.second] = (char)('0' + i);
            if (isValidSudoku(board, cell) && solveSudokuHelper(board, cell)) {
                return true;
            }
            // recover
            board[cell.first][cell.second] = '.';
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board, new Pair<Integer, Integer>(0, 0));
    }
}
