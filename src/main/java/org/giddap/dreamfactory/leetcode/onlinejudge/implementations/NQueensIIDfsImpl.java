package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.NQueensII;

/**
 * http://leetcode.com/onlinejudge#question_52
 * <p/>
 * Follow up for N-Queens problem.
 * <p/>
 * Now, instead outputting board configurations, return the total number of distinct solutions.
 * <p/>
 * Links:
 * http://polythinking.wordpress.com/2013/02/27/leetcoden-queens-i-and-ii/
 * http://www.matrix67.com/blog/archives/266
 * http://discuss.leetcode.com/questions/230/n-queens-ii
 * http://www.mitbbs.com/article_t/JobHunting/32167017.html
 * http://poj.org/showmessage?message_id=73325
 * http://www.mitbbs.com/article_t/JobHunting/32283621.html
 */
public class NQueensIIDfsImpl implements NQueensII {
    private long sum;

    @Override
    public int totalNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n < 1) {
            return 0;
        }

        long sum = 0;

        long upperlimit = 1;

        upperlimit = (upperlimit << n) - 1;

        compute(upperlimit, 0, 0, 0);

        return (int) sum;
    }

    public void compute(long upperlimit, long row, long leftDiagonal, long rightDiagonal) {
        if (row == upperlimit) {
            sum++;
        } else {
            long pos = upperlimit & ~(row | leftDiagonal | rightDiagonal);

            while (pos != 0) {
                long p = pos & -pos;
                pos = pos - p;
                compute(upperlimit, row + p, (leftDiagonal + p) << 1, (rightDiagonal + p) >> 1);
            }
        }
    }
}
