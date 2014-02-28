package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PathSum;

import java.util.Stack;

public class PathSumIterativeImpl implements PathSum {
    @Override
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) {
            return false;
        }

        Stack<TreeNodeWithSum> remainingNodes = new Stack<TreeNodeWithSum>();
        remainingNodes.push(new TreeNodeWithSum(root, root.val));

        while (!remainingNodes.isEmpty()) {
            TreeNodeWithSum treeNodeWithSum = remainingNodes.pop();
            TreeNode curr = treeNodeWithSum.node;
            Integer actualSum = treeNodeWithSum.sum;
            TreeNode left = curr.left;
            TreeNode right = curr.right;

            if (left == null && right == null && actualSum == sum) {
                return true;
            }

            if (left != null) {
                remainingNodes.push(new TreeNodeWithSum(left, actualSum + left.val));
            }

            if (right != null) {
                remainingNodes.push(new TreeNodeWithSum(right, actualSum + right.val));
            }

        }

        return false;
    }

    private static class TreeNodeWithSum {
        TreeNode node;
        Integer sum;

        private TreeNodeWithSum(TreeNode node, Integer sum) {
            this.node = node;
            this.sum = sum;
        }
    }
}
