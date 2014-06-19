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
 * @see <a href="http://discuss.leetcode.com/questions/288/binary-tree-maximum-path-sum">Leetcode discussion</a>
 * @see <a href="http://www.mitbbs.com/article_t1/JobHunting/32254243_0_1.html">Mitbbs discussion #1</a>
 * @see <a href="http://www.mitbbs.com/article3/JobHunting/32269009_3_tp.html">Mitbbs discussion #2</a>
 */
public interface Q124BinaryTreeMaximumPathSum {
    int maxPathSum(TreeNode root);
}
