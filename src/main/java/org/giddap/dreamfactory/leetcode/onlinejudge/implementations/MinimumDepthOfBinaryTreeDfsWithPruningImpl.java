package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.MinimumDepthOfBinaryTree;

/**
 * DFS with pruning.
 * <p/>
 * Use a variable to store the 'current min depth'. If the depth of the next
 * level is not less than the 'current min depth', we prune that branch.
 */
public class MinimumDepthOfBinaryTreeDfsWithPruningImpl implements MinimumDepthOfBinaryTree {
    @Override
    public int minDepth(TreeNode root) {
        return finMinDepth(root, 0, Integer.MAX_VALUE);
    }

    private int finMinDepth(TreeNode root, final int depth, int minDep) {
        if (root == null || depth >= minDep) {
            return depth;
        }

        if (root.left == null && root.right == null) {
            return depth + 1;
        }

        if (depth < minDep) {
            if (root.left != null) {
                minDep = Math.min(minDep,
                        finMinDepth(root.left, depth + 1, minDep));
            }

            if (root.right != null) {
                minDep = Math.min(minDep,
                        finMinDepth(root.right, depth + 1, minDep));
            }
        }

        return minDep;
    }
}
