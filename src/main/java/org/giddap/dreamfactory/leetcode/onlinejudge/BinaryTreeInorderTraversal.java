package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.List;

/**
 * <a href="http://oj.leetcode.com/problems/binary-tree-inorder-traversal/">Binary Tree In-Order Traversal</a>
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
 */
public interface BinaryTreeInorderTraversal {
    List<Integer> inorderTraversal(TreeNode root);
}
