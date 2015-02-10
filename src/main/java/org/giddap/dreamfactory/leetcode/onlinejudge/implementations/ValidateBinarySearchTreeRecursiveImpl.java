package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ValidateBinarySearchTree;

/**
 * Recursively validate the binary search tree, node by node, from top to bottom.
 */
public class ValidateBinarySearchTreeRecursiveImpl implements ValidateBinarySearchTree {
    @Override
    public boolean isValidBST(TreeNode root) {
        return validate(root, ((long) Integer.MIN_VALUE) - 1, ((long) Integer.MAX_VALUE) + 1);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
