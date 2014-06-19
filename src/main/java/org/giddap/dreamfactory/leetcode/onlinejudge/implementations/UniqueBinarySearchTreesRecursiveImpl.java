package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.onlinejudge.UniqueBinarySearchTrees;


public class UniqueBinarySearchTreesRecursiveImpl implements UniqueBinarySearchTrees {
    private int[] dp;

    @Override
    public int numTrees(int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        dp = new int[n + 1];
        if (n < 0) {
            return -1;
        }
        return helper(n);
    }

    private int helper(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            int left = 0;
            if (dp[i - 1] == 0) {
                left = helper(i - 1);
                dp[i - 1] = left;
            } else {
                left = dp[i - 1];
            }

            int right = 0;
            if (dp[n - i] == 0) {
                right = helper(n - i);
                dp[n - i] = right;
            } else {
                right = dp[n - i];
            }
            ret += left * right;
        }
        return ret;
    }
}
