package org.giddap.dreamfactory.leetcode.onlinejudge.implementations;

import org.giddap.dreamfactory.commons.TreeNode;
import org.giddap.dreamfactory.leetcode.onlinejudge.Q099RecoverBinarySearchTree;

public class Q099RecoverBinarySearchTreeImpl implements Q099RecoverBinarySearchTree {

    private TreeNode prev;

    @Override
    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        TreeNode[] pair = new TreeNode[2];
        prev = null;
        findPair(root, pair);
        if (pair[0] != null && pair[1] != null) {
            int tmp = pair[0].val;
            pair[0].val = pair[1].val;
            pair[1].val = tmp;
        }
    }

    private void findPair(TreeNode node, TreeNode[] pair) {
        if (node == null) {
            return;
        }

        // left subtree
        findPair(node.left, pair);

        if (prev != null && node.val < prev.val) {
            pair[1] = node;
            if (pair[0] == null) {
                pair[0] = prev;
            }
        }
        prev = node;

        // right subtree
        findPair(node.right, pair);
    }
}
