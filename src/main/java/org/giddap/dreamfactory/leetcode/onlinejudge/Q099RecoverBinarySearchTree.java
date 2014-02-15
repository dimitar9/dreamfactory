package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.TreeNode;

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
 * @see <a href="http://www.mitbbs.com/article_t/JobHunting/32317597.html">Mitbbs discussion</a>
 * @see <a href="http://fisherlei.blogspot.com/2012/12/leetcode-recover-binary-search-tree.html">
 *      A solution based on 'Threaded Binary Tree'</a>
 */
public interface Q099RecoverBinarySearchTree {
    void recoverTree(TreeNode root);
}
