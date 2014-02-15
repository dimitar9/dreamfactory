package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q112PathSum;

public class Q112PathSumRecursiveDfsImpl implements Q112PathSum {
    @Override
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) {
            return false;
        }

        int newSum = sum - root.val;
        if (root.left == null && root.right == null) {
            return newSum == 0;
        }

        return hasPathSum(root.left, newSum) || hasPathSum(root.right, newSum);
    }
}
