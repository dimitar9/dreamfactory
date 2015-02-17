package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeMaximumPathSum;

/**
 * Traverse the binary tree via DFS.
 * At each node,
 * * First decide locally,
 * ** case i: left + node.val
 * ** case ii: right + node.val
 * ** case iii: node.val
 * ** Update the max-path-sum, if needed.
 * * Secondly, pass up to the parent node:
 * ** case i: node.val
 * ** case ii: node.val + max(left, right)
 *
 * A trick would be use max(0, left) and max(0, right) to ensure we don't
 * count subtrees with negetive sums. This reduces the number of conditions
 * to check.
 */
public class BinaryTreeMaximumPathSumImpl implements BinaryTreeMaximumPathSum {
    private int mps = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        mps = Math.max(helper(root), mps);
        return mps;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        mps = Math.max(left + root.val + right, mps);

        return Math.max(root.val, root.val + Math.max(left, right));
    }
}
