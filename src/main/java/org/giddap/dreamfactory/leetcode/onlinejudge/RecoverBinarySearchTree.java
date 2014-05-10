package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.leetcode.commons.TreeNode;

/**
 * <a href="http://oj.leetcode.com/problems/recover-binary-search-tree/">Recover Binary Search Tree</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * <p/>
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * <p/>
 * Recover the tree without changing its structure.
 * <p/>
 * Note:
 * A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/272/recover-binary-search-tree">Leetcode discussion</a>
 * @see <a href="http://n00tc0d3r.blogspot.com/2013/05/recover-binary-search-tree.html">
 * N00tC0d3r</a>
 */
public interface RecoverBinarySearchTree {
    void recoverTree(TreeNode root);
}
