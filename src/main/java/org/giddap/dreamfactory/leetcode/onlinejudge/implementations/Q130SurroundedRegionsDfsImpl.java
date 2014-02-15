package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.Q130SurroundedRegions;

public class Q130SurroundedRegionsDfsImpl implements Q130SurroundedRegions {
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public void solve(char[][] board) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        final int numRows = board.length;
        if (numRows == 0) {
            return;
        }
        final int numColumns = board[0].length;
        if (numColumns == 0) {
            return;
        }

        boolean[][] visited = new boolean[numRows][numColumns];
        // top row
        for (int i = 0; i < numColumns; i++) {
            if (board[0][i] == 'O') {
                visited[0][i] = true;
                calcDfs(board, visited, 0, i);
                visited[0][i] = false;
            }
        }

        // left-most column
        for (int i = 0; i < numRows; i++) {
            if (board[i][0] == 'O') {
                visited[i][0] = true;
                calcDfs(board, visited, i, 0);
                visited[i][0] = false;
            }
        }

        // bottom row
        for (int i = 0; i < numColumns; i++) {
            if (board[numRows - 1][i] == 'O') {
                visited[numRows - 1][i] = true;
                calcDfs(board, visited, numRows - 1, i);
                visited[numRows - 1][i] = false;
            }
        }

        // right-most column
        for (int i = 0; i < numRows; i++) {
            if (board[i][numColumns - 1] == 'O') {
                visited[i][numColumns - 1] = true;
                calcDfs(board, visited, i, numColumns - 1);
                visited[i][numColumns - 1] = false;
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (board[i][j] == 'L') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void calcDfs(char[][] board, boolean[][] visited, int row, int column) {
        board[row][column] = 'L';

        for (int[] dir : DIRS) {
            int nextRow = row + dir[0];
            int nextColumn = column + dir[1];
            if (0 <= nextRow && nextRow < board.length
                    && 0 <= nextColumn && nextColumn < board[0].length
                    && !visited[nextRow][nextColumn]
                    && board[nextRow][nextColumn] == 'O') {
                visited[nextRow][nextColumn] = true;
                calcDfs(board, visited, nextRow, nextColumn);
                visited[nextRow][nextColumn] = false;
            }
        }
    }
}
