package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * https://oj.leetcode.com/problems/balanced-binary-tree/
 * <p/>
 * Given a binary tree, determine if it is height-balanced.
 * <p/>
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 */
public interface BalancedBinaryTree {
    boolean isBalanced(TreeNode root);
}
