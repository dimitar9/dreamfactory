package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.FlattenBinaryTreeToLinkedList;

/**
 * Iterative approach without a stack.
 */
public class FlattenBinaryTreeToLinkedListIterativeWithoutStackImpl
        implements FlattenBinaryTreeToLinkedList {
    @Override
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                if (cur.right != null) { // if we need to prune a right subtree
                    TreeNode next = cur.left;
                    while (next.right != null) next = next.right;
                    next.right = cur.right;
                }
                cur.right = cur.left;
                cur.left = null;
            }
            cur = cur.right;
        }
    }
}
