package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PathSum;

/**
 * DFS.
 */
public class PathSumRecursiveDfsImpl implements PathSum {
    @Override
    public boolean hasPathSum(TreeNode root, int sum) {
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
