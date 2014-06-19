package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.ArrayList;

/**
 * <a href="http://leetcode.com/onlinejudge#question_103">Q103 Binary Tree Zigzag Level Order Traversal</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right,
 * then right to left for the next level and alternate between).
 * <p/>
 * <pre>
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *
 *
 *      3
 *     / \
 *    9  20
 *       / \
 *      15  7
 * return its zigzag level order traversal as:
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 * </pre>
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/52/binary-tree-zigzag-level-order-traversal">Leetcode discussion</a>
 */
public interface Q103BinaryTreeZigzagLevelOrderTraversal {
    ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root);
}
