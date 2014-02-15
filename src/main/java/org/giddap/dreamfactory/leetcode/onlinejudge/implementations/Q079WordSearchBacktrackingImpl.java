package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q079WordSearch;

public class Q079WordSearchBacktrackingImpl implements Q079WordSearch {

    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean exist(char[][] board, String word) {
        final int numRows = board.length;
        if (numRows == 0) {
            return false;
        }
        final int numColumns = board[0].length;
        if (numColumns == 0) {
            return false;
        }
        boolean[][] visited = new boolean[numRows][numColumns];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    if (dfs(board, word, i, j, visited)) {
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String suffix, int row, int column, boolean[][] visited) {
        final int len = suffix.length();
        if (len == 0) {
            return true;
        }
        if (suffix.charAt(0) != board[row][column]) {
            return false;
        }

        String nextWord = suffix.substring(1);
        if (nextWord.length() == 0) {
            return true;
        }
        for (int[] dir : DIRS) {
            int nextRow = row + dir[0];
            int nextColumn = column + dir[1];
            if (0 <= nextRow && nextRow < board.length
                    && 0 <= nextColumn && nextColumn < board[0].length
                    && !visited[nextRow][nextColumn]) {
                visited[nextRow][nextColumn] = true;
                if (dfs(board, nextWord, nextRow, nextColumn, visited)) {
                    return true;
                }
                visited[nextRow][nextColumn] = false;
            }
        }

        return false;
    }
}
