package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q111MinimumDepthOfBinaryTree;

public class Q111MinimumDepthOfBinaryTreeImpl implements Q111MinimumDepthOfBinaryTree {
    @Override
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int ret = 0;
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            ret = minDepth(root.right);
        } else if (root.right == null) {
            ret = minDepth(root.left);
        } else {
            ret = Math.min(minDepth(root.left), minDepth(root.right));
        }
        return ret + 1;
    }
}
