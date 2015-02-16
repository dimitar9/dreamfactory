package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.onlinejudge.DistinctSubsequences;

/**
 * <ul>
 * <li>Time: O(i*j); Space: O(i*j)</li>
 * </ul>
 * In the above algorithm, in its i-th iteration, it only needs results in
 * (i-1)-th iteration. More specifically, it only needs table[i-1][j] and
 * table[i][j-1]. So, we can use one row, i.e. O(j) space, rather than a 2D table,
 * i.e. O(i*j) space.
 * <p>
 * When we use an 1-dimensional array, at the beginning of i-th iteration,
 * recurs[j] means the number of recurrences of T(0:j) in S(0:i-1) and it can be
 * updated as recurs[j]+=recurs[j-1] if the current character matches.
 * <p>
 * In i-th iteration,<br/>
 * at the beginning, recurs[j] = the number of distinct subsequences of T[0,j]
 * in S[0,i-1];<br/>
 * after being updated, recurs[i] = the number of distinct subsequences of T[0,j]
 * in S[0,i].
 * <p>
 * We have to run from T.length down to 0 since we don't want to overwrite
 * recurs[j] which would be used for recurs[j+1] later.
 */
public class DistinctSubsequencesDpImpl implements DistinctSubsequences {

    @Override
    public int numDistinct(String S, String T) {
        int si = S.length(), ti = T.length();
        if (si <= 0 || ti <= 0 || si < ti) return 0;

        int[] recurs = new int[ti];
        for (int i = 0; i < si; ++i) {
            for (int j = Math.min(i, ti - 1); j >= 0; --j) {
                if (S.charAt(i) == T.charAt(j)) {
                    recurs[j] += (j == 0) ? 1 : recurs[j - 1];
                }
            }
        }
        return recurs[ti - 1];
    }

}
