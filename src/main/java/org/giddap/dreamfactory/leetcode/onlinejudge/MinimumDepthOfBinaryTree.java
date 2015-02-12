package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * <a href="http://oj.leetcode.com/problems/minimum-depth-of-binary-tree/">Minimum Depth of Binary Tree</a>
 * <p/>
 * Given a binary tree, find its minimum depth.
 * <p/>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/277/minimum-depth-of-binary-tree">Leetcode discussion</a>
 * @see <a href="http://n00tc0d3r.blogspot.com/2013/04/minimum-depth-of-binary-tree.html">N00tc0d3r</a>
 */
public interface MinimumDepthOfBinaryTree {
    int minDepth(TreeNode root);
}
