package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.FlattenBinaryTreeToLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Iterative approach with a stack.
 *
 */
public class FlattenBinaryTreeToLinkedListIterativeWithStackImpl implements
        FlattenBinaryTreeToLinkedList {
    @Override
    public void flatten(TreeNode root) {
        Deque<TreeNode> rightNodes = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) { // need to move the left to the right
                if (cur.right != null) rightNodes.push(cur.right);
                cur.right = cur.left;
                cur.left = null;
            } else { // pop the previously stored 'right' node
                if (cur.right == null && !rightNodes.isEmpty()) {
                    cur.right = rightNodes.pop();
                }
            }
            cur = cur.right;
        }
    }
}
