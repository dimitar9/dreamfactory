package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q044WildcardMatching;

import java.util.Arrays;

public class Q044WildcardMatchingDPImpl implements Q044WildcardMatching {
    @Override
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[2][n + 1];
        dp[m % 2][n] = true;
        for (int i = m - 1; i >= 0; i--) {
            Arrays.fill(dp[i % 2], false);
            if (p.charAt(i) == '*') {
                for (int j = n; j >= 0; j--) {
                    if (dp[(i + 1) % 2][j]) {
                        for (; j >= 0; j--)
                            dp[i % 2][j] = true;
                    }
                }
            } else {
                for (int j = n - 1; j >= 0; j--)
                    dp[i % 2][j] = (p.charAt(i) == s.charAt(j) || p.charAt(i) == '?') && dp[(i + 1) % 2]
                            [j + 1];
            }
        }
        return dp[0][0];
    }
}
