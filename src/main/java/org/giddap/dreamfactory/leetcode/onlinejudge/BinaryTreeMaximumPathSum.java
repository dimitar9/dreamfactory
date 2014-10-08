package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * <a href="http://oj.leetcode.com/problems/binary-tree-maximum-path-sum/">Binary Tree Maximum Path Sum</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a binary tree, find the maximum path sum.
 * <p/>
 * The path may start and end at any node in the tree.
 * <p/>
 * <pre>
 * For example:
 * Given the below binary tree,
 *
 *     1
 *    / \
 *   2   3
 * Return 6.
 * </pre>
 * <p/>
 *
 * http://n00tc0d3r.blogspot.com/2013/01/tree-path-sum.html
 */
public interface BinaryTreeMaximumPathSum {
    int maxPathSum(TreeNode root);
}
