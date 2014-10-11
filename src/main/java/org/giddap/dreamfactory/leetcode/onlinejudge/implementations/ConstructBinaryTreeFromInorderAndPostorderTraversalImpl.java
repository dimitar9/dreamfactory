package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.ConstructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.Arrays;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalImpl implements ConstructBinaryTreeFromInorderAndPostorderTraversal {

    @Override
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        if (len != postorder.length) {
            throw new IllegalArgumentException("arrays should have the same size.");
        }
        if (len == 0) {
            return null;
        }

        // find the index to the root value
        int rootVal = postorder[len - 1];
        int i = 0;
        while (i < len && inorder[i] != rootVal) {
            i++;
        }
        int rootIndex = i;

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(Arrays.copyOfRange(inorder, 0, rootIndex),
                Arrays.copyOfRange(postorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(inorder, rootIndex + 1, len),
                Arrays.copyOfRange(postorder, rootIndex, len - 1));
        return root;
    }
}
