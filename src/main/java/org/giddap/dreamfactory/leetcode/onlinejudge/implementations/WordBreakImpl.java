package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreak;

import java.util.Set;

/**
 *
 */
public class WordBreakImpl implements WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
        final int len = s.length();
        if (len == 0) {
            return false;
        }

        boolean[] memo = new boolean[len + 1];
        memo[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= i; j++) {
                if (memo[j] && dict.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }

        return memo[len];
    }
}
