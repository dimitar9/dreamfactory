package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.ArrayList;

/**
 * <a href="http://oj.leetcode.com/problems/binary-tree-level-order-traversal/">Binary Tree Level Order Traversal</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * <p/>
 * <pre>
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * </pre>
 * <p/>
 *
 * @see <a href="http://leetcode.com/2010/09/printing-binary-tree-in-level-order.html">leetcode blog</a>
 * @see <a href="http://discuss.leetcode.com/questions/49/binary-tree-level-order-traversal">leetcode discussion</a>
 */
public interface Q102BinaryTreeLevelOrderTraversal {
    ArrayList<ArrayList<Integer>> levelOrder(TreeNode root);
}
