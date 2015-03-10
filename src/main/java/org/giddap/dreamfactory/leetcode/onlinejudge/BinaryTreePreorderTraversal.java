package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.List;

/**
 * http://oj.leetcode.com/problems/binary-tree-preorder-traversal/
 * <p>
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <pre>
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *  \
 *   2
 *  /
 * 3
 * return [1,2,3].
 * </pre>
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public interface BinaryTreePreorderTraversal {
    List<Integer> preorderTraversal(TreeNode root);
}
