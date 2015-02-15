package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.FlattenBinaryTreeToLinkedList;

/**
 * Recursive solution.
 *
 * Follow the pre-order traversal to move the left subtree to right.
 */
public class FlattenBinaryTreeToLinkedListImpl implements FlattenBinaryTreeToLinkedList {
    @Override
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null) {
            flatten(left);
            TreeNode tail = left;
            while (tail != null && tail.right != null) {
                tail = tail.right;
            }
            root.right = left;
            tail.right = right;
            root.left = null;
        }
        flatten(right);
    }
}
