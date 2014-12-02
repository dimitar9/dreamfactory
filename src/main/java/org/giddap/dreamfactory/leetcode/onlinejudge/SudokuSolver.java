package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://leetcode.com/onlinejudge#question_37
 * <p/>
 * Good article:
 * http://en.wikipedia.org/wiki/Sudoku_solving_algorithms
 * http://norvig.com/sudoku.html
 * http://www.ocf.berkeley.edu/~jchu/publicportal/sudoku/sudoku.paper.html
 * http://en.wikipedia.org/wiki/Dancing_Links
 */
public interface SudokuSolver {
    void solveSudoku(char[][] board);
}
