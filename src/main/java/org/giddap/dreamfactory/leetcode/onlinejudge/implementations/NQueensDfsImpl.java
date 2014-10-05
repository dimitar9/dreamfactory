package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.NQueens;

import java.util.ArrayList;
import java.util.List;

public class NQueensDfsImpl implements NQueens {
    public List<String[]> solveNQueens(int n) {
        List<String[]> ret = new ArrayList<String[]>();
        boolean[][] s = new boolean[n][n];
        findSolution(ret, s, 0);
        return ret;
    }

    private void findSolution(List<String[]> ret, boolean[][] s, int c) {
        if (c == s.length) {
            ret.add(convert(s));
        } else {
            for (int r = 0; r < s.length; r++) {
                if (findVacancy(r, c, s)) {
                    s[r][c] = true;
                    findSolution(ret, s, c + 1);
                    s[r][c] = false;
                }
            }
        }
    }

    private String[] convert(boolean[][] s) {
        String[] one = new String[s.length];
        for (int r = 0;r < s.length; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < s.length; c++) {
                if (s[r][c]) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            one[r] = sb.toString();
        }
        return one;
    }

    // Only need to check the left-hand side which is covered area so far
    // Don't have to check 'column' as we know for sure that column 0th to Cth
    // have been covered.
    private boolean findVacancy(final int r, final int c, boolean[][] s) {
        final int n = s.length;

        // row
        for (int i = 0; i < c; i++) {
            if (s[r][i]) {
                return false;
            }
        }

        // diagonal - from upper left to down right
        // left
        int rr = r - 1;
        int cc = c - 1;
        while (rr >= 0 && cc >= 0) {
            if (s[rr][cc]) {
                return false;
            }
            rr -= 1;
            cc -= 1;
        }

        // diagonal - from upper right to down left
        // left
        rr = r + 1;
        cc = c - 1;
        while (rr < n && cc >= 0) {
            if (s[rr][cc]) {
                return false;
            }
            rr += 1;
            cc -= 1;
        }

        return true;
    }
}
