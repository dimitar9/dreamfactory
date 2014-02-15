package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.MinimumDepthOfBinaryTree;

/**
 * DFS with pruning.
 *
 * Use a variable to store the current 'minDepth'. If the depth of the next
 * level is not less than the 'current min depth', we prune that branch.
 */
public class MinimumDepthOfBinaryTreeDfsWithPruningImpl implements MinimumDepthOfBinaryTree {
    @Override
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        minDepth = Integer.MAX_VALUE;
        finMinDepth(root, 0);
        return minDepth;
    }

    private int minDepth = Integer.MAX_VALUE;

    public void finMinDepth(TreeNode root, final int currDepth) {
        if (root == null) {
            return;
        }
        final int newDepth = currDepth + 1;

        if (root.left == null && root.right == null) {
            minDepth = Math.min(minDepth, newDepth);
            return;
        }

        if (newDepth < minDepth) {
            if (root.left != null) {
                finMinDepth(root.left, newDepth);
            }

            if (root.right != null) {
                finMinDepth(root.right, newDepth);
            }
        }
    }
}
