package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreak;

import java.util.Set;

/**
 * dp[i] = dp[j] && dict.contains(s[j + 1, i]), where 0 <= j <= i
 */
public class WordBreakDpImpl implements WordBreak {
    @Override
    public boolean wordBreak(String s, Set<String> dict) {
        final int n = s.length();
        if (n == 0) {
            return true;
        }
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j <= i) {
                if (dp[j] && dict.contains(s.substring(j, i + 1))) {
                    dp[i + 1] = true;
                    break;
                }
                j++;
            }
        }
        return dp[n];
    }
}
