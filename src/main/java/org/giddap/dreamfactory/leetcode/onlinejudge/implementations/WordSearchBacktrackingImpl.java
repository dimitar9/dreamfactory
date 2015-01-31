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
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                visited[i][j] = true;
                if (search(board, word, visited, i, j)) {
                    return true;
                }
                visited[i][j] = false;
            }
        }
        return false;
    }

    private final static int[][] MOVES =
            new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

    private boolean search(
            char[][] board, String word, boolean[][] visited, final int x, final int y) {
        char c = word.length() == 0 ? '\0' : word.charAt(0);
        if (c != board[x][y]) {
            return false;
        } else if (word.length() == 1) {
            return true;
        } else {
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
            return false;
        }
    }
}
