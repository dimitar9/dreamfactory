package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * https://oj.leetcode.com/problems/surrounded-regions/
 * <p/>
 * Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.
 * <p/>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region .
 * <p/>
 * <pre>
 * For example,
 *
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 *
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * </pre>
 */
public interface SurroundedRegions {
    void solve(char[][] board);
}
