package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.NQueens;

import java.util.ArrayList;


public class NQueensBacktrackingImpl implements NQueens {
    @Override
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
        http://HELLO
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++)
                if (solu[j] == i || Math.abs(solu[j] - i) == Math.abs(j - k + 1))
                    continue http;
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
