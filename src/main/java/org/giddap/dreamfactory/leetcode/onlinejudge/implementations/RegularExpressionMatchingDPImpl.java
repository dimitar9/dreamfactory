package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.RegularExpressionMatching;

/**
 * http://wizardrichard.blogspot.com/2013/02/leetcode-regular-expression-matching.html
 */
public class RegularExpressionMatchingDPImpl implements RegularExpressionMatching {

    @Override
    public boolean isMatch(String s, String p) {

        int m = s.length() + 1;
        int n = p.length() + 1;
        boolean[][] result = new boolean[n][m];

        result[0][0] = true;
        for (int i = 1; i < n; i++) {
            result[i][0] = p.charAt(i - 1) == '*' ? result[i - 2][0] : false;
        }
        for (int j = 1; j < m; j++) {
            result[0][j] = s.charAt(j - 1) == '*' ? result[0][j - 2] : false;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (p.charAt(i - 1) == '*')
                    result[i][j] = match(s.charAt(j - 1), p.charAt(i - 2)) ? (result[i][j - 1] || result[i - 2][j]) : result[i - 2][j];
                else
                    result[i][j] = match(s.charAt(j - 1), p.charAt(i - 1)) ? result[i - 1][j - 1] : false;
            }
        }
        return result[n - 1][m - 1];
    }

    boolean match(char a, char b) {
        if (a == '.' || b == '.')
            return true;
        else
            return a == b;
    }
}
