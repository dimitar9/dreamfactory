package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.RecoverBinarySearchTree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * In-order traversal with a stack
 * Time: O(n); Space: O(n)
 */
public class RecoverBinarySearchTreeIterativeWithStackImpl implements
        RecoverBinarySearchTree {
    @Override
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }

        Deque<TreeNode> pending = new ArrayDeque<>();
        TreeNode small = null;
        TreeNode large = null;

        TreeNode pre = null;
        TreeNode curr = root;
        while (!pending.isEmpty() || curr != null) {
            if (curr != null) {
                pending.push(curr);
                curr = curr.left;
            } else {
                TreeNode node = pending.pop();
                if (pre != null) {
                    if (pre.val > node.val) {
                        small = node;
                        if (large == null) {
                            large = pre;
                        }
                    }
                }
                pre = node;
                curr = node.right;
            }
        }

        // swap value
        if (small != null) {
            int tmp = small.val;
            small.val = large.val;
            large.val = tmp;
        }
    }
}
