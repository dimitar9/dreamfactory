package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreakII;

import java.util.*;

/**
 *
 */
public class WordBreakIIDpImpl implements WordBreakII {
    @Override
    public List<String> wordBreak(String s, Set<String> dict) {
        List<String> ret = new ArrayList<String>();
        final int len = s.length();
        if (len == 0) {
            return ret;
        }

        boolean[][] memo = new boolean[len + 1][len + 1];
        memo[0][0] = true;

        // initialize the first row
        for (int c = 1; c <= len; c++) {
            memo[0][c] = true;
        }

        // fill out memo
        for (int r = 1; r <= len; r++) {
            for (int i = (r == 1 ? 0 : 1); i <= r - 1; i++) {
                if (memo[i][r - 1]) {
                    for (int c = r; c <= len; c++) {
                        if (dict.contains(s.substring(r - 1, c))) {
                            memo[r][c] = true;
                        }
                    }
                    break;
                }
            }
        }

        // construct word breaks
        Deque<Integer> stack = new ArrayDeque<>();
        return ret;
    }
}
