package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.DistinctSubsequences;

/**
 *
 */
public class DistinctSubsequencesRecursiveImpl implements DistinctSubsequences {
    @Override
    public int numDistinct(String S, String T) {
        if (T.length() == 0) {
            return 1;
        }
        if (S.length() < T.length()) {
            return 0;
        } else if (S.length() == T.length()) {
            return S.equals(T) ? 1 : 0;
        } else {
            int ret = 0;
            if (S.charAt(0) == T.charAt(0)) {
                ret += numDistinct(S.substring(1), T.substring(1));
            }
            ret += numDistinct(S.substring(1), T);
            return ret;
        }
    }
}
