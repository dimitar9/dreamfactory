package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q106ConstructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.Arrays;

public class Q106ConstructBinaryTreeFromInorderAndPostorderTraversalImpl implements Q106ConstructBinaryTreeFromInorderAndPostorderTraversal {

    @Override
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (inorder.length != postorder.length) {
            throw new IllegalArgumentException("incorrect lengths!");
        }

        final int len = inorder.length;

        if (len == 0) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[len - 1]);
        int rootIdxInInorder = 0;
        while (inorder[rootIdxInInorder] != root.val) {
            rootIdxInInorder++;
        }

        root.left = buildTree(Arrays.copyOfRange(inorder, 0, rootIdxInInorder),
                Arrays.copyOfRange(postorder, 0, rootIdxInInorder));
        root.right = buildTree(Arrays.copyOfRange(inorder, rootIdxInInorder + 1, len),
                Arrays.copyOfRange(postorder, rootIdxInInorder, len - 1));

        return root;
    }
}
