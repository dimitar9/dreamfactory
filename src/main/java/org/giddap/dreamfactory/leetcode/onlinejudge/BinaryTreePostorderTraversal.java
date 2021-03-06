package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * http://oj.leetcode.com/problems/binary-tree-postorder-traversal/
 * <p/>
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * <p/>
 * For example:
 * Given binary tree {1,#,2,3},
 * <p/>
 * <pre>
 * 1
 *  \
 *   2
 *  /
 * 3
 * </pre>
 * return [3,2,1].
 * <p/>
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public interface BinaryTreePostorderTraversal {
    List<Integer> postorderTraversal(TreeNode root);
}
