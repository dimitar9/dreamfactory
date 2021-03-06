package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * <a href="http://oj.leetcode.com/problems/path-sum/">Path Sum</a>
 * <p/>
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values
 * along the path equals the given sum.
 * <pre>
 * For example:
 * Given the below binary tree and sum = 22,
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * </pre>
 */
public interface PathSum {
    boolean hasPathSum(TreeNode root, int sum);
}
