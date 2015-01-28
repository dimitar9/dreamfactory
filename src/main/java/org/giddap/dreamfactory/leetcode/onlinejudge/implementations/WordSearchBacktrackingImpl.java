package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordSearch;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Classical DFS with Backtracking and Pruning.</li>
 * <li>Time complexity: n*m*3^k</li>
 * <li>Space complexity: n*m</li>
 * <li>Note we use the following to represent possible movements:
 * <pre>
 * int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
 * ...
 * for (int[] dir : DIRS) {
 *     int nextRow = row + dir[0];
 *     int nextColumn = column + dir[1];
 *     ...
 * }
 * </pre>
 * </li>
 * <li>Pruning condition:
 * <ol>
 * <li>Still within bournds.</li>
 * <li>Haven't visited before.</li>
 * <li>Matching character.</li>
 * </ol>
 * </li>
 * <li>We use a m*n matrix to track visitaion history.</li>
 * </ul>
 */
public class WordSearchBacktrackingImpl implements WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] visited = new boolean[board.length][board[0].length];
                if (search(board, word, visited, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final static int[][] MOVES =
            new int[][]{{0, -1}, {0, 1}, {1, 0}, {0, 1}};

    private boolean search(
            char[][] board, String word, boolean[][] visited, final int x, final int y) {
        if (word.length() == 0) {
            return true;
        } else {
            if (word.charAt(0) == board[x][y]) {
                visited[x][y] = true;
                for (int[] move : MOVES) {
                    final int xx = x + move[0];
                    final int yy = y + move[1];
                    if (0 <= xx && xx < board.length
                            && 0 <= yy && yy < board[0].length
                            && !visited[xx][yy]) {
                        visited[xx][yy] = true;
                        if (search(board, word.substring(1), visited, xx, yy)) {
                            return true;
                        }
                        visited[xx][yy] = false;
                    }
                }
            }
            return false;
        }
    }

//    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
//
//    public boolean exist(char[][] board, String word) {
//        final int numRows = board.length;
//        if (numRows == 0) {
//            return false;
//        }
//        final int numColumns = board[0].length;
//        if (numColumns == 0) {
//            return false;
//        }
//        boolean[][] visited = new boolean[numRows][numColumns];
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < numColumns; j++) {
//                if (board[i][j] == word.charAt(0)) {
//                    visited[i][j] = true;
//                    if (dfs(board, word, i, j, visited)) {
//                        return true;
//                    }
//                    visited[i][j] = false;
//                }
//            }
//        }
//        return false;
//    }
//
//    private boolean dfs(char[][] board, String suffix, int row, int column, boolean[][] visited) {
//        final int len = suffix.length();
//        if (len == 0) {
//            return true;
//        }
//        if (suffix.charAt(0) != board[row][column]) {
//            return false;
//        }
//
//        String nextWord = suffix.substring(1);
//        if (nextWord.length() == 0) {
//            return true;
//        }
//        for (int[] dir : DIRS) {
//            int nextRow = row + dir[0];
//            int nextColumn = column + dir[1];
//            if (0 <= nextRow && nextRow < board.length
//                    && 0 <= nextColumn && nextColumn < board[0].length
//                    && !visited[nextRow][nextColumn]) {
//                visited[nextRow][nextColumn] = true;
//                if (dfs(board, nextWord, nextRow, nextColumn, visited)) {
//                    return true;
//                }
//                visited[nextRow][nextColumn] = false;
//            }
//        }
//
//        return false;
//    }
}
