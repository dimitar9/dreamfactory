package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.DistinctSubsequences;

/**
 * 遇到这种两个串的问题，很容易想到DP。但是这道题的递推关系不明显。
 * 可以先尝试做一个二维的表int[][] dp，用来记录匹配子序列的个数（
 * 以S ="rabbbit",T = "rabbit"为例）：
 * <pre>
 *     r a b b b i t
 *   1 1 1 1 1 1 1 1
 * r 0 1 1 1 1 1 1 1
 * a 0 0 1 1 1 1 1 1
 * b 0 0 0 1 2 3 3 3
 * b 0 0 0 0 1 3 3 3
 * i 0 0 0 0 0 0 3 3
 * t 0 0 0 0 0 0 0 3
 * </pre>
 * 从这个表可以看出，无论T的字符与S的字符是否匹配，dp[i][j] = dp[i][j - 1].
 * 就是说，假设S已经匹配了j - 1个字符，得到匹配个数为dp[i][j - 1].
 * 现在无论S[j]是不是和T[i]匹配，匹配的个数至少是dp[i][j - 1]。除此之外，
 * 当S[j]和T[i]相等时，我们可以让S[j]和T[i]匹配，然后让S[j - 1]和T[i - 1]去匹配。所以递推关系为：
 * <pre>
 * * dp[0][0] = 1; // T和S都是空串.
 * * dp[0][1 ... S.length() - 1] = 1; // T是空串，S只有一种子序列匹配。
 * * dp[1 ... T.length() - 1][0] = 0; // S是空串，T不是空串，S没有子序列匹配。
 * * dp[i][j] = dp[i][j - 1] + (T[i - 1] == S[j - 1] ? dp[i - 1][j - 1] : 0).
 * 1 <= i <= T.length(), 1 <= j <= S.length()
 * </pre>
 */
public class DistinctSubsequencesDpWith2DArrayImpl implements DistinctSubsequences {
    @Override
    public int numDistinct(String S, String T) {
        final int m = S.length();
        final int n = T.length();
        int[][] dp = new int[n + 1][m + 1];
        dp[0][0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i < m; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i][j - 1];
                if (T.charAt(i - 1) == S.charAt(j - 1)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }

        return dp[n][m];
    }
}
