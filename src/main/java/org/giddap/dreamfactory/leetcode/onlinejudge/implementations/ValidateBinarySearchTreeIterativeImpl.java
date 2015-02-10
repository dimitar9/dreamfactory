package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ValidateBinarySearchTree;

import java.util.*;

/**
 * In-order traversal with a stack.
 *
 * Time: O(n); Space: O(n)
 * Iterate through the binary tree in in-order traversal with a stack:
 * Use a 'prevVal' to track previous value and compare it with current value
 * to validate the binary search tree.
 */
public class ValidateBinarySearchTreeIterativeImpl implements ValidateBinarySearchTree {
    @Override
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        Deque<TreeNode> pending = new ArrayDeque<>();

        long prevVal = ((long) Integer.MIN_VALUE) - 1;
        TreeNode curr = root;

        while (!pending.isEmpty() || curr != null ) {
            if (curr != null) {
                pending.push(curr);
                curr = curr.left;
            } else {
                TreeNode node = pending.pop();
                if (node.val <= prevVal) {
                    return false;
                } else {
                    prevVal = node.val;
                }
                curr = node.right;
            }
        }
        return true;
    }
}
