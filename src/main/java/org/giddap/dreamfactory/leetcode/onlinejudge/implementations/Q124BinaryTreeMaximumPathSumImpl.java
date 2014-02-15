package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q124BinaryTreeMaximumPathSum;

public class Q124BinaryTreeMaximumPathSumImpl implements Q124BinaryTreeMaximumPathSum {

    private int maxPathSum = Integer.MIN_VALUE;

    @Override
    public int maxPathSum(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        calculateMaxPathSum(root);
        return maxPathSum;
    }

    public int calculateMaxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = calculateMaxPathSum(root.left);
        int rightSum = calculateMaxPathSum(root.right);
        int maxSum = root.val;
        maxSum = Math.max(maxSum, maxSum + leftSum);
        maxSum = Math.max(maxSum, maxSum + rightSum);

        maxPathSum = Math.max(maxSum, maxPathSum);

        int maxSingleChildSum = Math.max(leftSum, rightSum);
        return maxSingleChildSum > 0 ? maxSingleChildSum + root.val : root.val;
    }
}
