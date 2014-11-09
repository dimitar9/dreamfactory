package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.LongestValidParentheses;

public class LongestValidParenthesesDpImpl implements LongestValidParentheses {
    @Override
    public int longestValidParentheses(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int len = s.length();
        int[] dp = new int[len];
        dp[len - 1] = 0;
        int gmax = 0;
        for (int i = len - 2; i >= 0; --i) {
            dp[i] = 0;
            if (s.charAt(i) == '(') {
                int j = i + 1 + dp[i + 1];
                // look for the ')' hopping over the
                // valid sequences starting from i+1
                if (j < len && s.charAt(j) == ')') {
                    dp[i] = 2 + dp[i + 1];
                    dp[i] += j + 1 < len ? dp[j + 1] : 0;
                }
                gmax = Math.max(gmax, dp[i]);
            }
        }
        return gmax;
    }
}
