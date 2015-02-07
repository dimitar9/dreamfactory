package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/binary-tree-inorder-traversal/">Binary Tree In-Order Traversal</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * <p/>
 * Given a binary tree, return the in-order traversal of its nodes' values.
 * <p/>
 * <pre>
 * For example:
 * Given binary tree {1,#,2,3},
 *
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,3,2].
 * </pre>
 * <p/>
 * Note: Recursive solution is trivial, could you do it iteratively?
 * <p/>
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/23/binary-tree-inorder-traversal">Leetcode discussion</a>
 * @see <a href="http://leetcode.com/2010/04/binary-search-tree-in-order-traversal.html">Leetcode blog</a>
 * @see <a href="http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/">Geeksforgeeks blog</a>
 * http://en.wikipedia.org/wiki/Threaded_binary_tree
 * http://www.eternallyconfuzzled.com/tuts/datastructures/jsw_tut_bst1.aspx#thread
 */
public interface BinaryTreeInorderTraversal {
    List<Integer> inorderTraversal(TreeNode root);
}
