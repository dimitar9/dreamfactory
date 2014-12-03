package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.DistinctSubsequences;

public class DistinctSubsequencesDpImpl implements DistinctSubsequences {

    @Override
    public int numDistinct(String S, String T) {
        int si = S.length(), ti = T.length();
        if (si<=0 || ti<=0 || si<ti) return 0;

        int[] recurs = new int[ti];
        for (int i=0; i<si; ++i) {
            for (int j=Math.min(i, ti-1); j>=0; --j) {
                if (S.charAt(i)==T.charAt(j)) {
                    recurs[j] += (j==0) ? 1 : recurs[j-1];
                }
            }
        }
        return recurs[ti-1];
    }

}
