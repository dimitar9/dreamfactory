package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.PathSum;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Iterative approach.
 * Need to augment the data structure to store the current sum.
 */
public class PathSumIterativeImpl implements PathSum {
    @Override
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        Deque<TreeNodeWithSum> remainingNodes = new ArrayDeque<>();
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
