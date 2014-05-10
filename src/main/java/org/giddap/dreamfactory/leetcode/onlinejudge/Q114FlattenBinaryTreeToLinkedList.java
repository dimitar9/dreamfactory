package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * http://oj.leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * <p/>
 * Given a binary tree, flatten it to a linked list in-place.
 * <p/>
 * <pre>
 * For example,
 * Given
 *
 *      1
 *     / \
 *    2   5
 *   / \   \
 *  3   4   6
 * The flattened tree should look like:
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 * Hints:
 * If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order
 * traversal.
 * </pre>
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/280/flatten-binary-tree-to-linked-list
 */
public interface Q114FlattenBinaryTreeToLinkedList {
    void flatten(TreeNode root);
}
