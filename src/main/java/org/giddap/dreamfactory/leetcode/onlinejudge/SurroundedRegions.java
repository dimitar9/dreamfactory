package org.giddap.dreamfactory.leetcode.onlinejudge;

/**
 * http://leetcode.com/onlinejudge#question_130
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
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/1223/surrounded-regions
 * http://blog.sina.com.cn/s/blog_b9285de20101j1dt.html
 */
public interface SurroundedRegions {
    void solve(char[][] board);
}
