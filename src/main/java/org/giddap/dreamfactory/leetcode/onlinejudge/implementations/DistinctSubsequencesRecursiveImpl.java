package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.DistinctSubsequences;

/**
 * Backtracking, recursively.
 * if (S[i] == T[i]), there is one more branch: match(S[i + 1], T[j + 1]).
 * for all cases, match(S[i + 1], T[j]);
 */
public class DistinctSubsequencesRecursiveImpl implements DistinctSubsequences {
    @Override
    public int numDistinct(String S, String T) {
        final int m = S.length();
        final int n = T.length();
        if (m == 0 || n == 0) {
            return n == 0 ? 1 : 0;
        } else {
            int r = 0;
            if (S.charAt(0) == T.charAt(0)) {
                r += numDistinct(S.substring(1), T.substring(1));
            }
            r += numDistinct(S.substring(1), T);
            return r;
        }
    }
}
