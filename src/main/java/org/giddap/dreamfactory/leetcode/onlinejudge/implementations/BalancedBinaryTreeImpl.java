package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.BalancedBinaryTree;

public class BalancedBinaryTreeImpl implements BalancedBinaryTree {
    @Override
    public boolean isBalanced(TreeNode root) {
        return calcHeight(root) != -1;
    }

    private int calcHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calcHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = calcHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}