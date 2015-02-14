package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ConstructBinaryTreeFromPreorderAndInorderTraversal;

import java.util.Arrays;

/**
 * Pre-order: root - left - right
 * In-order: left - root -right
 *
 * More efficient to use binary-search to find the matching index
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversalImpl
        implements ConstructBinaryTreeFromPreorderAndInorderTraversal {

    @Override
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        final int len = preorder.length;
        if (len != inorder.length) {
            throw new IllegalArgumentException(
                    "both arrays should have the same length.");
        }
        if (len == 0) {
            return null;
        }
        int rootVal = preorder[0];

        int i = 0;
        while (i < len && inorder[i] != rootVal) {
            i++;
        }

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1),
                              Arrays.copyOfRange(inorder, 0, i));
        root.right = buildTree(Arrays.copyOfRange(preorder, i + 1, len),
                               Arrays.copyOfRange(inorder, i + 1, len));
        return root;
    }
}
