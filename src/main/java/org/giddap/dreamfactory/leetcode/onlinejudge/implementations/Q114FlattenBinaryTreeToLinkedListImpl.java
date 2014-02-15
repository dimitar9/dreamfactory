package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;


import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q114FlattenBinaryTreeToLinkedList;

public class Q114FlattenBinaryTreeToLinkedListImpl implements Q114FlattenBinaryTreeToLinkedList {
    @Override
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        TreeNode tmp = root.right;
        if (root.left != null) {
            root.right = root.left;
            TreeNode curr = root;
            while (curr != null && curr.right != null) {
                curr = curr.right;
            }
            curr.right = tmp;
            root.left = null;
        }

        flatten(tmp);
    }
}
