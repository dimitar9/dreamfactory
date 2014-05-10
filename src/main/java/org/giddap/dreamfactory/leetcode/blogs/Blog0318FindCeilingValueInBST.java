package org.giddap.dreamfactory.leetcode.blogs;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 *
 */
public class Blog0318FindCeilingValueInBST {
    public int findCeilingInBSTRecursive(TreeNode root, int key) {
        if (root == null) {
            throw new IllegalStateException("No value in BST is larger than the key.");
        }

        if (root.val > key) {
            if (root.left != null && root.left.val != key) {
                return findCeilingInBSTRecursive(root.left, key);
            } else {
                return root.val;
            }
        } else { // root.val <= key
            if (root.right != null) {
                return findCeilingInBSTRecursive(root.right, key);
            } else {
                throw new IllegalStateException("No value in BST is larger than the key.");
            }
        }
    }

    public int findCeilingInBSTIterative(TreeNode root, int key) {
        TreeNode ceiling = null;
        while (root != null) {
            if (root.val > key) {
                ceiling = root;
                root = root.left;
            } else { // root.val >= key
                root = root.right;
            }
        }

        if (ceiling == null) {
            throw new IllegalStateException("No value in BST is larger than the key.");
        } else {
            return ceiling.val;
        }
    }
}
