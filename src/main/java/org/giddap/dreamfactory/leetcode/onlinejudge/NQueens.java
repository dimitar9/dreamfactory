package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;
import java.util.List;

/**
 * https://oj.leetcode.com/problems/n-queens/
 * <p/>
 * The n-queens puzzle is the problem of placing n queens on an nxn chessboard
 * such that no two queens attack each other.
 * <p/>
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * <p/>
 * Each solution contains a distinct board configuration of the n-queens'
 * placement, where 'Q' and '.' both indicate a queen and an empty space
 * respectively.
 * <p/>
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 * <p/>
 * [
 * [".Q..",  // Solution 1
 * "...Q",
 * "Q...",
 * "..Q."],
 * <p/>
 * ["..Q.",  // Solution 2
 * "Q...",
 * "...Q",
 * ".Q.."]
 * ]
 * <p/>
 * Good articles:
 * http://polythinking.wordpress.com/2013/02/27/leetcoden-queens-i-and-ii/
 * http://discuss.leetcode.com/questions/229/n-queens
 * http://www.matrix67.com/blog/archives/266
 * http://n00tc0d3r.blogspot.com/2013/04/n-queens.html?q=n-queens
 */
public interface NQueens {
    List<String[]> solveNQueens(int n);
}
