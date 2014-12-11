package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * Given a binary tree where all the right nodes are either leaf nodes with
 * a sibling (a left node that shares the same parent node) or empty, flip
 * it upside down and turn it into a tree where the original right nodes
 * turned into left leaf nodes. Return the new root.
 * <p/>
 * <pre>
 * For example:
 * Given a binary tree {1,2,3,4,5},
 *        1
 *       / \
 *      2   3
 *     / \
 *    4   5
 * return the root of the binary tree [4,5,2,#,#,3,1].
 *        4
 *       / \
 *      5   2
 *         / \
 *        3   1
 * </pre>
 */
public interface BinaryTreeUpsideDown {
    TreeNode upsideDownBinaryTree(TreeNode root);
}

