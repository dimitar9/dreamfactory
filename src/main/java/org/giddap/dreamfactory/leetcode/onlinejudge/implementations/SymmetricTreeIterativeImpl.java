package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.SymmetricTree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTreeIterativeImpl implements SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) {
            return true;
        }

        Queue<TreeNode> leftPending = new LinkedList<TreeNode>();
        leftPending.offer(root.left);
        int leftLevelNodeCount = 1;
        Queue<TreeNode> rightPending = new LinkedList<TreeNode>();
        rightPending.offer(root.right);
        int rightLevelNodeCount = 1;

        while (!leftPending.isEmpty() && !rightPending.isEmpty()) {
            TreeNode left = leftPending.poll();
            leftLevelNodeCount--;
            TreeNode right = rightPending.poll();
            rightLevelNodeCount--;

            if (leftLevelNodeCount != rightLevelNodeCount) {
                return false;
            }

            if (left == null && right == null) {
                continue;
            }

            if ((left == null || right == null)) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }

            leftPending.offer(left.left);
            rightPending.offer(right.right);
            leftPending.offer(left.right);
            rightPending.offer(right.left);

            if (leftLevelNodeCount == 0) {
                leftLevelNodeCount = leftPending.size();
                rightLevelNodeCount = rightPending.size();
            }
        }
        return true;
    }
}
