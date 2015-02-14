package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * http://oj.leetcode.com/problems/path-sum-ii/
 * <p/>
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * <p/>
 * <pre>
 * For example:
 * Given the below binary tree and sum = 22,
 *          5
 *         / \
 *        4   8
 *       /   / \
 *      11  13  4
 *     / \     / \
 *    7   2   5   1
 * return
 *
 * [
 *   [5,4,11,2],
 *   [5,8,4,5]
 * ]
 * </pre>
 */
public interface PathSumII {
    List<List<Integer>> pathSum(TreeNode root, int sum);
}
