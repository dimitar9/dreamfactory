package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q098ValidateBinarySearchTree;

public class Q098ValidateBinarySearchTreeRecursiveImpl implements Q098ValidateBinarySearchTree {
    @Override
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return isValidBinarySearchTreeNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBinarySearchTreeNode(TreeNode r, int lower, int upper) {
        if (r == null)
            return true;
        if (r.val <= lower || r.val >= upper)
            return false;
        return isValidBinarySearchTreeNode(r.left, lower, r.val) && isValidBinarySearchTreeNode(r.right, r.val, upper);
    }
}
