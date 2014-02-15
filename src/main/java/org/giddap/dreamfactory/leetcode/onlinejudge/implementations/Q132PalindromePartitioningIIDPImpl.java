package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.Q132PalindromePartitioningII;

public class Q132PalindromePartitioningIIDPImpl implements Q132PalindromePartitioningII {

    @Override
    public int minCut(String s) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int length = s.length();
        int[] dp = new int[length + 1];
        boolean[][] palins = new boolean[length][length];

        for (int i = length; i >= 0; i--) {
            dp[i] = length - i;
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = i; j < length; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || palins[i + 1][j - 1])) {
                    palins[i][j] = true;
                    dp[i] = Math.min(dp[i], dp[j + 1] + 1);
                }
            }
        }

        return dp[0] - 1;
    }
}
