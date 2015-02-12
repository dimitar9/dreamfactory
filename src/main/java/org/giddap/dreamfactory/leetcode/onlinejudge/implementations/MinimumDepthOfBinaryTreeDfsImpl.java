package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.MinimumDepthOfBinaryTree;

/**
 * Notes:
 * <ul>
 * <li>DFS bottom-up approach.</li>
 * <li>Recurse the tree by following the non-null child path.</li>
 * </ul>
 */
public class MinimumDepthOfBinaryTreeDfsImpl implements MinimumDepthOfBinaryTree {
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        final int left = minDepth(root.left);
        final int right = minDepth(root.right);
        if (left == 0 && right == 0) {
            return 1;
        } else if (left == 0 || right == 0) {
            return Math.max(left, right) + 1;
        } else {
            return Math.min(left, right) + 1;
        }
    }
}
