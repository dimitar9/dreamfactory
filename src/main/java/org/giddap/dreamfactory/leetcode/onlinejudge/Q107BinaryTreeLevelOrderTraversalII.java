package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.ArrayList;

/**
 * <a href="http://leetcode.com/onlinejudge#question_107">Q107 Binary Tree Level Order Traversal II</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right,
 * level by level from leaf to root).
 * <p/>
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 * <p/>
 * <pre>
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * </pre>
 * return its bottom-up level order traversal as:
 * <p/>
 * <pre>
 * [
 * [15,7]
 * [9,20],
 * [3],
 * ]
 * </pre>
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/275/binary-tree-level-order-traversal-ii">Leetcode discussion</a
 */
public interface Q107BinaryTreeLevelOrderTraversalII {
    ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root);
}
