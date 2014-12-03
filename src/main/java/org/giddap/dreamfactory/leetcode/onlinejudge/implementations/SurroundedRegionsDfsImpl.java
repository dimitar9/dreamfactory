package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.SurroundedRegions;

import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegionsDfsImpl implements SurroundedRegions {
    private void mark(char[][] board, int row, int col, Queue<Integer> que) {
        if (board[row][col] != 'O') {
            return;
        }
        board[row][col] = 'N';
        int columns = board[0].length;
        que.offer(row * columns + col);
    }

    private void markBFS(char[][] board, int row, int col) {
        Queue<Integer> que = new LinkedList<Integer>();
        mark(board, row, col, que);
        int rows = board.length, columns = board[0].length;
        while (!que.isEmpty()) {
            int cell = que.poll();
            int x = cell / columns, y = cell % columns;
            // push its neighbors to stack if needed
            if (x+1 < rows-1)  mark(board, x+1, y, que);
            if (x-1 > 0)  mark(board, x-1, y, que);
            if (y+1 < columns-1)  mark(board, x, y+1, que);
            if (y-1 > 0)  mark(board, x, y-1, que);
        }
    }

    private void markDFS(char[][] board, int x, int y) {
        if (board[x][y] != 'O') {
            return;
        }
        // mark the current node
        board[x][y] = 'N';
        // mark its neighbors if needed
        int rows = board.length, columns = board[0].length;
        if (x+1 < rows-1)  markDFS(board, x+1, y);
        if (x-1 > 0)  markDFS(board, x-1, y);
        if (y+1 < columns-1)  markDFS(board, x, y+1);
        if (y-1 > 0)  markDFS(board, x, y-1);
    }

    public void solve(char[][] board) {
        if (board.length <= 0 || board[0].length <= 0) return;
        int rows = board.length, columns = board[0].length;

        // Start from 'O's on the edge and mark connected ones as non-flipable.
        // first and last columns
        for (int i=1; columns>2 && i<rows-1; ++i) {
            if (board[i][0] == 'O')  markBFS(board, i, 1);
            if (board[i][columns-1] == 'O')  markBFS(board, i, columns-2);
        }
        // first and last rows
        for (int j=1; rows>2 && j<columns-1; ++j) {
            if (board[0][j] == 'O')  markBFS(board, 1, j);
            if (board[rows-1][j] == 'O')  markBFS(board, rows-2, j);
        }

        // flip
        for (int i=1; i<rows-1; ++i) {
            for (int j=1; j<columns-1; ++j) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'N') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
