package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.SurroundedRegions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS with a queue.
 */
public class SurroundedRegionsBfsIterativeImpl implements SurroundedRegions {
    @Override
    public void solve(char[][] board) {
        final int rows = board.length;
        if (rows < 1) {
            return;
        }
        final int cols = board[0].length;
        if (cols < 1) {
            return;
        }

        // top row
        for (int i = 0; i < cols; i++) {
            if (board[0][i] == 'O') {
                helper(board, new Point(0, i));
            }
        }

        // right-most col
        for (int i = 0; i < rows; i++) {
            if (board[i][cols - 1] == 'O') {
                helper(board, new Point(i, cols - 1));
            }
        }

        // bottom row
        for (int i = 0; i < cols; i++) {
            if (board[rows - 1][i] == 'O') {
                helper(board, new Point(rows - 1, i));
            }
        }

        // left-most col
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                helper(board, new Point(i, 0));
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = (board[i][j] == 'S') ? 'O' : 'X';
            }
        }
    }

    private final static int[][] MOVES =
            new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private void helper(char[][] b, Point s) {
        Queue<Point> explore = new LinkedList<>();
        explore.offer(s);
        while (!explore.isEmpty()) {
            Point curr = explore.poll();
            // change 'X' to 'S'
            b[curr.x][curr.y] = 'S';
            // go to the next level
            for (int i = 0; i < MOVES.length; i++) {
                int nx = curr.x + MOVES[i][0];
                int ny = curr.y + MOVES[i][1];
                if (0 <= nx && nx < b.length
                        && 0 <= ny && ny < b[0].length
                        && b[nx][ny] == 'O') {
                    explore.offer(new Point(nx, ny));
                }
            }
        }
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
