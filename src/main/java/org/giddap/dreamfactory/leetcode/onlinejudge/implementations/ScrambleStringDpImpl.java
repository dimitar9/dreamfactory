package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.ScrambleString;

public class ScrambleStringDpImpl implements ScrambleString {
    @Override
    public boolean isScramble(String s1, String s2) {
        return false;



































//        int n = s1.length();
//        boolean[][][] dp = new boolean[n][n][n + 1];
//
//        for (int i = n - 1; i >= 0; i--)
//            for (int j = n - 1; j >= 0; j--)
//                for (int k = 1; k <= n - Math.max(i, j); k++) {
//                    if (s1.substring(i, i + k).equals(s2.substring(j, j + k)))
//                        dp[i][j][k] = true;
//                    else {
//                        for (int l = 1; l < k; l++) {
//                            if (dp[i][j][l] && dp[i + l][j + l][k - l] || dp[i][j + k - l][l] && dp[i + l][j][k - l]) {
//                                dp[i][j][k] = true;
//                                break;
//                            }
//                        }
//                    }
//                }
//
//        return dp[0][0][n];
    }
}
