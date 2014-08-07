package org.giddap.dreamfactory.leetcode.onlinejudge;

import java.util.ArrayList;

/**
 * https://oj.leetcode.com/problems/n-queens/
 * <p/>
 * The n-queens puzzle is the problem of placing n queens on an nxn chessboard such that no two queens attack
 * each other.
 * <p/>
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * <p/>
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a
 * queen and an empty space respectively.
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
 * http://blog.unieagle.net/2012/10/16/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9An-queens%EF%BC%8C%E5%9B%9E%E6%BA%AF/
 * http://gongxuns.blogspot.com/2012/12/leetcoden-queens.html
 * http://www.matrix67.com/blog/archives/266
 * http://hairycode.org/2013/04/12/back-to-the-n-queens-with-backtracking/
 * http://n00tc0d3r.blogspot.com/2013/04/n-queens.html?q=n-queens
 */
public class NQueens {
    public ArrayList<String[]> solveNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        assert (n >= 0);
        ArrayList<String[]> res = new ArrayList<String[]>();
        solveNQueues(1, new int[n], res);
        return res;
    }

    public void solveNQueues(int k, int[] solu, ArrayList<String[]> res) {
        int n = solu.length;
        main:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++)
                if (solu[j] == i || Math.abs(solu[j] - i) == Math.abs(j - k + 1))
                    continue main;
            solu[k - 1] = i;
            if (k == n) {
                String[] temp = new String[n];
                for (int l = 0; l < n; l++) {
                    temp[l] = generateRow(n, solu[l] + 1);
                }
                res.add(temp);
            } else
                solveNQueues(k + 1, solu, res);
        }
    }

    public String generateRow(int n, int k) {
        assert (k > 0 && k <= n);
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < k - 1; i++) {
            res.append(".");
        }
        res.append("Q");
        for (int i = k; i < n; i++) {
            res.append(".");
        }
        return res.toString();
    }
}
