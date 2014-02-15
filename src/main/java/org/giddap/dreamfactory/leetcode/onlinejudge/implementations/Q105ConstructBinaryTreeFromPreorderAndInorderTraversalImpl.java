package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q105ConstructBinaryTreeFromPreorderAndInorderTraversal;

import java.util.Arrays;


public class Q105ConstructBinaryTreeFromPreorderAndInorderTraversalImpl implements Q105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    @Override
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (preorder.length != inorder.length) {
            throw new IllegalArgumentException("incorrect lengths");
        }

        final int len = preorder.length;

        if (len == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        int i = 0;
        while (inorder[i] != root.val) {
            i++;
        }

        if (i > 0) {
            root.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
        }

        if (i < len) {
            root.right = buildTree(Arrays.copyOfRange(preorder, i + 1, len), Arrays.copyOfRange(inorder, i + 1, len));
        }
        return root;
    }
}
