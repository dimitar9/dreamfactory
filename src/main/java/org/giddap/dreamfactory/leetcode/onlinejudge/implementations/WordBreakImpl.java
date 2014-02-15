package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.WordBreak;

import java.util.Set;

/**
 *
 */
public class WordBreakImpl implements WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        final int len = s.length();
        if (len == 0) {
            return true;
        }

        boolean[] breakables = new boolean[len + 1];
        breakables[0] = true;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (breakables[j] && dict.contains(s.substring(j, i + 1))) {
                    breakables[i + 1] = true;
                    break;
                }
            }
        }
        return breakables[len];
    }
}
