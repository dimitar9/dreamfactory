package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.Point;
import org.giddap.dreamfactory.leetcode.onlinejudge.WordSearch;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 弼馬溫注解：
 * <ul>
 * <li>Need to have the complete set of states for each cell in each
 * attempt.</li>
 * </ul>
 */
public class WordSearchDfsIterativeImpl implements WordSearch {
    private final static int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) {
            return false;
        }
        final int numRows = board.length;
        if (numRows == 0) {
            return false;
        }
        final int numCols = board[0].length;
        if (numCols == 0) {
            return false;
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (board[i][j] == word.charAt(0) && matchWord(board, i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean matchWord(char[][] board, int r, int c, String word) {

        Stack<CellAndAncestors> frontier = new Stack<CellAndAncestors>();
        CellAndAncestors root = new CellAndAncestors();
        root.word = word;
        root.cell = new Point(r, c);
        frontier.push(root);

        while (!frontier.isEmpty()) {
            CellAndAncestors cellAndAncestors = frontier.pop();
            if (cellAndAncestors.word.length() == 1) {
                return true;
            }
            String remaining = cellAndAncestors.word.substring(1);

            Point cell = cellAndAncestors.cell;
            for (int[] dir : DIRS) {
                Point nextCell = new Point(cell.getX() + dir[0],
                        cell.getY() + dir[1]);
                if ((0 <= nextCell.getX() && nextCell.getX() < board.length
                        && 0 <= nextCell.getY()
                        && nextCell.getY() < board[0].length)
                        && !cellAndAncestors.ancestors.contains(nextCell)
                        && board[nextCell.getX()][nextCell.getY()] ==
                        remaining.charAt(0)) {
                    CellAndAncestors next = new CellAndAncestors();
                    next.ancestors.addAll(cellAndAncestors.ancestors);
                    next.ancestors.add(cell);
                    next.word = remaining;
                    next.cell = nextCell;
                    frontier.push(next);
                }
            }
        }
        return false;
    }

    private static class CellAndAncestors {
        Point cell;
        Set<Point> ancestors = new HashSet<Point>();
        String word;
    }
}
