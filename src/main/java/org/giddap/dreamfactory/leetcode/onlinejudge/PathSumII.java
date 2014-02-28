package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.TreeNode;

import java.util.ArrayList;

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
 * <p/>
 * Links:
 * http://discuss.leetcode.com/questions/279/path-sum-ii
 * http://gongxuns.blogspot.com/2012/12/leetcodepermutations-ii_13.html
 * http://fisherlei.blogspot.com/2012/12/leetcode-path-sum-ii.html
 */
public interface PathSumII {
    ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum);
}
