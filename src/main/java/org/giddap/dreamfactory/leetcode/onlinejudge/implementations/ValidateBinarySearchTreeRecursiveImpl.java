package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ValidateBinarySearchTree;

public class ValidateBinarySearchTreeRecursiveImpl implements ValidateBinarySearchTree {
    @Override
    public boolean isValidBST(TreeNode root) {
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validate(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
