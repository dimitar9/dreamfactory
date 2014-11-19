package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.SurroundedRegions;

public class SurroundedRegionsDfsImpl implements SurroundedRegions {
    private static final int[][] MOVES = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public void solve(char[][] board) {
        final int nRows = board.length;
        if (nRows == 0) {
            return;
        }
        final int nCols = board[0].length;
        if (nCols == 0) {
            return;
        }

        for (int c = 0; c < board[0].length; c++) {
            if (board[0][c] == 'O') {
                fill(board, 0, c);
            }
            if (board[nRows - 1][c] == 'O') {
                fill(board, nRows - 1, c);
            }
        }


        for (int r = 0; r < board.length; r++) {
            if (board[r][0] == 'O') {
                fill(board, r, 0);
            }
            if (board[r][nCols - 1] == 'O') {
                fill(board, r, nCols - 1);
            }
        }


        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == 'A') {
                    board[r][c] = 'O';
                } else {
                    board[r][c] = 'X';
                }
            }
        }
    }

    public void fill(char[][] board, int r, int c) {
        final int nRows = board.length;
        final int nCols = board[0].length;

        board[r][c] = 'A';
        for (int[] m : MOVES) {
            int nr = r + m[0];
            int nc = c + m[1];
            if (0 <= nr && nr < nRows
                    && 0 <= nc && nc < nCols) {
                if (board[nr][nc] == 'O') {
                    fill(board, nr, nc);
                }
            }
        }
    }
}
