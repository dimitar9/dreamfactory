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

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (right == 0) {
            return left + 1;
        }
        if (left == 0) {
            return right + 1;
        }
        return Math.min(left, right) + 1;
    }
}
