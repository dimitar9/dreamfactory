package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.RecoverBinarySearchTree;

import java.util.Stack;

/**
 * 弼馬溫注解：
 * Time complexity: O(n)
 * Space complexity: O
 */
public class RecoverBinarySearchTreeIterativeWithStackImpl implements
        RecoverBinarySearchTree {
    @Override
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode small = null;
        TreeNode large = null;

        TreeNode prev = null;
        TreeNode curr = root;

        Stack<TreeNode> explorer = new Stack<TreeNode>();
        while (!explorer.isEmpty() || curr != null) {
            if (curr != null) {
                explorer.push(curr);
                curr = curr.left;
            } else {
                TreeNode tmp = explorer.pop();
                if (prev != null) {
                    if (prev.val > tmp.val) {
                        small = tmp;
                        if (large == null) {
                            large = prev;
                        }
                    }
                }
                prev = tmp;
                curr = tmp.right;
            }
        }

        if (small != null) {
            int tmp = small.val;
            small.val = large.val;
            large.val = tmp;
        }
    }
}
