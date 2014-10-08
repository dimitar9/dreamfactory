package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BinaryTreeMaximumPathSum;

public class BinaryTreeMaximumPathSumImpl implements BinaryTreeMaximumPathSum {

    private int mps = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // Initialize mps
        mps = Integer.MIN_VALUE;
        calculate(root);
        return mps;
    }

    private int calculate(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // Calculate the case where MPS is generated at this node locally
        int left = calculate(node.left);
        int right = calculate(node.right);
        int maxSumHere = node.val;
        maxSumHere = Math.max(maxSumHere, maxSumHere + left);
        maxSumHere = Math.max(maxSumHere, maxSumHere + right);
        mps = Math.max(maxSumHere, mps);

        // Return the max sum from the path passing through this node
        // or this node and its max child
        return Math.max(node.val, Math.max(left, right) + node.val);
    }
}
