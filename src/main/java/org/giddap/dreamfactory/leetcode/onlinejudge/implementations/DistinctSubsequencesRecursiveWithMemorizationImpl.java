package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.DistinctSubsequences;

/**
 * Created by peng on 12/2/14.
 */
public class DistinctSubsequencesRecursiveWithMemorizationImpl implements DistinctSubsequences {

    int[][] memo;

    @Override
    public int numDistinct(String S, String T) {
        int si = S.length(), ti = T.length();
        if (si<=0 || ti<=0 || si<ti) return 0;

        int[][] dptable = new int[si][ti];
        if (S.charAt(0) == T.charAt(0))
            dptable[0][0] = 1;
        else
            dptable[0][0] = 0;
        for (int j=0; j<ti; ++j) {
            for (int i=1; i<si; ++i) {
                dptable[i][j] = dptable[i-1][j];
                if (S.charAt(i) == T.charAt(j)) {
                    if (j==0)
                        dptable[i][j] += 1;
                    else
                        dptable[i][j] += dptable[i-1][j-1];
                }
            }
        }

        return dptable[si-1][ti-1];
    }
}
