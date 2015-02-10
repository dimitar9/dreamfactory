package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * <a href="http://oj.leetcode.com/problems/validate-binary-search-tree">Q098 Validate Binary Search Tree</a>
 * <p/>
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * <p/>
 * Assume a BST is defined as follows:
 * <p/>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * <p/>
 * OJ's Binary Tree Serialization:
 * The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no
 * node exists below.
 * <p/>
 * Here's an example:
 * <p/>
 * <pre>
 *     1
 *    / \
 *   2   3
 *      /
 *      4
 *       \
 *       5
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
 * </pre>
 * <p/>
 *
 * http://n00tc0d3r.blogspot.com/search?q=validate+binary+search+tree
 */
public interface ValidateBinarySearchTree {
    boolean isValidBST(TreeNode root);
}
