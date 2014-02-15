package org.giddap.dreamfactory.leetcode.onlinejudge;

import org.giddap.dreamfactory.commons.TreeNode;

/**
 * <a href="http://oj.leetcode.com/problems/sum-root-to-leaf-numbers/">Sum Root To Leaf Numbers</a>
 * <p/>
 * Copyright 2013 LeetCode
 * <p/>
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * <p/>
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * <p/>
 * Find the total sum of all root-to-leaf numbers.
 * <p/>
 * <pre>
 * For example,
 *
 *     1
 *    / \
 *   2   3
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 *
 * Return the sum = 12 + 13 = 25.
 * </pre>
 * <p/>
 *
 * @see <a href="http://discuss.leetcode.com/questions/1189/sum-root-to-leaf-numbers">Leetcode discussion</a>
 * @see <a href="http://blog.sina.com.cn/s/blog_b9285de20101iv6l.html">Blog from peking2</a>
 */
public interface Q129SumRootToLeafNumbers {
    int sumNumbers(TreeNode root);
}
