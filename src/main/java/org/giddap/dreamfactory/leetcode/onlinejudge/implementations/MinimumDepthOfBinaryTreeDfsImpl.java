package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.MinimumDepthOfBinaryTree;

/**
 * Notes:
 * <ul>
 *     <li>DFS bottom-up approach.</li>
 *     <li>Recurse the tree by following the non-null child path.</li>
 * </ul>
 */
public class MinimumDepthOfBinaryTreeDfsImpl implements MinimumDepthOfBinaryTree {
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int depth = Integer.MAX_VALUE;
        if (root.left != null) {
            depth = Math.min(depth, minDepth(root.left));
        }
        if (root.right != null) {
            depth = Math.min(depth, minDepth(root.right));
        }
        return depth + 1;
    }
}
