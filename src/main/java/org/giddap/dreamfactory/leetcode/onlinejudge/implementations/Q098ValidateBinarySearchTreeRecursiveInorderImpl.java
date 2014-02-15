package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q098ValidateBinarySearchTree;

/**
 *
 */
public class Q098ValidateBinarySearchTreeRecursiveInorderImpl implements Q098ValidateBinarySearchTree {
    /**
     * In-order traversal
     */
    TreeNode prev;

    @Override
    public boolean isValidBST(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        prev = new TreeNode(Integer.MIN_VALUE);
        return validate(root);
    }

    public boolean validate(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (validate(root.left)) {
            if (prev != null && prev.val >= root.val) {
                return false;
            }
        } else {
            return false;
        }

        prev = root;

        return validate(root.right);
    }
}
